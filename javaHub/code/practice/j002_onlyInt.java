package practice;
import java.util.Scanner;

class j002_onlyInt{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean n;
        do{
            System.out.print("Enter an int value: ");
            n = in.hasNextInt();        //input (int = true);
                in.next();          // consume new line char;
                if(!n){       // if n is false (not int value);
                    System.out.println("this is not an int value");
                }
        }while(!n);         // if n is not an int = continue  / if n is int = terminate

        System.out.println("good! it is an int");
        in.close();
    }
}
