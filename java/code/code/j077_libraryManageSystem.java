package java.code.code;// ques: 104, ans: 113;

import java.util.ArrayList;
import java.util.Scanner;

//Create a LMS which is capable of issuing books to the students.
//book should have info like:
//1. Book name
//2. Book Author
//3. Issued to
//4. Issued on
//user should be able to add books, return issued books, issue books.
//Assume that all the users are registered with their names in the central database;

public class j077_libraryManageSystem {
    public static void main(String[] args) {
        System.out.println("Library Management System");

        Scanner in = new Scanner(System.in);

        int maxUser = 5; // for case 1;  // max user account;
        int count = 0; // for case 1;  // count the users;

        String[] arrUserName = new String[maxUser];  // user names;

        for (int i = 0; i < arrUserName.length; i++) { // initialize user array;
            arrUserName[i] = "***";
        }

        int[] arrPin = new int[maxUser];  // pin array;

        while (true) {
            System.out.println("*************************");
            System.out.println("1. Sign-up");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("*************************");
            System.out.print("Enter: ");
            int choice = in.nextInt();
            if(choice == 3){
                System.out.println("| Thanks for using |");
                break;
            }

            switch (choice) {
                case 1: // add user;

                    if (count < maxUser) { //check array index;

                        System.out.print("UserName: ");
                        in.nextLine();
                        String userName = in.nextLine(); // input user name;

                        System.out.print("Make Pin: ");
                        int pin = in.nextInt(); // input user's pin;

                        arrUserName[count] = userName; // store userName and pin at same index of different array;
                        arrPin[count++] = pin;

                        System.out.println("| Done |");  // user is added;
                    } else {
                        System.out.println("| Full, Unable to create new user |");  // login is full;
                    }
                    break;

                case 2: // login;
                    System.out.print("UserName: ");
                    in.nextLine();
                    String userName = in.nextLine();  //enter userName for login;

                    System.out.print("Pin: ");
                    int pin = in.nextInt();  // enter pin for login;

                    int userVari = -1;  // used to verify is arrUserName array contain username;
                    int pinVari = -2;  // used to verify is arrPin array contain pin;

                    for (int i = 0; i < arrUserName.length; i++) {  // iterate userName array;
                        if (arrUserName[i].equals(userName)) { // compare strings(if element at 'i' index is equal to userName);
                            userVari = i;  // set userVari = index of userName;
                        }
                    }

                    for (int i = 0; i < arrPin.length; i++) { // same as userName(for pin);
                        if (arrPin[i] == pin) {
                            pinVari = i;
                        }
                    }

                    if (userVari == pinVari) {  // if userName and userPin index is same (so userName and userPin is match);
                        System.out.println("| Login successful |");

                        ArrayList<String> bookName = new ArrayList<>(); //arrayList to store list of books;
                        ArrayList<String> issueBook = new ArrayList<>(); // arrayList to store issue books and user name;

                        while (true) {
                            System.out.println("*******************");
                            System.out.println("| Available Books in Lib |");
                            System.out.println("*******************");
                            for (String ele : bookName) { // print list of books;
                                System.out.println(ele);
                            }
                            System.out.println("*******************");

                            System.out.println("1. Add Book");
                            System.out.println("2. Issue Book");
                            System.out.println("3. Return Book");
                            System.out.println("4. *Book Records");
                            System.out.println("5. LogOut");

                            System.out.print("Enter: ");
                            int opr = in.nextInt();
                            if(opr == 5){
                                System.out.println("*******************");
                                System.out.println("| Logging out |");
                                System.out.println("*******************");
                                break;  //logout;
                            }
                            switch (opr) {
                                case 1: // add book;

                                    System.out.println("Enter Book Name: "); 
                                    in.nextLine(); // absorb new line character;

                                    int i = 1;  // to count number of books;
                                    while (true) {  //while true;
                                        String book = in.nextLine();  // input book name (add);

                                        if (book.equals("$")) {  // if user input $ then stop adding the book into ArrayList;
                                            break;
                                        }

                                        bookName.add(book.toUpperCase()); // add book into ArrayList (upperCase);
                                        System.out.println((i++) + ". [" + book.toUpperCase() + "] <== New Book Added: ");

                                    }
                                    System.out.println("*******************");
                                    break;

                                case 2: // issue book;
                                    System.out.println("Enter Book Name you want to issue: ");
                                    while (true) {
                                        String book = in.nextLine(); // input book name;

                                        if (book.equals("$")) { //terminate while loop;
                                            break;
                                        }
                                        if(bookName.contains(book.toUpperCase())){  // if book is in bookName array then user allow to issue book from lib;
                                            issueBook.add(book.toUpperCase() + " ==> " + arrUserName[userVari]); //store book name with user name into issueBook array;
                                            bookName.remove(book.toUpperCase()); // remove book from bookName array;
                                        }
                                    }
                                    System.out.println("*******************");
                                    System.out.println("| Opreation Successful |");
                                    System.out.println("*******************");
                                    break;

                                case 3:  // return book;
                                    System.out.println("Enter Book name you want to Return: "); 
                                    while(true){
                                        String book = in.nextLine(); //input book name;
                                        
                                        if(book.equals("$")){ //terminate while loop;
                                            break;
                                        }

                                        if(issueBook.contains(book.toUpperCase() + " ==> " + arrUserName[userVari])){ // if issueBook array has element (string => book+userName);
                                            bookName.add(book.toUpperCase()); // add book name into bookName array (lib);
                                            issueBook.remove(book.toUpperCase() + " ==> " + arrUserName[userVari]); // remove book from issue array;
                                        }
                                    }
                                    System.out.println("*******************");
                                    System.out.println("| Book Returned |");
                                    System.out.println("*******************");
                                    break;

                                case 4:  // book records, history;
                                    System.out.println("*******************");
                                    for(String ele: issueBook){
                                        System.out.println(ele);
                                    }
                                    System.out.println("*******************");
                                    break;
                            

                                default:
                                    System.out.println("| Invalid Operation |");
                                    break;
                            }
                        }

                    } else {
                        System.out.println("| Please enter valid UserName and Pin |");
                    }
                    break;

                default:
                    System.out.println("| Invalid Input |");
            }
        }
        in.close();
    }
}
//end;