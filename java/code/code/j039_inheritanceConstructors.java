package java.code.code;

// x->y->z   =  multilevel inheritance;

class x{
    int x;
    x(){
        System.out.println("I am in class x");
    }
    x(int n){
        System.out.println();
        System.out.println("I am in class x, where n = " + n);
    }
}
class y extends x{
    int y;
    y(){
        System.out.println("I am in class y");
    }
    y(int n){
        System.out.println();
        System.out.println("I am in class y, where n = " + n);
    }
}
class z extends y{
    int z;
    z(){
        System.out.println("I am in class z");
    }
    z(int n){
        System.out.println();
        System.out.println("I am in class z, where n = " + n);
    }
}

public class j039_inheritanceConstructors {
    public static void main(String[] args) {
        // System.out.println("X*********X***********");
        // x first = new x();
        // System.out.println("Y*********Y***********");
        // y second = new y();
        // System.out.println("**********Z**********");
        // z third = new z();

        System.out.println("**********X***********");
        x first = new x(4);
        System.out.println("**********Y***********");
        y second = new y(5);
        System.out.println("**********Z**********");
        z third = new z(6);

        System.out.println(first +""+ second +""+ third); //tmp
    }
}
