package java.code.code;

import java.util.Random;
import java.util.Scanner;

public class j022_RPSgame {
    public static void main(String[] args) {

        int min = 1;
        int max = 3;
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        do {

            int ran = random.nextInt(max - min + 1) + min;
             System.out.println(ran);

            System.out.println("-----------------------");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Sciessor");
            System.out.println("4. Exit");
            System.out.println("-----------------------");

            System.out.print("Enter: ");
            int choice = in.nextInt();

            if(choice>3){
                break;
            }
            if (choice == ran) {
                System.out.println("<--------Tie-------->");
            } else if (((ran == 1) && (choice == 2)) || ((ran == 2) && (choice == 3))
                    || ((ran == 3) && (choice == 1))) {
                System.out.println("<--------You Win-------->");
            } else {
                System.out.println("<--------Sys Win-------->");
            }
            
        } while (true);
        in.close();
    }
}
