package java.code.code;
// * priority shows only when code was interrupted;

// Thread.MAX_PRIORITY = 10;
// Thread.NORM_PRIORITY = 5;
// Thread.MIN_PRIORITY = 1;

class myThr extends Thread{  
    myThr(String name){ 
        super(name);  //set name of thread using constructor;
    }

    public void run(){
        System.out.println(getName());  // print thread name;

        // while(true){  // uncomment while loop to see priority difference;
        //     System.out.println(getName());
        // }
    }
}

public class j058_threadPriority {
    public static void main(String[] args){
        myThr thr1 = new myThr("NameThread__1");  // set name of thread;
        myThr thr2 = new myThr("NameThread__2");
        myThr thr3 = new myThr("NameThread__3");
        myThr thr4 = new myThr("NameThread__4");
        myThr thr5 = new myThr("NameThread__5");

        thr5.setPriority(Thread.MAX_PRIORITY);  // set priority of thread;
        thr4.setPriority(Thread.NORM_PRIORITY);
        thr3.setPriority(Thread.MIN_PRIORITY);

        // thr5.setPriority(10);  // also set priority like this(between 1 to 10);
        // thr4.setPriority(5);
        // thr3.setPriority(1);


        thr1.start();  // start threads;
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
    }
}
