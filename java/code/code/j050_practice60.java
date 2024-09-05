package java.code.code;

// all ques in cwh video 60;
//#1
// Create an abstract class pen with method write() and refill() as abstract method;


// abstract class pen {
//     abstract void write();
//     abstract void refill();
// }
// //#2
// // Use the pen class form #1 to create a concrete class fountainPen with additional method changeNib();
// class fountainPen extends pen {
//     public void write(){
//         System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
//     }
//     public void refill(){
//         System.out.println("Refilled");
//     }

//     public void changeNib(){
//         System.out.println("Changing Nib");
//     }
// }

//#3,5
// Create a class monkey with jump() and bite() method.
// Create a class human which inherits this monkey class.
// and inplements basic animal interface with eat() and sleep() methods.
// polymorphism.

// interface basicAnimal {
//     void eat();
//     void sleep();
// }
// class monkey {
//     public void jump(){
//         System.out.println("Jumping");
//     }
//     public void bite(){
//         System.out.println("Bite");
//     }
// }
// class human extends monkey implements basicAnimal {
//     public void eat(){
//         System.out.println("Eat");
//     }
//     public void sleep(){
//         System.out.println("Sleep");
//     }
// }

//#4
// Create a class telephone with ring() and lift() and disconnect() methods.
// as abstract methods create another class smartTelephone and demonstrate polymorphism.

// abstract class telephone {
//     abstract void ring();
//     abstract void lift();
//     abstract void disconnect();
// }
// class smartTelephone extends telephone {
//     public void ring(){
//         System.out.println("Ringing...");
//     }
//     public void lift(){
//         System.out.println("Receive..");
//     }
//     public void disconnect(){
//         System.out.println("End..");
//     }
// }

    //#6,7
    // Create a Interface TvRemote and use it to inherit another interface smartTvRemote. 
    // Create a class TV whih implements smartTvRemote interface from #6.

    interface TvRemote {
        void redButton();
        void greenButton();
    }
    interface smartTvRemote extends TvRemote {
        void googleAssitantButton();
    }
    class tvRemote implements smartTvRemote {
        public void redButton(){
            System.out.println("Turn off");
        }
        public void greenButton(){
            System.out.println("Turn on");
        }
        public void googleAssitantButton(){
            System.out.println("Activate Google Assistant");
        }
    }

public class j050_practice60 {
    public static void main(String[] args){
        //#1 and #2
        // fountainPen bluePen = new fountainPen();

        // bluePen.write();
        // bluePen.refill();
        // bluePen.changeNib();

        //#3
        // human men = new human();

        // men.eat();
        // men.sleep();
        // men.jump();
        // men.bite();

        // monkey poly = new human(); // polymorphism //#5
        // poly.jump();
        // poly.bite();

        //#4
        // telephone phone = new smartTelephone(); //Using polymorphism to instantiate the smartTelephone object.
        
        // phone.ring();
        // phone.lift();
        // phone.disconnect();

        //#6,7
        tvRemote myRemote = new tvRemote();

        myRemote.redButton();
        myRemote.greenButton();
        myRemote.googleAssitantButton();
    }
}
