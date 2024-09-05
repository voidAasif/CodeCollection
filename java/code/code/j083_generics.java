package java.code.code;

class Generic<myDT>{  // myDT is custom dataType;
    public int num;
    public myDT data;  // myDT = dataType, data = variable;

    public Generic(int num, myDT data){ // receive int type num and myDT type data;
        this.num = num;
        this.data = data;
    }
}


public class j083_generics {
    public static void main(String[] args){

    System.out.println("***************************");

        // Generic obj = new Generic(435, 89); // myDT = int;
        // Generic obj = new Generic(435, 'x');  // myDT = char;
        // Generic obj = new Generic(435, "I am str");  // myDT = str;

        // System.out.println(obj.num);
        // System.out.println(obj.data);

    System.out.println("***************************");
        
    System.out.println("***************************");

        // Generic obj2 = new Generic(56, 45.45f); // store srt and float same time for diff obj's;
        
        // System.out.println(obj2.num);
        // System.out.println(obj2.data);

    System.out.println("***************************");

    System.out.println("***************************");

        // Generic<Integer> obj3 = new Generic(34, "str"); // type int pass string;

        // System.out.println(obj3.num);
        // System.out.println(obj3.data);

    System.out.println("***************************");

    System.out.println("***************************");

        // String st = obj3.data; // produce error;
        
        // int n = obj3.data;  // throw exception;
        // System.out.print("'n' is an int: " + n);

    System.out.println("***************************");

    System.out.println("***************************");

        Generic<Integer> obj4 = new Generic<>(89, 54); // accept only int;

        System.out.println(obj4.num);
        System.out.println(obj4.data);

    System.out.println("***************************");

    }
}
