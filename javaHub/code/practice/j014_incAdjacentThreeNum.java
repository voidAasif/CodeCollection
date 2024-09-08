package practice;
// Write a Java program to check if an array of integers contains three increasing adjacent numbers.

import java.util.Scanner;

class j014_incAdjacentThreeNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){  // input array;
            System.out.printf("Element %d: ",i);
            arr[i] = in.nextInt();
        }
        boolean occur = false;  // output => if not occur-true 
        for(int i=0; i<arr.length; i++){
            if(arr[i] < arr[i+1]){     //compare arr[1] with arr[2];
                if(arr[i+1] < arr[i+2]){  // compare arr[2] with arr[3];
                    occur = true;  // if privious both conditions are true; the occur = true;
                }
            }
            if(i == 7){  // to resolve index error (eg.. arr[i=9] then arr[i+1 = 10] and arr[i+2 = 11].. where arr.length = 10);
                break;
            }
        }
        System.out.println(occur);
        in.close();
    }
}