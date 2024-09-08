package code;

class Parent{

    public void method1(){
        System.out.println("I am in method 1 of base class");
    }
    public void method2(){
        System.out.println("I am in method 2 of base class");
    }
}

class Child extends Parent{
    
    @Override  //child class k object se parent class k saare method access hoo sakte hai.
               //per ager hum chate hai ki kisi method ko call krne per parent class ka method call na hoo to.
               //us parent class k method ko child class m override krte hai.
               
    public void method2(){       // comment this method to see difference
        System.out.println("I am in method 2 of drived class");
    }
    public void method3(){
        System.out.println("I am in method 3 of drived class");
    }
}

public class j041_methodOverriding {
    public static void main(String[] args){
        Parent p = new Parent();
        Child c = new Child();

        p.method1();
        p.method2();  //override

        c.method1();
        c.method2();  //override
        c.method3();
    }
}

