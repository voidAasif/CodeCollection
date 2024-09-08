// * aaPack/shape/ all
package code;

/*       vid:  68 practice.  // * solution in vid: 77;
 *  You have to create a package named aaPack.shape.
 *  This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere.
 *  These classes should use inheritance to properly manage the code.
 *  Include methods like volume, surface area and getters/setters for dimensions.
*/

import aaPack.shape.*;

public class j054_shapePack {
    public static void main(String[] args){

System.out.println("****************************************************");
        j001_rectangle myRect = new j001_rectangle();  //rectangle;

        myRect.setLength(5);
        myRect.setBredth(6);

        System.out.println("Length of rectangle is: " + myRect.getLength());
        System.out.println("Breadth of rectangle is: " + myRect.getBredth());

        System.out.println("Area of rectangle is: " + myRect.area());

System.out.println("****************************************************");

        j002_square mySqr = new j002_square();  //square;

        mySqr.setLength(4);

        System.out.println("Length of square is: " + mySqr.getLength());

        System.out.println("Area of square is: " + mySqr.area());

System.out.println("****************************************************");

        j003_circle mycir = new j003_circle();  //circle;

        mycir.setRadius(7);

        System.out.println("Radius of circle is: " + mycir.getRadius());

        System.out.println("Area of circle is: " + mycir.area());

System.out.println("****************************************************");

        j004_cylinder myCyl = new j004_cylinder();  //cylinder;

        myCyl.setRadius(5);
        myCyl.setHeight(7);

        System.out.println("Radius of cylinder is: " + myCyl.getRadius());
        System.out.println("Height of cylinder is: " + myCyl.getHeight());

        System.out.println("Surface are of cylinder is: " + myCyl.surfaceArea());

System.out.println("****************************************************");

        j005_sphere mySph = new j005_sphere();  //sphere

        mySph.setRadius(8);

        System.out.println("Radius of sphere is: " + mySph.getRadius());

        System.out.println("Surface area of sphere is: " + mySph.surfaceArea());
    }
}
