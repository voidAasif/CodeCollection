package practice;
// Write a Java program to merge two given sorted arrays of integers and create another sorted array.
// array1 = [1,2,3,4]
// array2 = [2,5,7, 8]
// result = [1,2,2,3,4,5,7,8]


public class j015_mergeTwoSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};  // sorted array;
        int[] arr2 = {2,3,4,5,6};  // sorted array;

        int[] arrResult = new int[10];  // result array;
        int count=0;                    // for result array index;
        for(int i=0; i< arr1.length; i++){ // 5 times;
            if(arr1[i] < arr2[i]){    // compare array1 with array2;
                arrResult[count++] = arr1[i];  // store arr1[i] at arrResult[0] and increment count;
                arrResult[count++] = arr2[i];  // store arr2[i] at arrResult[1] and increment count;
            }
            else {
                arrResult[count++] = arr2[i];
                arrResult[count++] = arr1[i];
            }
        }

        System.out.print("[");
        for(int ele: arrResult){  // print arrResult;
            System.out.print(ele);
            System.out.print(",");
        }
        System.out.println("]");
    }
}
