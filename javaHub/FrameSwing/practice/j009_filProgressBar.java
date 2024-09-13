package javaHub.FrameSwing.practice;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Color;

class ProgressFrame extends JFrame implements MouseMotionListener {

    JProgressBar progressBar;
    int i = 0;

    ProgressFrame(){
        this.setLayout(null);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(20, 20, 600, 80);
        progressBar.setForeground(Color.BLACK);
        progressBar.setBackground(Color.RED);
        progressBar.setStringPainted(true);
        progressBar.setToolTipText("Drag mouse");

        this.addMouseMotionListener(this); //add listener on this frame;
        this.add(progressBar);

        this.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        if(i<=100) progressBar.setValue(i++);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        if(i >= 0) progressBar.setValue(i--);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class j009_filProgressBar {
    public static void main(String[] args){
        new ProgressFrame();
    }
}
