package practice;
// Write a Java program to find the updated length of a sorted array where each element appears only once (remove duplicates).
// Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7]
// Output: The length of the original array is: 11
// After removing duplicates, the new length of the array is: 7

public class j018_removeDupEle {
    public static void main(String[] args){
        int[] arrOriginal = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7,'$'};  //source array;
        int[] arrResult = new int[15];

        int count=0;  //index of result array;
        for(int i=0; i<arrOriginal.length-1; i++){ // 0 to length of original array - 1;
            if(arrOriginal[i] != arrOriginal[i+1] ){  // if element of array is equal to next element of array;
                arrResult[count++] = arrOriginal[i];  // arrResutl[0] = arrOriginal[i] and then count++;
            }
        }

        for(int i=0; i<count; i++){  // print array;  count = number of element store in result array;
            System.out.print(arrResult[i]);
            System.out.print(",");
        }
        System.out.println();
        System.out.println("The length of the original array is: "+ arrOriginal.length);
        System.out.println("After removing duplicates, the new length of the array is: "+ count);
    }
}
