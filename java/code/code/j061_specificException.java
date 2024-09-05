package java.code.code;
import java.util.Scanner;

public class j061_specificException {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //define array;
        int[] arr = new int[5];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;



        try {
            System.out.println("Select Element of array: "); // enter char to for (other exception);
            int ele = in.nextInt();  // ele != array index for (first exception);
    
            System.out.println("Div: "); // enter char to for (other exception);
            int div = in.nextInt(); // div == 0 for (second exception);



            System.out.println("The ans is: " + arr[ele]/div); // main line (goal == execute this line without any error);
        }
        catch (ArithmeticException e) { // first exception;
            System.out.println("Hisaab galat lag gya");
        }
        catch (ArrayIndexOutOfBoundsException e) {  // second exception;
            System.out.println("Itna to array ka size bh na hai");
        }
        catch (Exception e) {  // other exception;
            System.out.println("Pta nahi kuch or gdbd hai");
        }

        in.close();
    }   
}
