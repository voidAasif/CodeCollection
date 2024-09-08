package practice;
// Write a Java program to count the number of even and odd elements in a given array of integers.

import java.util.Scanner;

public class j012_evenOddArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){  //input array
            System.out.printf("Element-%d: ",i);
            arr[i] = in.nextInt();
        }

        int odd=0, even=0;

        for(int ele: arr){
            if(ele%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Number of even element: " + even);
        System.out.println("Number of odd element: " + odd);

        in.close();

    }
}
