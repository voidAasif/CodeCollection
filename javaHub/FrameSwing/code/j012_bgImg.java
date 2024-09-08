package javaHub.FrameSwing.code;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class BgImg extends JFrame {

    BgImg() {
        JFrame myFrame = new JFrame("BackgroundImg");
        myFrame.setLayout(null);
        myFrame.setSize(500, 300);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set the frame icon
        ImageIcon frameIcon = new ImageIcon("FrameSwing/res/bg.png");
        myFrame.setIconImage(frameIcon.getImage());

        // Set the frame background
        JLabel labelAsBackground = new JLabel(new ImageIcon("FrameSwing/res/bg.png")); // use label to set bg behind the other components;

        labelAsBackground.setBounds(0, 0, myFrame.getWidth(), myFrame.getHeight()); // set bounds equal to frame width and hight;

        myFrame.add(labelAsBackground); // add background (label) into frame;

        // Add button with icon
        JButton button = new JButton("BTN", new ImageIcon("FrameSwing/res/bg.png"));
        button.setBounds(50, 50, 100, 50);
        myFrame.add(button);
        button.setHorizontalTextPosition(JButton.CENTER); // to display text over bg;
        button.setVerticalTextPosition(JButton.CENTER);

        
        // Make sure everything is displayed correctly
        myFrame.setVisible(true);
    }
}

public class j012_bgImg {
    public static void main(String[] args) {
        new BgImg();
    }
}
