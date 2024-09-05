package java.FrameSwing.code;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar; //imports;

class ScrollBar extends JFrame {
    //obj;
    JFrame frame;
    JLabel lable;
    JScrollBar scrollBar;

    ScrollBar(){
        //frame;
        frame = new JFrame("Scroll Bar");
        frame.setLayout(null);
        frame.setSize(300, 500);

        //scrollbar;
        scrollBar = new JScrollBar();
        scrollBar.setBounds(100, 50, 20, 300);

        //lable;
        lable = new JLabel();
        lable.setBounds(100, 10, 200, 50);

        //scrollbar action;
        scrollBar.addAdjustmentListener(new AdjustmentListener() {

            @Override
            public void adjustmentValueChanged(AdjustmentEvent arg0) {
                lable.setText("Position: " + String.valueOf(scrollBar.getValue())); // get int value and convert into String;
            }

        });
        

        //add component into frame;
        frame.add(lable);
        frame.add(scrollBar);

        //frame;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}


public class j019_scrollBar {
    public static void main(String[] args) {
        new ScrollBar(); //call;
    }
}
