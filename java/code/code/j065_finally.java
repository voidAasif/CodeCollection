package java.code.code; //finally block;

public class j065_finally {

    public static int div(int a, int b){
        
        try{
            return a/b; // if exception not occur then div method break after returning reuslt;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Challenge to access this line"); //without finally block this line isn't accessible if exception was not occurs;
        }

        return -1;
    }


    public static void main(String[] args){

        System.out.println("Sum: " + div(5, 0));
    }
}
