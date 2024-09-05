package java.code.code;

import java.util.Scanner;
public class j019_arrayOpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter element: "+i);
            arr[i] = in.nextInt();
        }
        System.out.println("************************************");

        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.printf("Element: %d\tValue: %d\n",i,arr[i]);
        // }

        for(int ele: arr){
            System.out.println(ele);
        }

        in.close();
    }
}
