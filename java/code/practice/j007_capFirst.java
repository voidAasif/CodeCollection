package practice;
//Write a Java program to capitalize the first letter of each word in a sentence;

//#1

import java.util.Scanner;

public class j007_capFirst{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                
        System.out.print("Enter the sentence: ");   // enter sentence;
        String sentence = in.nextLine();

        int[] arrAscii = new int[100];  //store ascii value;
        char[] arrCh = new char[100];  //to convert ascii to char;


        for(int i=0; i<sentence.length(); i++){
            arrAscii[i] = sentence.charAt(i); // store sentene into array(ascii);
        }

        arrAscii[0] = arrAscii[0] - 32;   // cap first char of sentence;

        for(int i=0; i<arrAscii.length; i++){
            if(arrAscii[i] == 32){  //if space occur;
                arrAscii[i+1] = arrAscii[i+1] - 32;  //cap char next to space;
            }
        }

        for(int i=0; i<arrCh.length; i++){
            arrCh[i] = (char) arrAscii[i];  // convert ascii into char;
            System.out.print(arrCh[i]);
        }

        System.out.println(); //new line;
        in.close();
    }
}

//incomplete
//#2

// import java.util.Scanner;

// public class j007_capFirst {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);

//         System.out.print("Enter the sentence: ");   // enter sentence;
//         String sentence = in.nextLine();

//         int ascii;                                  // to store ascii value of char;
//         char ch;                                    //to convert ascii to char;
//         for(int i=0; i<sentence.length(); i++){     // 0 to length of sentence;
//             // System.out.println("out: " + i);
//             if(sentence.charAt(i) == ' '){          // if char == space;
//                 // System.out.println("in: " + i);

//                 ascii = sentence.charAt(i+1);       //ascii = char after space
//                 ascii = ascii - 32;                 // to upper case;
//                 ch = (char) ascii;                  //convert ascii to char;
//                 sentence = sentence.replace(sentence.charAt(i+1), ch); //replace char after space with ch;

//                 // System.out.println("loop: " + sentence);
//             }
//         }
//         System.out.println("final" + sentence);  // print output;

//         in.close();
//     }
// }
