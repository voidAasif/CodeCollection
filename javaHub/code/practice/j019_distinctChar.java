package practice;
// Write a Java program to check if a given string has all distinct characters.
// Sample Output: Original String : xyyz
// String has all unique characters: false

import java.util.Scanner;
public class j019_distinctChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();
        boolean flag = true;
        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i) == word.charAt(i+1)){
                flag = false;
            }
        }
        System.out.println(flag);
        in.close();
    }
}
