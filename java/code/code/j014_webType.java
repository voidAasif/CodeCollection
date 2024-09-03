package code;

import java.util.Scanner;
public class j014_webType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter website: ");
        String web = in.next();

        if(web.endsWith("org")){
            System.out.println("Organization");
        }
        else if(web.endsWith("com")){
            System.out.println("Commercial");
        }
        else if(web.endsWith("in")){
            System.out.println("Indian");
        }
        else {
            System.out.println("Invalid Input");
        }
        in.close();
    }
}