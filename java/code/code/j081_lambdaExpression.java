package java.code.code;

@FunctionalInterface  // it only have one abstract method;
interface FunctInterface {
    abstract void meth1(int a); // stp: 2 | set a = 10; | 10 ==> line 15;
}

// class FunctInterface{  // error;
//     public void meth1(int a){} //lambda expression only works on FunctionalInterface;
// }

public class j081_lambdaExpression {
    public static void main(String[] args){
        
        FunctInterface obj = (num)->{ // stp: 3 | set num = a = 10;
            System.out.println("This is lambda expression " + (num + 5)); // perform opr;
        };

        obj.meth1(10); // stp: 1 | 10 ==> line 5;
    }
}
