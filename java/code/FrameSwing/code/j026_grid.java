import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class j026_grid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        // frame.setLayout(new GridLayout());
        frame.setLayout(new GridLayout(2, 5, 10, 20)); // row, column, verticalGap, horizontalGap;

        //add component into frame;
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        // frame.add(new JButton("10"));


        frame.setVisible(true);
    }
}
