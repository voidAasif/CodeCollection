package java.code.code;

//#1,2
// Write a program to print "GoodMorning" and "Welcome" continuously on the screen in java using threads;
// Add a sleep method in Welcome thread of question 1 to delay its execution for 2 seconds.

class greet1 extends Thread {
    public void run(){
        // while(true){
        // }
        System.out.println("GoodMorning");
    }
}
class greet2 extends Thread {
    public void run(){
        // while(true){
        // }
        System.out.println("Welcome");

    }
}

//#3,4,5
// Demonstrate getPriority() and setPriority() method in java threads;
// How do you get state of given thread in java;
// How do you get reference to the current thread;

class thread1 extends Thread {
    @Override
    public void run(){
        System.out.println("I am thread 1");
    }
}
class thread2 extends Thread {
    @Override
    public void run(){
        System.out.println("I am thread 2");
    }
}

public class j059_practice76 {
    public static void main(String[] args){
// #1,2

        greet1 myGreet1 = new greet1();
        greet2 myGreet2 = new greet2();

        myGreet1.start();  // start method of class 1;

        try{
            Thread.sleep(2000);  // wait for 2 seconds;
        }
        catch(Exception e){
            System.out.println(e);
        }

        myGreet2.start();  // start method of class 2;

//#3,4,5

        // thread1 myThr1 = new thread1();
        // thread2 myThr2 =  new thread2();

        // myThr1.setPriority(10); // max;
        // myThr2.setPriority(5);  // norm;
        
        // myThr1.start();
        // myThr2.start();
        
        // System.out.println("Priority of thread 1 is: " + myThr1.getPriority());
        // System.out.println("Priority of thread 2 is: " + myThr2.getPriority());
        
        // System.out.println("State of thread 1 is: " + myThr1.getState());
        // System.out.println("State of thread 2 is: " + myThr2.getState());
        
        // System.out.println("Current Reference of thread 1 is: " + Thread.currentThread().getState());//doubt
        // System.out.println("Current Reference of thread 2 is: " + Thread.currentThread().getState());//doubt
    }
}
