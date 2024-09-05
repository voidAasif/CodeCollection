// * Implement thread by extending Thread class;
package java.code.code;

class extendingThread extends Thread {
    public void run(){
        int i =0;
        while(i < 1000){
            System.out.println("**I am thread 1**");
            i++;
        }
    }
}
class extendingThread2 extends Thread {
    @Override
    public void run(){
        int i =0;
        while(i < 1000){
            System.out.println("##I am thread 2##");
            i++;
        }
    }
}

public class j055_extendingThread {
    public static void main(String[] args){
        extendingThread myThread1 = new extendingThread();
        extendingThread2 myThread2 = new extendingThread2();

        myThread1.start();
        myThread2.start();
    }
}
