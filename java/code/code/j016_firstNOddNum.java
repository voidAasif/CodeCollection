package java.code.code;

import java.util.Scanner;
public class j016_firstNOddNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), flag=0;
        for(int i = 0; flag<n; i++){
            if(i%2 != 0){
                System.out.println("odd => "+i);
                flag++;
            }
        }
        System.out.println("***************************");

        for(int i=0; i<n; i++){
            System.out.println("odd => "+(2*i+1));
        }
        in.close();
    }
}
