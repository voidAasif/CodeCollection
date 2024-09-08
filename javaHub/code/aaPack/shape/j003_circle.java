//  * j054_shapePack.java

package aaPack.shape;

public class j003_circle {
    public int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
