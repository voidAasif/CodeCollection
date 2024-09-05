package java.code.code;



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
        return "name: "+name +" and RollNo: "+rollNo; 
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
    }
}
