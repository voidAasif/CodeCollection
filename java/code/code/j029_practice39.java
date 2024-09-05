package java.code.code;

import java.util.Scanner;
// Ques* 1
class employee {
    int salary;
    
    public int getSalary(){
        return salary;
    }

    String name;

    public String getName(){
        return name;
    }

    public String setName(String n){
        name = n;
        return name;
    }
}
    // Ques* 2
    class square {
        public int area(int n){
            return n*n;
        }

        public int perimeter(int n){
            return n*4;
        }
    }

    // Ques* 3
    class player{
        public void move(){
            System.out.println("Move");
        }
        public void jump(){
            System.out.println("Jump");
        }
        public void fire(){
            System.out.println("Fire");
        }
    }

public class j029_practice39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Q1. Create a class Employee with following properties and methods:
        /*
        1. salary (int)
        2. get Salary (return int)
        3. name (string)
        4. get name (return string)
        5. set name (nethod changing name)
         */
        // employee e1 = new employee();
        // employee e2 = new employee();

        // e1.salary = 1000;
        // e1.name = "abc";

        // System.out.println("Salary of employee 1: " + e1.salary);
        // System.out.println("Name of employee 1: " + e1.name);
        // System.out.println("method salary of employee 1: " + e1.getSalary());
        // System.out.println("method name of employee 1: " + e1.getName());
        // System.out.println("Change name of employee 1: " + e1.setName("newName1"));

        // System.out.println("****************************************************");

        // e2.salary = 1500;
        // e2.name = "xyz";     

        // System.out.println("Salary of employee 2: " + e2.salary);
        // System.out.println("Name of employee 2: " + e2.name);
        // System.out.println("method salary of employee 2: " + e2.getSalary());
        // System.out.println("method name of employee 2: " + e2.getName());
        // System.out.println("Change name of employee 2: " + e2.setName("newName2"));  

    // Q2. Square area and perimeter;
        // square sq = new square();
        // System.out.print("Side: ");
        // int n = in.nextInt();
        // System.out.println("Area: " + sq.area(n));
        // System.out.println("Perimeter: " + sq.perimeter(n));

    // Q3. player movements
        // player p1 = new player();
        // p1.fire();
        // p1.jump();
        // p1.move();

        in.close();
    }
}
