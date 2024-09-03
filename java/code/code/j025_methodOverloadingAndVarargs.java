package code;

//vid 33
public class j025_methodOverloadingAndVarargs {
    //block 1
    /*
    static int sum(int a, int b){ //Overloaded methods                                {handle only 2 arguments}
        return a+b;
    }
    static int sum(int a, int b, int c){                                              {handle only 3 arguments}
        return a+b+c;
    }*/

    //OR

    //block 2
    static int sum(int ...arr){ //varargs(receive arguments as an array)              {handle n number of arguments}
        int add=0;
        for(int a: arr){
            add += a;
        }
        return add;
    } 

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));
        System.out.println(sum(5,5,5,5));  // this line produce error when we uncomment block 1 and commentout block 2;
    }
}
