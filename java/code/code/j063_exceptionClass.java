package java.code.code;
import java.util.Scanner;

class myException extends Exception{ //extend exception class for (custom exception);
    @Override
    public String toString(){
        // return super.toString() + "i am to Stirng"; // super also return toString method value;
        return "I am to String"; //return this string;
    }

    @Override
    public String getMessage(){
        // return super.getMessage() + "i am getMessage";
        return "I am getMessage";
    }
}


public class j063_exceptionClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //scanner obj;
        System.out.print("Enter the value of a: ");
        int a = in.nextInt(); // input a;
        in.close();
        try{
            if (a<10){
                System.out.println("Throwing exception");
                throw new myException();  // throw exception to the class (myException);

                // throw new ArithmeticException("aasif");
            }
        }
        catch(Exception e){ // if exception occur;
            System.out.println("********************************");
            System.out.println(e.toString()); // call toString method;
            System.out.println("********************************");
            System.out.println(e); // call toString method;
            System.out.println("********************************");
            System.out.println(e.getMessage()); //call getMessage method;
            System.out.println("********************************");
            e.printStackTrace(); // print stack trace and also run toString method;
            System.out.println("********************************");
        }
    }
}
