package code;

class myThr1 extends Thread {  // Thread 1;
    myThr1(String name){  // constructor of class(run when we make obj of myThr class);
        super(name);  // this constructor call the constructor of thread class(and Pass name);
    }
    public void run(){  // thread;
        System.out.println("Method1");
    }
}

// class myThr2 extends Thread {  // Thread 2;
//     myThr2(String name){  // constructor of class(run when we make obj of myThr class);
//         super(name);  // this constructor call the constructor of thread class(and Pass name);
//     }
//     public void run(){  // thread;
//         System.out.println("Method2");
//     }
// }

public class j057_threadConstructor {
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        myThr1 obj1 = new myThr1("myThreadName1");  // set name of the thread;

        // obj.start();  // optional;
        System.out.println("Thread1 Name:" + obj1.getName());
        System.out.println("Thread1 Id:" + obj1.getId());
        System.out.println("Thread1 Priority:" + obj1.getPriority());
        System.out.println("Thread1 State:" + obj1.getState());
        System.out.println("Thread1 Group:" + obj1.getThreadGroup());

System.out.println();  // new line;

        // myThr2 obj2 = new myThr2("myThreadName2");  // set name of the thread;

        // // obj.start();  // optional;
        // System.out.println("Thread2 Name:" + obj2.getName());
        // System.out.println("Thread2 Id:" + obj2.getId());
    }
}
