package practice;
// Write a java program to convert a binary number to a decimal number;

import java.util.Scanner;
// import java.lang.Math;

class Power{   // custom pow function;
    private int result=1;

    public int poww(int x, int y){     // (x^y)
        result =1;  // reset claculation
        for(int i=0; i<y; i++){
            result = result*x;
        }
        return result;
    }

}

public class j006_BtoD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter binary value:");
        int inputValue = in.nextInt();
        int [] arr = new int[10];

        for(int i=0; inputValue != 0; i++){  //store digits in int into arrat;
            arr[i] = inputValue % 10;
            if(arr[i] != 0 && arr[i] != 1){ // check every digit is (0 / 1) or not;
                System.out.println("Plese enter in Binary");
                break;
            }
            inputValue = inputValue / 10;
        }
        
        // int temp;
        // int j = arr.length - 1;
        // for(int i=0; i<arr.length/2; i++){  // reverse the array;
        //     temp = arr[i];         // swap with array last element;
        //     arr[i] =  arr[j - i];
        //     arr[j - i] = temp;
        // }
        
        Power mathh = new Power();

        for(int i=0; i<arr.length; i++){      //apply 1,2,4,8 rule;
            arr[i] = arr[i]* mathh.poww(2,i);
        }
        
        int decimalValue = 0;
        for(int i=0; i<arr.length; i++){  // add 1,2,4,8;
            decimalValue = decimalValue + arr[i];
        }

        System.out.println("Decimal value: " + decimalValue);

        in.close();
    }
}
