package java.code.code;

import java.util.Scanner;
public class j021_mDarray {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int[][] marr = new int[4][5];
//input
       for(int i=0; i<4; i++){
        for(int j=0; j<5; j++){
            System.out.printf("i=%d | j=%d\n",i,j);
            marr[i][j] = in.nextInt();
        }
       }
//output
      for(int i=0; i<4; i++){
        for(int j=0; j<5; j++){
            System.out.println(marr[i][j]);
        }
       } 
       in.close();
    }
}
