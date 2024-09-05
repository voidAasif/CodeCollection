package code; // Ques: vid: 87 || sol: vid: 103;

import java.util.Scanner;

// You have to create a custom calculator with following operations: 
// 1. Add
// 2. Sub
// 3. Mul
// 4. Div

// which throws the following exceptions: 
// 1. Invalid input Exception ex: 8 & 9;
// 2. Cannot divide by 0 exception;
// 3. Max input exception if any of the inputs is greater then 1000;
// 4. max Multiplier reached exception - don't allow ony multiplication input to be greater than 7000;



class divByZeroExc extends Exception {  // check divide by 0 and divide;
    @Override
    public String toString(){
        return "Can't divide by zero";
    } 
    public float div(int a, int b) throws divByZeroExc{
        if(b==0){
            throw new divByZeroExc();
        }
        return a/b;  
    }
}

class maxInputExc extends Exception {  // set limits and multiply;
    @Override 
    public String toString(){
        return "Enter value between 0 to 1000";
    }
    public int max(int a, int b) throws maxInputExc{
        if(a>1000 || b>1000 || a*b>7000){
            throw new maxInputExc();
        }
        return a*b;
    }
}


public class j067_customCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  
        maxInputExc limitObj = new maxInputExc();      

        float result;

        System.out.print("Enter the value of a: ");
        int a = in.nextInt();
        in.nextLine();
        System.out.print("Enter the Opr: ");
        char ch = in.nextLine().charAt(0);
        System.out.print("Enter the value of b: ");
        int b = in.nextInt();

        switch(ch){
            case '+': // +++++++++++++++++++++++++++++++++
                System.out.println("Add: " + (a + b));
                break;

            case '-': // --------------------------------
                System.out.println("Sub: " + (a - b));
                break;

            case '*': // ********************************

                try{
                    result = limitObj.max(a, b);  // call max fun(check limits);
                    System.out.print("Mul: " + result);
                }
                catch(Exception mi){
                    System.out.println(mi); // maxInputExc/toString();
                }

                break;

            case '/': // /////////////////////////////////
                divByZeroExc divObj = new divByZeroExc();

                try{
                    limitObj.max(a, b);  // call max fun(check limits);
                    result = divObj.div(a, b);
                    System.out.print("Div: " + result);
                }
                catch(Exception dz){
                    System.out.println(dz);  // divByZeroExc/toString();
                }

                break;

            default:
                System.out.println("Invalid Input");
        }

        in.close();
    }
}
