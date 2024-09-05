package java.FrameSwing.code;

import javax.swing.JButton;
import javax.swing.JFrame;


class Frame extends JFrame{

    JFrame myFrame = new JFrame("button");

    Frame(){

        myFrame.setLayout(null);
        myFrame.setSize(600, 400);


        // button 1
        JButton myButton1 = new JButton("first");  // obj of first button;
        myButton1.setBounds(40, 40, 100, 30); // (x, y, width, height);
        myFrame.add(myButton1); // add button into frame;

        // button 2

        JButton myButton2 = new JButton("second");
        myButton2.setBounds(250, 200, 100, 30);
        myFrame.add(myButton2);


        myFrame.setVisible(true);

    }
}

public class j002_button {
    public static void main(String[] args) {

        new Frame();

    }
}
