package code;

import java.util.Scanner;

public class j012_conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();

        if(a>10){
            System.out.println("block: 1");
        }
        else if(a<10){
            System.out.println("block: 2");
        }
        else {
            System.out.println("block: 3");
        }
        in.close();
    }
}
