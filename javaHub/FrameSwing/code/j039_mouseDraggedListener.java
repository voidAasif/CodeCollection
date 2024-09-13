package javaHub.FrameSwing.code;

import javax.swing.JFrame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MouseFrame extends JFrame implements MouseMotionListener{

    MouseFrame(){
        this.setLayout(null);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.addMouseMotionListener(this); //add listener on this frame;

        this.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        System.out.println("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        System.out.println("Mouse Moved");
    }
}


public class j039_mouseDraggedListener {
    public static void main(String[] args){
        new MouseFrame();
    }
}
