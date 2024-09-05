package code;

public class j010_stringMethods {
    public static void main(String[] args) {
        String str = "  Aasif Saifi  ";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());//remove unwanted space from start and end of the str
        System.out.println(str.substring(4, 9));//(n,n-1)
        System.out.println(str.replace("if", "rr"));
        System.out.println(str.startsWith("  Aa"));
        System.out.println(str.endsWith("ifi  "));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("if", 6));
        System.out.println(str.lastIndexOf("if", 13));
        System.out.println(str.equals("  Aasif Saifi  "));
        System.out.println(str.equalsIgnoreCase("  aaSIf SAIfi  "));
    }    
}
