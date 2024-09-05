package java.code.code;

//  ??????????????????????????????????????????????????????????????????????????
//#1
class Phone {
    public void time(){ //1
        System.out.println("4:10 am");
    }
    public void ring(){  //2
        System.out.println("Phone ringing");
    }
}

class Smartphone extends Phone{
    public void youtube(){  //1
        System.out.println("Stream videos on youtube");
    }
    public void ring(){  //2
        System.out.println("Smartphone ringing");
    }
}

public class j042_dynamicMethodDispatch {
    public static void main(String[] args){

        Phone samsungGuru = new Phone();
        Smartphone mi = new Smartphone();

        samsungGuru.time();
        samsungGuru.ring();

        System.out.println("*******************");

        mi.time();
        mi.youtube();
        mi.ring();
        
        System.out.println("*******************");

        //dynamic method dispatch
        Phone sm = new Smartphone(); //If the method is found in the class of the reference(phone) variable, it's invoked.
                                    //If the method is not found in the class of the reference variable, Java looks for it in the superclass of that class.
        sm.time();
        sm.ring();
        // sm.youtube(); // error 

    }
}

//#2

// class Player{
//     public void jump(){
//         System.out.println("Jumping");
//     }
//     public void reloade(){
//         System.out.println("Player Reloading weapon");
//     }
// }
// class Weapon extends Player{
//     public void bullet(){
//         System.out.println("12 gauge");
//     }
//     public void reloade(){
//         System.out.println("Weapon Reloded");
//     }
// }

// public class j042_dynamicMethodDispatch {
//     public static void main(String[] args){
//         System.out.println("**********Player************");
//         Player p1 = new Player();

//         p1.jump();
//         p1.reloade();
//         // p1.bullet();    //error

//         System.out.println("**********Weapons************");
//         Weapon w1 = new Weapon();

//         w1.jump();
//         w1.reloade();
//         w1.bullet();

//         System.out.println("*********DMD***********");
//         Player obj = new Weapon();

//         obj.jump();
//         obj.reloade();
//         // obj.bullet(); //error
//     }
// }