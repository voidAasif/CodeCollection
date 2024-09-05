// note:  package = dir;
//there are two types of packages--> 1. builtin packages, 2. userdefined packages;

package java.code.code;  //<-- user defined package;
//import java.util.Scanner; //<-- built in package;


//there are three way to import packages in java;

//1. 
//import java.util.Scanner;  //import single class or file(java/util/scanner.class);

//2.
// import java.util.*;  //import complete package or dir(java/util/*);

//3. goto line 24;


//import user defined package;
import aaPack.j001_abc;

public class j051_pack {
    public static void main(String[] args){
        //3.
        // java.util.Scanner in = new java.util.Scanner(System.in);

        //use user defined package;
        //(a)  // access by object;
        // j001_abc obj = new j001_abc(); 
        // obj.main(null);

        //(b)  // access in static way because main method is static;
        j001_abc.main(null); //this line execute j001_abc.java file which is in aaPack;
        
    }
}
