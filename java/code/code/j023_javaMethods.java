package java.code.code;

public class j023_javaMethods {
    static void fun(){
        System.out.println("I am in function");
    }
    
    // static int function(int a, int b){
    //     int result;
    //     result = a+b;
    //     return result;
    // }

    public static void main(String[] args) {    
        System.out.println("Before");
        fun();
        System.out.println("After");

        // int funResult = function(10,5);
        // System.out.println("Ans: "+funResult);
    }
}
