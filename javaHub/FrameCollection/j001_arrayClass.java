package javaHub.FrameCollection;

import java.util.Arrays;
import java.util.Collections;

//array class works on primitive array;

public class j001_arrayClass {
    public static void main(String[] args){
        //sort;
        int[] arr = {23, 4, 5, 25, 0};

        // Convert int[] to Integer[]
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        System.out.println("Original: " + Arrays.toString(arr));

        Arrays.sort(arr); //perform quick sort;
        System.out.println("Sorted: " + Arrays.toString(arr));

        Arrays.sort(boxedArray, Collections.reverseOrder());
        System.out.println("Reverse using Collections: " + Arrays.toString(boxedArray));

        Arrays.sort(boxedArray, (a, b) -> b -a);
        System.out.println("Reverse using lambda: " + Arrays.toString(boxedArray));

        //search;
        int[] arr2 = {1,22, 34, 54, 65, 67, 78};
        int index = Arrays.binarySearch(arr2, 34);
        System.out.println("Index: " + index);

        //reset array;
        Arrays.fill(arr2, 0);
        System.out.println("Reset: " + Arrays.toString(arr2));

    }
}
