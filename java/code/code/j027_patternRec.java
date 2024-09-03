package code;

import java.util.Scanner;
public class j027_patternRec {

    static void pattern(int n){
        if(n>0){
            pattern (n-1);
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter: ");
        int n = in.nextInt();
        pattern(n);
        in.close();
    }
}
