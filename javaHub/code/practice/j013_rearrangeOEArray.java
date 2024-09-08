package practice;
// Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.

import java.util.Scanner;

public class j013_rearrangeOEArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){  //input array;
            System.out.printf("Element %d: ",i);
            arr[i] = in.nextInt();
        }

        int temp=0, pvt=0;  // temp => swap; pvt for mantain index;
        for(int i=0; i<arr.length; i++){  //traverse array;
            if(arr[i]%2 != 0){  // if elements is odd at index i;
                temp = arr[i];     // swap with pvt element;
                arr[i] = arr[pvt];
                arr[pvt] = temp;

                pvt++;   // pvt increase by 1.... to swap next index with next found odd element;
            }
        }

        for(int ele: arr){  // print array;
            System.out.println(ele);
        }


        in.close();
    }
}
