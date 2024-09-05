package java.FrameSwing.code;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class KeyboardListener extends JFrame implements KeyListener {

    JLabel label, backgroundLabel;

    KeyboardListener(){
        //frame;
        this.setTitle("KeyListener");
        this.setLayout(new BorderLayout());
        this.setSize(720, 600);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(102, 255, 255));


        
        //label;
        label = new JLabel();
        ImageIcon balloon = new ImageIcon("FrameSwing/res/balloon.png");
        label.setIcon(balloon);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.BOTTOM);
        
        //add label into frame;
        this.add(label);

        //key listener;
        this.addKeyListener(this);
        
        
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




    @Override
    public void keyTyped(KeyEvent e) { //char - abc;
        System.out.println("(keyPressed)key char: "+e.getKeyChar());
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX()+10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
            
            default:

                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) { //code - arrow, shift, ctrl, space etc;
        System.out.println("(keyTyped)key code: "+e.getKeyCode());
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 39:
                label.setLocation(label.getX()+10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY()+10);
                break;
            
            default:
                
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { //when any key released;
        System.out.println("KeyReleased");
    }
}



public class j034_keyListener {
    public static void main(String[] args) {
        new KeyboardListener();
    }
}
