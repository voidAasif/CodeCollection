package java.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class ExitDialog extends JFrame {

    JFrame frame;

    ExitDialog(){
        //frame;
        frame = new JFrame("Exit dialog box");
        frame.setSize(500, 300);

        //dialog;
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){

                int a = JOptionPane.showConfirmDialog(frame, "Are you sure"); //return YES=0; NO=1; Cancel=2;
                
                if(a == JOptionPane.YES_OPTION){ //if click yes;
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //change default close opr;
                }

            }

        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
}


public class j018_frameExit {
    public static void main(String[] args) {
        new ExitDialog();
    }
}
