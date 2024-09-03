package code;

/*
 * Create a class cylinder and use getters ans setters to set its radius and height.
 */
import java.util.Scanner;
class cylinder {
    public float radius, height;

    public void setRadius(float radius){
        this.radius = radius;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }
    public float getVol(){
        float resultVol;
        resultVol = 3.14f * (radius * radius) * height;
        return resultVol;
    }
    public float getSurfaceArea(){
        float resultSur;
        resultSur = 2 * 3.14f * radius *(height + radius); 
        return resultSur;
    }
}

 public class j035_practice44 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    cylinder obj = new cylinder();
    System.out.println("Radius");
    float radius = in.nextFloat();
    System.out.println("Height");
    float height = in.nextFloat();
    obj.setRadius(radius);
    obj.setHeight(height);

    System.out.println(obj.getVol());
    System.out.println(obj.getSurfaceArea());
    System.out.println(obj.getRadius());
    System.out.println(obj.getHeight());

    in.close();
   } 
}
