package code;

public class j018_array {
    public static void main(String[] args) {
        //#1
        int []arr1;
        arr1 = new int[3];

        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        System.out.println(arr1[2]);

        //#2
        int[] arr2 = new int[3];

        arr2[0] = 0;
        arr2[1] = 1;
        arr2[2] = 2;
        System.out.println(arr2[1]);

        //#3
        int [] arr3 = {0, 1, 2};

        arr3[0] = 0;
        arr3[1] = 1;
        arr3[2] = 2;
        System.out.println(arr3[0]);
    }
}
