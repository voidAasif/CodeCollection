package practice;

// Write a Java program to take the last three characters from a given string.
// It will add the three characters at both the front and back of the string. String length must be greater than three and more.
// Test data: "Python" will be "honPythonhon"
// Sample Output:
// honPythonhon

import java.util.Scanner;

public class j009_lastThreeCh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputWord = in.next();
        
        int length = inputWord.length();

        char last1 = inputWord.charAt(length - 1);
        char last2 = inputWord.charAt(length - 2);
        char last3 = inputWord.charAt(length - 3);

        System.out.println(last3 +""+ last2 +""+ last1 +""+ inputWord +""+ last3 +""+ last2 +""+ last1);

        System.out.println();

        
        

        // System.out.println(last1);

        in.close();
    }
}
