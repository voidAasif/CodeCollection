package practice;

// Write a java program to find the k largest elements in a  given array.
// element in the array can be in any order.

// Expected output:
// Original array:
// [1,4,17,7,25,3,100]
// 3 largest elements of the said array are:
// 100 25 17

import java.util.Scanner;
public class j022_kLargestArray {
    public static void main(String[] args){
        //define array;
        int[] arrOriginal = {1,4,17,7,25,3,100};
        Scanner in = new Scanner(System.in);

        System.out.println("Size of array: " + arrOriginal.length);
        System.out.print("Enter the value of k: ");
        int k = in.nextInt();

        if(k>arrOriginal.length){ 
            System.out.println("Invalid input");
        }

        int temp;
        for(int i=0; i<arrOriginal.length; i++){  //short array;
            for(int j=0; j<i; j++){
                if(arrOriginal[i] > arrOriginal[j]){
                    temp = arrOriginal[i];              //swap;
                    arrOriginal[i] = arrOriginal[j];
                    arrOriginal[j] = temp;
                }
            }
        }

        for(int i=0; i<k; i++){  //print array, k=number of elements;
            System.out.println(arrOriginal[i]);
        }

        in.close();
    }
}
