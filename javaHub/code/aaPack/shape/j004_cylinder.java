//  * j054_shapePack.java

package aaPack.shape;

public class j004_cylinder extends j003_circle {
    public int height;

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
}