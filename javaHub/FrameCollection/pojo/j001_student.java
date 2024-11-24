package javaHub.FrameCollection.pojo;

public class j001_student implements Comparable<j001_student>{
    private String name;
    private int rollNo;

    public j001_student(){}

    public j001_student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    //setters;
    public void setName(String name){
        this.name = name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    //getters;
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }

    @Override
    public String toString(){
        return "[Name: " + name + ", RollNo: " + rollNo + "]\n"; 
    }

    @Override
    public boolean equals(Object o){
        j001_student that = (j001_student) o;
        return this != o && this.rollNo == that.rollNo;
    }

    @Override
    public int hashCode(){
        // return Objects.hash(rollNo);
        return rollNo;
    }

    //Override from comparable interface;
    @Override
    public int compareTo(j001_student that) {
        return Integer.compare(this.rollNo, that.rollNo);
    }
}
