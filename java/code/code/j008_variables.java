package code;

//import java.io.PrintStream;

public class j008_variables {
    public static void main (String[] args) {
    byte b = 13;
    short s = 10;
    int i = 11;
    long l = 123l;
    float f = 12.2f;
    double d = 12.33;
    char ch = 'X';
    String str = "hello";
    boolean bool = true;
    
    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(ch);
    System.out.println(bool);
    System.out.println(str);
    System.out.println(s+i);
    System.out.println(i+l);
    System.out.println(l+f);
    System.out.println(f+d);
    System.out.println(d+ch);
    System.out.println(ch+i);    
    System.out.println(ch+str);

    System.out.println("*****************");

    System.out.println("Size of Byte is: " + Byte.SIZE);
    System.out.println("Size of Short is: " + Short.SIZE);
    System.out.println("Size of Int is: " + Integer.SIZE);
    System.out.println("Size of Long is: " + Long.SIZE);
    System.out.println("Size of Float is: " + Float.SIZE);
    System.out.println("Size of Double is: " + Double.SIZE);
    System.out.println("Size of Character is: " + Character.SIZE);
    // System.out.println("Size of Boolean is: " + Boolean.SIZE);
    // System.out.println("Size of String is: " + String.SIZE);

    
}
}
