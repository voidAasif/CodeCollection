package java.code.code;

interface MyInterface {
    abstract public String myMethod(int value);
}

public class j082_lambdaExpression2 {
    public static void main(String[] args){

        MyInterface obj = (value)->{ //lambda expression, pass int value;

            System.out.println(value);
            return "I am String"; // method return string value;
        };

        String str = obj.myMethod(1123);
        System.out.println(str);
    }
}
