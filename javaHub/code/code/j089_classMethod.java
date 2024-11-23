package code;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class ClassName { //extend Object class as default;
    private String name;
    private int rollNo;

    public ClassName setName(String name){
        this.name = name;
        return this; // return obj of same class;
    }

    public ClassName setRollNo(int rollNo){
        this.rollNo = rollNo;
        return this; //return obj of same class;
    }

    @Override // override from Object class;
    public String toString(){
        return "name: "+name +" and RollNo: "+rollNo + "\n"; 
    }

    /******************************************** */
    //constructor;
    public ClassName(){}
    public ClassName(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj){ //diff acc* to rollNo;

        if(this == obj) return true;
        //typecast;
        ClassName that = (ClassName) obj;
        if(this.rollNo == that.rollNo) return true;

        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(rollNo); //now hash code generated on the basis of rollNo;
    }
}


public class j089_classMethod {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        

        ClassName obj = new ClassName();

        //chain;
        obj.setName("Aasif").setRollNo(02).toString();

        System.out.println(obj); //print obj of ClassName class;

        System.out.println("***************************");
        //Differentiate students on the basis of rollNo;

        //obj with same data;
        ClassName st1 = new ClassName("abc", 4);
        ClassName st2 = new ClassName("xyz", 4);

        System.out.println("Hash of student 1: " + st1.hashCode());
        System.out.println("Hash of student 2: " + st2.hashCode());

        System.out.println("Is both students are same?: " + st1.equals(st2)); //if above student are same but it gives false by default bcz it compare on the basis of hash value;
                                            //not we need to override equals and hash method from Object class;  
                                            
        System.out.println("***************************");
        //now short students on the basis of rollNo;

        List<ClassName> studentList = List.of(
            new ClassName("A", 10),
            new ClassName("B", 11),
            new ClassName("C", 12),
            new ClassName("D", 13),
            new ClassName("E", 14),
            new ClassName("F", 15),
            new ClassName("G", 16),
            new ClassName("H", 17),
            new ClassName("I", 18),
            new ClassName("J", 18) //in hashSet in store same value bcz it has diff hash;
        );

        HashSet<ClassName> studentSet = new HashSet<>();
        studentSet.addAll(studentList);

        System.out.println(studentSet);

    }
}
