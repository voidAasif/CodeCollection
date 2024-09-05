package java.code.code;

public class j060_exception {
    public static void main(String[] args){
        try{
            int a = 10/0;  // arithmetic exception; 
            System.out.println(a);
        }catch(Exception e){
            System.out.println("*************************");
            System.out.println(e);
            System.out.println("*************************");
        }
    }
}
