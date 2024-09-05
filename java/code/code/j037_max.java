package java.code.code;

//maximum and second maximum elament in array


// it have some bugs (negative index value)

//#1

// import java.util.Scanner;
// class max_secondMax {
//     public int max = 0 , secondMax = 0;
//     public int max(int[] arr){
//         for(int i=0; i<5; i++){
//             for(int j=0; j<5; j++){
//                 if(arr[i] > arr[j]){
//                     max = arr[i];
//                 }
//                 if(arr[i] < arr[j]){
//                     max = arr[j];
//                 }
//             }
//         }
//         return max;
//     }
//     public int secondMax(int[] arr){
//         for(int i=0; i<5; i++){
//             for(int j=0; j<5; j++){
//                 if(arr[i] > arr[j]){
//                     secondMax = arr[i-1];
//                 }
//                 if(arr[i] < arr[j]){
//                     secondMax = arr[j-1];
//                 }
//             }
//         }
//         return secondMax;
//     }
// }

// public class j037_max {
//     public static void main(String[] args) {
//         max_secondMax obj = new max_secondMax();
//         Scanner in = new Scanner(System.in);

//         int[] arr = new int[5];

//         for(int i=0; i<5; i++){
//             System.out.printf("Enter element %d: ", i);
//             arr[i] = in.nextInt();
//         }
//         int m = obj.max(arr);
//         int sm = obj.secondMax(arr);

//         System.out.println("max ==> " + m);
//         System.out.println("second max ==> " + sm);
//         in.close();
//     }
// }

//#2

// import java.util.Scanner;

// class j037_max {
//     public static void main(String[] srgs){
//         Scanner in = new Scanner(System.in);

//         System.out.println("Enter the size of array: ");
//         int n = in.nextInt();  //input size of array

//         int[] arr = new int[n];

//         //input array

//         for(int i=0; i<arr.length; i++){
//             System.out.print("Enter element no " + (i+1) + ": ");
//             arr[i] = in.nextInt();
//         }

//         //print element of array

//         for(int ele: arr){
//             System.out.println(ele);
//         }

//         int first, second=0;

//         first = arr[0];

//         for(int i=1; i<arr.length; i++){  // 3 8 2 9 5 
//             if(first < arr[i]){
//                 second = first;
//                 first = arr[i];
//             }
//             else if(arr[i] > second && arr[i] != first){
//                 second = arr[i];
//             }
//         }
//         System.out.println("OUTPUT");
//         System.out.println(first);
//         System.out.println(second);

//         in.close();
//     }
// }

//#3

import java.util.Scanner;

class arrayOpr{
    int[] arr;
    int first = 0, second = 0;

    public void setArr(int[] arr) { //set array in class
        this.arr = arr;
    }

    public void getArr() {  // print elements of array
        for(int ele : arr){
            System.out.println(ele);
        }
    }

    public void Max(){     // find first and second maximum  // if=Max=constructor = error
        first = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && second != first){
                second = arr[i];
            }
        }
    } 

    public int getFirst(){  //return first max
        return first;
    }

    public int getSecond(){  //return second max
        return second;
    }


}

class j037_max {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  

        int[] arr = new int[5];  //declare array

        // input array
        for(int i=0; i<arr.length; i++){
            System.out.print("element" + i + ": ");
            arr[i] = in.nextInt();
        }

        in.close();  //close input scanner

        arrayOpr obj = new arrayOpr();  //class object

        System.out.println("******************************");

        obj.setArr(arr);  //pass array into a class

        System.out.println("******************************");

        // obj.getArr();  // call print array

        obj.Max(); // run max method

        System.out.println("******************************");

        System.out.println("first max==>" + obj.getFirst());
        System.out.println("second max==>" + obj.getSecond());

        System.out.println("******************************");
    }
}
 

