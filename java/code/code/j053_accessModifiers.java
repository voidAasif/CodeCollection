// * j003_access.java in aaPack package;

/*  Modifier	Class	Package	  Subclass	  World
    public	      Y	       Y	     Y	        Y
    protected	  Y	       Y	     Y          N
    no modifier	  Y	       Y	     N	        N
    private	      Y	       N	     N	        N
*/
package code;
import aaPack.j003_access;


class j053_accessModifiers {
    public static void main(String[] args){

        j003_access obj = new j003_access();

        System.out.println("*********Within a World********");

        System.out.println(obj.a);
        // System.out.println(obj.b);  //not available in other package;
        // System.out.println(obj.c);  //not available in other package;
        // System.out.println(obj.d);  //not available in other package;
    }
}