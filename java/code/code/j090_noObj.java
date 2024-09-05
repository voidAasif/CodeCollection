package java.code.code;


class ClassName1 { //extend Object class as default;
    private String name;
    private int rollNo;

    //used to restrict user to directly create an obj of this class;
    private ClassName1(){} //private constructor (run when static method call);

    public ClassName1 setName(String name){
        this.name = name;
        return this; // return obj of same class;
    }

    public ClassName1 setRollNo(int rollNo){
        this.rollNo = rollNo;
        return this; //return obj of same class;
    }

    @Override // override from Object class;
    public String toString(){
        return "name: "+name +" and RollNo: "+rollNo; 
    }

    public static ClassName1 Of(){ // static method: no need to create obj of class;
        return new ClassName1(); // create and return obj of this class;
    }

}


public class j090_noObj {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        

        // ClassName1 obj = new ClassName1(); // constructor is private so obj declaration is not possible;

        //chain;
        System.out.println(ClassName1.Of().setName("Aasif").setRollNo(02).toString());
        
        //it not print seated values bcz all values reset immediately;
        // ClassName1.Of().setName("Aasif").setRollNo(02).toString();
        // System.out.println(ClassName1.Of()); //print obj of ClassName class;
    }
}
