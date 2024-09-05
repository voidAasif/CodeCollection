package code;

import java.util.Scanner;

public class j002_input {
    public static void main (String[] args ){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        System.out.println(a);

        inp.nextLine(); // consume next line char;

        String str = inp.nextLine();
        System.out.println(str);
        inp.close();
    }
}