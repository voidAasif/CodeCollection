package java.code.code;

class first {
    public void firstMeth(){
        System.out.println("I am first method in first class");
    }
}

class second extends first {
    // @Override annotation is unset do force (remind) the dev to override the method;
    @Override
    public void firstMeth(){
        System.out.println("I am first method in second class");
    }
    // @Deprecated annotation (show this method is no longer maintained);
    @Deprecated
    public int add(int a, int b){
        return a+b;
    }
}
// @FunctionalInterface annotation (an interface have only one abstract method is called functional interface);
@FunctionalInterface 
interface firstInterface {
    abstract public void meth();
}



public class j079_annotation {

    // @SuppressWarnings("deprecation")
    public static void main(String[] args){
        System.out.println("Annotation Examples");

        second mySecond = new second();

        mySecond.firstMeth();
        mySecond.add(5, 5);
    }
}
