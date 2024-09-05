package java.code.code;

// import java.util.function.Supplier;

class Base {   //parent class
    int x;
    public Base(){  //constructor
        System.out.println("No value");
    }
    public Base(int a){  // overloaded constructor
        System.out.println("One value: " + a);
    }
    public Base(int a , int b){  // overloaded constructor
        System.out.println("Two value: " + a + "," + b);
    }
}

class Drived extends Base {  //drived class

    // public Drived(){
    //     System.out.println("No value in drived");
    // }
    // public Drived(){
    //     super(1);
    //     System.out.println("One value in drived: ");
    // }
    public Drived(){
        super(1, 2);  //run base class 3rd constructor also
        System.out.println("Two value in drived: ");
    }
}

class j040_superInCon {
    public static void main(String[] args){
        // base base = new Base();
        // Base base = new Base(1);
        // Base base = new Base(1,2);

        Drived drived =  new Drived();

        System.out.println(drived); //tmp
    }
}