package java.FrameSwing.code;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class mouseListener extends JFrame implements MouseListener {

    JLabel label;

    mouseListener(){
        //frame; 
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);

        //label;
        label = new JLabel("abc");
        label.setBounds(200, 200, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        
        //MouseListener;
        label.addMouseListener(this);

        //add into frame;
        this.add(label);

        //frame;
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) { // (press + released => complete)
        System.out.println("Clicked");
    }
    @Override
    public void mouseEntered(MouseEvent e) { // enter hover;
        System.out.println("Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) { //exit hover;
        System.out.println("Exited");
    }
    @Override
    public void mousePressed(MouseEvent e) { //press;
        System.out.println("Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) { //release;
        System.out.println("Released");
    }
}


public class j035_mouseListener {
    public static void main(String[] args) {
        new mouseListener();
    }
}
