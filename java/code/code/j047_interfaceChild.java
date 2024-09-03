package code;

// This is the main difference between class and interface;
// interface has ability to implement multiple inheritance(more base one drived);
interface Mother {
    void love();
}
interface Father {
    void care();
}

class child implements Mother, Father {
    public void love(){
        System.out.println("lvvvvvvvv");
    }
    public void care(){
        System.out.println("careeeeee");
    }
}


public class j047_interfaceChild {
    public static void main(String[] args){
        child kid = new child();

        kid.love();
        kid.care();
    }
}
