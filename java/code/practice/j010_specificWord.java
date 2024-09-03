package practice;
// Write a Java program to check if a string starts with a specified word.
// Sample Data: string1 = "Hello how are you?"
// Sample Output:

// true

// specific word = Sir;

import java.util.Scanner;

public class j010_specificWord {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine();  // input string;
        sentence = sentence.toLowerCase(); // conver string into lower case;

        boolean B = false;       // bool value

        if(sentence.startsWith("sir")){  // if start with sir set B as true;
            B = true;
        }

        System.out.println(B);

        in.close();
    }
}
