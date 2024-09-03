//  * j054_shapePack.java

package aaPack.shape;

public class j001_rectangle {
    public int length;
    public int bredth;

    public void setLength(int length){  //getSet for length;
        this.length = length;
    }
    public int getLength(){
        return length;
    }

    public void setBredth(int bredth){  //getSet for bredth;
        this.bredth = bredth;
    }
    public int getBredth(){
        return bredth;
    }

    public int area(){
        return length*bredth;
    }
}
