//This file is used by j051_pack.java in java/code dir;
// *j051_pack.java;

package aaPack;

class classIn_aaPack {
    public void methInClass(){
        System.out.println("Location:");
        System.out.println("Package: aaPack");
        System.out.println("Class: classIn_aaPack");
        System.out.println("Method: methInClass");
    }
}

public class j001_abc {
    public static void main(String[] args){
        classIn_aaPack Obj = new classIn_aaPack();

        Obj.methInClass();
    }
}
