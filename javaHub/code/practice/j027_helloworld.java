package practice;

import java.util.Scanner;


public class j027_helloworld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // String str = "zebra";
        String resultStr = "";

        for(int i=0; i<str.length(); i++){
            resultStr = resultStr + str.charAt(i);
            int j=0;
            while(j<50){
                System.out.println(resultStr);
                j++;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // char A = 65;
        // char Z = 90;
        // System.out.println(A);
        // System.out.println(Z);

        // char a = 97;
        // char z = 122;
        // System.out.println(a);
        // System.out.println(z);


        in.close();
    }
}
