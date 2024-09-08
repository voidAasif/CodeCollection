package practice;
//Write a Java program to reverse a word.

import java.util.Scanner;

public class j008_reverseStr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inputWord = in.next();

        char[] arr = new char[10];

        for(int i=0; i<arr.length; i++){
            if(i < inputWord.length()){
                arr[i] = inputWord.charAt(i); 
            }
        }

        char temp;
        int j = arr.length - 1;
        for(int i=0; i<arr.length/2; i++){  // reverse the array;
            temp = arr[i];         // swap
            arr[i] =  arr[j - i];
            arr[j - i] = temp;
        }

        for(char ele: arr){
            System.out.print(ele);
        }

        in.close();
    }
}
