package java.code.code;

class animal{ // Base or parent class
    public void leg(){
        System.out.print("fox: ");
        System.out.println("4 legs");
    }
    public void nature(){
        System.out.print("lion: ");
        System.out.println("wild");
    }
}
class newAnimal extends animal{ // Drived or child class
    public void dog(){
        System.out.print("dog: ");
        System.out.println("also an animal but colour is black");
    }
}

public class j038_inheritance {
    public static void main (String[] args){
        
        animal base = new animal();
        newAnimal drived = new newAnimal();
        base.leg();
        base.nature();
        // obj.dog(); // Error, method is in child class
        System.out.println("****************************");
        drived.leg();
        drived.nature();
        drived.dog();
    }
}
