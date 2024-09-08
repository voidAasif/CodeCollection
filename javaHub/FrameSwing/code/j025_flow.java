package javaHub.FrameSwing.code;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class j025_flow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow layout example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        //flow layout;
        // frame.setLayout(new FlowLayout());
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER)); //default;
        // frame.setLayout(new FlowLayout(FlowLayout.LEADING)); //top left;
        // frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        // frame.setLayout(new FlowLayout(FlowLayout.TRAILING)); //top right
        // frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 20)); //flow, verticalGap, horizontalGap;






        //add button into frame;
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);
    }
}
