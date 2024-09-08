package code;

abstract class Base1{
    public void xyz(){
        System.out.println("I am in Base class");
    }
    // --> dont have any object;
    // --> work as a structure;
    public abstract void methodName(int x, int y);  // this method overrided in drived class;
                                        // (in short body of this method is in Drived class);

    public static Base1 getInstance(){
        return new Drived1();
    }
}

class Drived1 extends Base1{
    @Override
    public void methodName(int a, int b){  // This is the body of abstract mehtod;
        System.out.println("I am in Drived class" + " " + (a + b)); // same number of parameters;
    }
}
public class j044_abstractClass {
    public static void main(String[] args){
        // Base1 ob = new Base1();  // not allowed

        Drived1 obj = new Drived1();

        obj.methodName(10 , 11);
        obj.xyz();

        Base1 abc = Base1.getInstance();

        abc.xyz();
        abc.methodName(20, 31);
            
      
    }
}
