// package practice;
// // make a loading animation using java thread sleep method;

// class s1 extends Thread {
//     public void run() {
//         System.out.println("/");
//     }
// }

// class s2 extends Thread {
//     public void run() {
//         System.out.println("-");
//     }
// }

// class s3 extends Thread {
//     public void run() {
//         System.out.println("\\");
//     }
// }

// public class j023_loadingAnimation {
//     s1 mys1 = new s1();
//     s2 mys2 = new s2();
//     s3 mys3 = new s3();
    
//     while(true){
//         mys1.start();
//         try {
//             Thread.sleep(4000);
//         } 
//         catch (Exception e) {
//             System.out.println(e);
//         }

//         mys2.start();
//         try {
//             Thread.sleep(4000);
//         } 
//         catch (Exception e) {
//             System.out.println(e);
//         }

//         mys3.start();
//         try {
//             Thread.sleep(4000);
//         } 
//         catch (Exception e) {
//             System.out.println(e);
//         }
//     }

// }
