package code;

import java.util.Scanner;
public class j011_stringReplace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str = in.nextLine();

        //lower case and upper case
        // System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
       
       //remove space and insert undersocre
       System.out.println(str.replace(" ", "_"));
       
       //detect double and triple space in string
       System.out.println(str.indexOf("  "));
       System.out.println(str.indexOf("   "));
        in.close();
    }
}
