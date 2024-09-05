package java.FrameSwing.code;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class j027_layer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("layered pane");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        //label;
        JLabel l1 = new JLabel();
        l1.setBounds(50, 50, 200, 200);
        l1.setBackground(Color.red);
        l1.setOpaque(true);

        JLabel l2 = new JLabel();
        l2.setBounds(100, 100, 200, 200);
        l2.setBackground(Color.green);
        l2.setOpaque(true);

        JLabel l3 = new JLabel();
        l3.setBounds(150, 150, 200, 200);
        l3.setBackground(Color.blue);
        l3.setOpaque(true);

        
        //layered pane; z-index;
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.add(l1);
        layeredPane.add(l2);
        layeredPane.add(l3);

        // layeredPane.add(l2); //first add = max priority;
        // layeredPane.add(l1);
        // layeredPane.add(l3);
        
        // layeredPane.add(l1, JLayeredPane.DEFAULT_LAYER); // min priority;
        // layeredPane.add(l2, JLayeredPane.DRAG_LAYER); // max priority;
        // layeredPane.add(l3, JLayeredPane.DEFAULT_LAYER);

        // layeredPane.add(l1, Integer.valueOf(0));
        // layeredPane.add(l2, Integer.valueOf(10)); //max value = max priority;
        // layeredPane.add(l3, Integer.valueOf(0));


        //add layered pane into frame;
        frame.add(layeredPane);


        frame.setVisible(true);
    }
}
