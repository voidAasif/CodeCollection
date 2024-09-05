package code;

import java.util.Scanner;
public class j004_templet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.println("Hello! " + name + " ?How are you?");
        input.close();
    }
}