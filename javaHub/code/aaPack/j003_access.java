// * j053_accessModifiers.java in code package;

/*  Modifier	Class	Package	  Subclass	  World
    public	      Y	       Y	     Y	        Y
    protected	  Y	       Y	     Y          N
    no modifier	  Y	       Y	     N	        N
    private	      Y	       N	     N	        N
*/

package aaPack;

public class j003_access {
    public int a=1;
    protected int b=2;
    int c=3;
    private int d=4;

    void meth1(){
        System.out.println("*********Within the same Class********");
        System.out.println(a);  //all access modifier available in same class;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class access {
    public static void main(String[] args){
      j003_access obj = new j003_access();
      obj.meth1();

      System.out.println("*********Within the same Package********");
      System.out.println(obj.a);
      System.out.println(obj.b);
      System.out.println(obj.c);
    //   System.out.println(obj.d);  //not available in other class;

    Subclass obj2 = new Subclass();
    obj2.method();
    }
}

// Inheritance example
class Subclass extends j003_access {
    void method() {
        // Within a subclass (even in a different package)
        System.out.println("*********Within a Subclass********");
        System.out.println(a);  // Public
        System.out.println(b);  // Protected
        // System.out.println(c);  // Default (Not accessible) ***Doubt***
        // System.out.println(d);  // Private (Not accessible)
    }
}
