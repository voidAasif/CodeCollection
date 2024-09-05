package java.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

class Loading extends JFrame {

    JProgressBar progressBar;

    Loading(){
        //frame;
        this.setTitle("ProgressBar");
        this.setSize(500, 450);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //progressBar;
        progressBar = new JProgressBar(50, 200); //min, max;
        progressBar.setPreferredSize(new Dimension(450, 50));
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);

        progressBar.setValue(0); //fill value;
        progressBar.setStringPainted(true); //to sisplay fill percentage;
        
        //add into frame;
        this.add(progressBar);
        
        //frame;
        this.setVisible(true);

        //fill method;
        fillMethod();
    }

    public void fillMethod(){
        int i=0;
        while (i<=100) {
            progressBar.setValue(i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i+=10;
        }
        progressBar.setString("Done");
    }
}


public class j031_progressBar {
    public static void main(String[] args) {
        new Loading();
    }
}
