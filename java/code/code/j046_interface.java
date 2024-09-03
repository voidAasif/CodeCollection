package code;

interface smartFeatures{
    int price = 100;          // final as default;
    void powerAnimation();    
    void chargingAnimation();
}
// ****************************************************************************************
class phone_ implements smartFeatures{  //class 1, first child of interface;
    public void type() {  //class1 mehtod;
        System.out.println("Button wale phone");
    }

    public void powerAnimation(){  // interface k method public hote hai;
        System.out.println("NOKIA: handshake");
    }
    public void chargingAnimation(){ //interface's method;
        System.out.println("NOKIA: |||||");
    }
}

class smartphone_ implements smartFeatures{  // class 2, second child of interface;
    public void type() {  //class2 mehtod;
        System.out.println("Touch wale phone");
    }

    public void powerAnimation(){  //interface's method;
        System.out.println("IPHONE: apple");
    }
    public void chargingAnimation(){    //interface's method;
        System.out.println("IPHONE: |_|");
    }
}
// ****************************************************************************************

class nk3310 extends phone_ {  // child of class1;
    public void launchDate(){
        System.out.println("Booth poorani baat hai");
    }
}
class iphone11 extends smartphone_ {  // child of class2;
    public void launchDate(){
        System.out.println("Jada poorani baat nahi hai");
    }
}
// ****************************************************************************************

public class j046_interface {
    public static void main(String[] args){
        nk3310 myPhone = new nk3310();

        myPhone.launchDate();
        myPhone.type();
        myPhone.powerAnimation();
        myPhone.chargingAnimation();

        // System.out.println(myPhone.price);  //three ways to access same thing;
        // System.out.println(phone.price);
        System.out.println(smartFeatures.price);

    System.out.println("**************************************************");

        iphone11 myIphone = new iphone11();

        myIphone.launchDate();
        myIphone.type();
        myIphone.powerAnimation();
        myIphone.chargingAnimation();

        // System.out.println(myIphone.price);  //three ways to access same thing;
        // System.out.println(smartphone.price);
        System.out.println(smartFeatures.price);
    }
}
