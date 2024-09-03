package code;
import java.util.Scanner;

//#1
// write a java program to demonstrate syntax, logical and runtime errors;
//syntax error => int a == 5;
//logical error => 1000 / 3 = half;
//runtime error => 5/0;

//#2
//Write a java program that prints "HaHa" during Arithmetic exception and
//"HeHe" durnig an Illegal argument exception;

//#3,4,5
//Write a program that allows you to keep accessing an array until a valid index is given.
// If max retries exceed 5 print "Error";

//Modify program in #3 to throw a custom exception if max retries are reached;

//Wrap the program in #3 inside a method which throws your custom exception;

class customExc extends Exception {
    @Override
    public String toString(){
        return "Custom error";
    }
}



public class j066_practice86 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //#2
        // try{
        //     System.out.print("Enter the value of a: ");
        //     int a = in.nextInt();
        //     System.out.print("Enter the value of b: ");
        //     int b = in.nextInt();
        //     in.close();
        //     if(b<0){
        //         throw new IllegalArgumentException();
        //     }
        //     System.out.println(a/b);

        // }
        // catch(ArithmeticException e){
        //     System.out.println("HaHa");
        // }  
        // catch(IllegalArgumentException e){
        //     System.out.println("HiHi");
        // }   
        
        //#3,4,5

        int[] arr = new int[3];  //define array;
        arr[0] = 10;
        arr[1] = 100;
        arr[2] = 1000;
        
        int count = 1; 
        boolean flag = true;

        while(flag){ //while true;
            try{
                System.out.print("Enter the index: ");
                int index = in.nextInt();
                System.out.println("Element: " + arr[index]); //input index and print element;
            }
            catch(Exception e){  // if index exceed;

                if(count>=5){  // when incorrect 5 attempt (run only one time then terminate the while loop);

                    try{
                        throw new customExc();  //for custom exception;
                    }
                    catch(Exception ce){
                        System.out.println(ce);  // print custom exception;
                        flag = false; // break the while loop;
                    }
                }
                
                System.out.println("Attempt left: " + (5-count)); //print left attempt;
                count++;  // count the attempt;
            }
        }
    in.close();
    }
}
