package java.FrameSwing.code;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

class Color extends JFrame {
    Color(){
        JFrame myFrame = new JFrame("Color");

        myFrame.setSize(700, 500);

        
        JColorChooser myChooser = new JColorChooser(); // color chooser;
        myFrame.add(myChooser);  // add color chooser into frame;


        myFrame.setVisible(true);
    }
}


public class j004_color {
    public static void main(String[] args) {
        new Color();
    }
}
