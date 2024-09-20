package javaHub.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

class BoxLayoutDemo extends JFrame {

    JPanel panel;

    BoxLayoutDemo(){ //use for stacking;
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //panel with box layout;
        panel = new JPanel();
        panel.setBackground(Color.PINK);

        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS)); //horizontal;
        // panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //vertical;

        // panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS)); //for writing layout;
        // panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        //add components;
        panel.add(new JButton("b1"));
        panel.add(new JButton("b2"));
        panel.add(new JButton("b3"));
        panel.add(new JButton("b4"));
        panel.add(new JButton("b5"));
        panel.add(new JButton("b6"));
        panel.add(new JButton("b6"));

        this.add(panel);
        this.setVisible(true);
    }
}



public class j042_boxLayout {
    public static void main(String[] args) {
        new BoxLayoutDemo();
    }
}