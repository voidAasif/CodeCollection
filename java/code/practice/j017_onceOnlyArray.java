package practice;
// Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
// Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50]
//Output: 50 appears only once.

public class j017_onceOnlyArray {
    public static void main(String[] args){
        int[] sourceArr = {10, 20, 10, 20, 30, 40, 40, 30, 50};

        int pvt = sourceArr[0];
        for(int i=1; i<sourceArr.length-1; i++){
            if(pvt == sourceArr[i]){
                pvt = sourceArr[i+1];
            }
        }
        System.out.println(pvt+ " appears only once.");
    }
}
