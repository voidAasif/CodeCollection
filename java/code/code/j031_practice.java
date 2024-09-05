package java.code.code;

import java.util.Scanner;
public class j031_practice {
    public static void main(String[] args) {
        //Write a program which take two int input and sum of int is 10;
        Scanner in = new Scanner(System.in);
        while(true){
           System.out.print("Enter the value of a: ");
           int a = in.nextInt();
           System.out.print("Enter the value of b: ");
           int b = in.nextInt();
           
           if((a+b) == 10){
            System.out.println("Sum of a and b is 10" + " {OK}");
            break;
           }
           else{
            System.out.println("Sum of a and b is " + (a+b) + "{Try Again}");
           }
        }
        in.close();
    }
}
