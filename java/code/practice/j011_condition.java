package practice;
// Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.

import java.util.Scanner;

public class j011_condition {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = in.nextInt();

        while(n != 1){
            if(n%2 == 0){
                n = n/2;
                // System.out.println("even: " + n);  //uncomment
            }
            else {
                n = n*3;
                n++;
                // System.out.println("odd: " + n);  //uncomment
            }
        }
        System.out.println("Final: " + n);
        in.close();
    }
}
