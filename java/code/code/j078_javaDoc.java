package java.code.code;

//use javadoc command to generate documentation of this code;

/**
 *  <i>Aasif Saifi</i>
 *  class description
 *  @author Aasif
 *  @since 2003
 *  @see <a href="https://www.google.com" target="_blank">Java Doc</a>
 *  @version 1.0.0.7
 */

class myClassName {
    final int attr = 170;

    /**
     * This is a method jo kuch nahi krta;
     * @param attr this is final attr in class;
     * @return this method does not return anythig;
     * @throws throw exception if 'i' is equal to zero;
     * @deprecated this method is deprecated please use another methods;
     */

    public static void method1(int i) throws Exception{
        if(i == 0){
            throw new Exception();
        }
        System.out.println("This is static method in className");
    }
    public void method2(){
        System.out.println("This is public method in className");
    }
}


public class j078_javaDoc {
    public static void main(String[] args){
        System.out.println("Java Dox");

        myClassName myClass = new myClassName();

        myClass.method2();
        try {
            myClassName.method1(0);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(myClass.attr);
    }
}
