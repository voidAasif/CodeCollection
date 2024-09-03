package code;

import java.util.Scanner;
public class j003_percen {
    public static void main (String[] args) {
        Scanner marks = new Scanner(System.in);
        
        System.out.print("Hindi: ");
        float mHindi = marks.nextFloat();

        System.out.print("English: ");
        float mEnglish = marks.nextFloat();

        System.out.print("Maths: ");
        float mMaths = marks.nextFloat();

        System.out.print("SSt: ");
        float mSst = marks.nextFloat();

        System.out.print("Drawing: ");
        float mDrawing = marks.nextFloat();

        System.out.print("Science: ");
        float mScience = marks.nextFloat();

        float result = ((mDrawing + mEnglish + mHindi + mMaths + mScience + mSst) * 100)/600;

        System.out.println(result);

        marks.close();
    }
}
