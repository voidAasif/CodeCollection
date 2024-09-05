// * Implement thread by runnable thread;
package code;

class runnableThread implements Runnable {
    public void run(){
        int i =0;
        while(i < 1000){
            System.out.println("**I am thread 1**");
            i++;
        }
    }
}
class runnableThread2 implements Runnable {
    @Override
    public void run(){
        int i =0;
        while(i < 1000){
            System.out.println("##I am thread 2##");
            i++;
        }
    }
}

public class j056_runnableThread {
    public static void main(String[] args){
        runnableThread myThread1_bullet = new runnableThread();
        Thread myThread1_gun = new Thread(myThread1_bullet);  //load runnable interface as a bullet in thread(gun);

        runnableThread2 myThread2_bullet = new runnableThread2();
        Thread myThread2_gun = new Thread(myThread2_bullet);


        myThread1_gun.start();
        myThread2_gun.start();
    } 
}
