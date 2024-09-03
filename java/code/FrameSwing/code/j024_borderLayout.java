import java.awt.Color;
import java.awt.Dimension;
// import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

class myBorderLayout extends JFrame {
    JFrame frame;
    JPanel panelEast, panelWest, panelNorth, panelSouth, panelCenter;

    myBorderLayout(){
        //frame;
        frame = new JFrame("Border layout");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        // frame.setLayout(null); //if we set null then we specify the x, y, width, hight of the panel;
        // frame.setLayout(new BorderLayout()); //as default frame use BorderLayout;
        // frame.setLayout(new FlowLayout()); //display: flex; & flex-flow: row wrap;

        frame.setLayout(new BorderLayout(10, 10)); //L-R margin, T-B margin;
        
        //panel;
        panelEast = new JPanel();
        panelWest = new JPanel();
        panelNorth = new JPanel();
        panelSouth = new JPanel();
        panelCenter = new JPanel();
        
        //panel background;
        panelEast.setBackground(Color.red); //adjust verticaly;
        panelWest.setBackground(Color.blue);//adjust verticaly;
        panelNorth.setBackground(Color.green); //adjust horizontaly;
        panelSouth.setBackground(Color.orange); //adjust horizontaly;
        panelCenter.setBackground(Color.pink);
        
        //panel dimensions;
        panelEast.setPreferredSize(new Dimension(100, 100)); // set min adjustment limit;
        panelWest.setPreferredSize(new Dimension(100, 100));
        panelNorth.setPreferredSize(new Dimension(100, 100));
        panelSouth.setPreferredSize(new Dimension(100, 100));
        panelCenter.setPreferredSize(new Dimension(100, 100));
        
        //add into fram with layout;
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.add(panelCenter, BorderLayout.CENTER);
        
        
        //frame;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}


public class j024_borderLayout {
    public static void main(String[] args) {
        new myBorderLayout();
    }
}
