package code;

import java.util.Scanner;
public class j006_encryptDecrypt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you grade: ");
        char grade = in.next().charAt(0);
        //Encrypt
        grade = (char)(grade + 8);
        System.out.println("Encrypt--> " +grade);
        //Decrypt
        grade = (char)(grade - 8);
        System.out.println("Decrypt--> " +grade);
        in.close();
    }
}
