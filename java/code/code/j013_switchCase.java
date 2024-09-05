package java.code.code;

import java.util.Scanner;
public class j013_switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

//traditional switch
        switch (a){
            case 1:
            System.out.println("case: 1");
            break;

            case 2:
            System.out.println("case: 2");
            break;

            default: 
            System.out.println("default");
        }
//inhance switch (java ver 14)
        in.close();
    }
}
