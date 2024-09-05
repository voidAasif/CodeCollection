package code;

import java.util.Scanner;

public class j009_stringIndex {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        System.out.println(str.charAt(8));
        in.close();
    }
}