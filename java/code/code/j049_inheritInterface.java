package java.code.code;

interface parentInterface1{ //interface 1;
    void meth1();
}
interface parentInterface2{  //interface 2;
    void meth2();
}
interface childInterface1 extends parentInterface1, parentInterface2{ // inherit property of interface 1 and 2;
    void meth3();                                                     //in child interface;
}

class class1 implements childInterface1 {  //implement interface in class;
    public void meth1(){
        System.out.println("I am in meth1");  // override all methods;
    }
    public void meth2(){
        System.out.println("I am in meth2");
    }
    public void meth3(){
        System.out.println("I am in meth3");
    }
}

class j049_inheritInterface {
    public static void main(String[] args){
        class1 obj = new class1();

        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}