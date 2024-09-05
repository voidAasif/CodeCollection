// *j002_calculate.java;
package java.code.code;

import aaPack.j002_calculate; //import single file;

public class j052_calculatorUsingPack {
    public static void main(String[] args){
         
        j002_calculate calc = new j002_calculate(); //create obj of file;

        System.out.println("Add: " + calc.add(30, 23));  //access sum method of class j002_calculate;
        System.out.println("Sub: " + calc.sub(30, 23));
        System.out.println("Mul: " + calc.mul(3, 15));
        System.out.println("Div: " + calc.div(33, 3));
        System.out.println("Mod: " + calc.mod(10, 3));
    }
}