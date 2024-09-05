package java.code.code;

/*
 * Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters;
 */
class rectangle {
    public int h,b; 
    public rectangle(int h, int b){
        this.h = h;
        this.b = b;
    }
    public void setH(int h){
        this.h = h;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getArea(){
        return h*b;
    }
}
public class j036_practice44 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(4, 5);
        // r1.setH(10);
        // r1.setB(5);
        System.out.println(r1.getArea());
    }
}
