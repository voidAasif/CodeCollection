package java.FrameSwing.code;

//panel work as a container that hold other components;
//panel use Flow layout manager as default;
//where Frame use Border layout manager;
// import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Panel extends JFrame {
    Panel(){
        JFrame frame = new JFrame("Panel example");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLocationRelativeTo(null);

        //red;
        JPanel redPanel = new JPanel();
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setBackground(Color.red);
        
        //blue;
        JPanel bluePanel = new JPanel();
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setBackground(Color.blue);

        //green;
        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setBackground(Color.green);

        //label;
        JLabel label = new JLabel("ABC");
        JLabel label1 = new JLabel("XYZ");
        

        //add label into panel;
        //when we set panel layout = borderLayout then we use alignment methods;
        // redPanel.setLayout(new BorderLayout()); //uncomment it to see diff; when we uncomment it we set bounds on label;
        redPanel.add(label);
        redPanel.add(label1);


        //add component into frame;
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
}



public class j022_panel {
    public static void main(String[] args) {
        new Panel();
    }
}
