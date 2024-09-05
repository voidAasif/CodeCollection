package java.code.code;

interface Anonymous { //methods implements and override in anonymous class;
    public void meth1();
    public void meth2();
}

// class Anonymous {  // also correct;
//     public void meth1(){}
//     public void meth2(){}
// }

public class j080_anonymousClasses {
    public static void main(String[] args){
        // Anonymous classes are commonly used only for one time; 
        Anonymous acObj = new Anonymous(){  // no need to implement interface or extend class( A class which don't have any name);

            @Override
            public void meth1(){                      // direct override methods;
                System.out.println("I am meth1");
            }

            @Override
            public void meth2(){
                System.out.println("I am meth2");
            }
        };

        acObj.meth1();
        acObj.meth2();        

    }
}
