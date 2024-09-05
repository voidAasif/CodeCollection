package java.FrameSwing.code;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Slider extends JFrame implements ChangeListener {
    JFrame frame;
    JLabel label;
    JSlider slider;

    Slider(){
        //frame;
        frame = new JFrame("Slider");
        frame.setSize(500, 450);
        frame.setLayout(new GridLayout(2, 1));
        frame.setLocationRelativeTo(null);

        
        //slider;
        slider = new JSlider(0, 100, 40); //min, max, initial;
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);

        slider.setOrientation(SwingConstants.HORIZONTAL); //default;
        // slider.setOrientation(SwingConstants.VERTICAL);
        
        //action;
        slider.addChangeListener(this);

        //label;
        label = new JLabel(String.valueOf(slider.getValue()));
        label.setFont(new Font("Arial", Font.BOLD, 40+20));


        //add into frame;
        frame.add(label);
        frame.add(slider);

        //frame;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == slider){
            label.setFont(new Font("Arial", Font.BOLD, slider.getValue()+20));
            label.setText(String.valueOf(slider.getValue()));
        }
    }

}

public class j030_slider {
    public static void main(String[] args) {
        new Slider();
    }
}
