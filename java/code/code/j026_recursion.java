package java.code.code;

import java.util.Scanner;
public class j026_recursion {

    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int f = in.nextInt();
        System.out.println("Fact* of n ==> "+ fact(f));
        in.close();
    }
}