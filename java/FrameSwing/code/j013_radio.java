package java.FrameSwing.code;


// male;
// female;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Radio extends JFrame implements ActionListener {
    JFrame myFrame;
    JButton b;
    JRadioButton radio1, radio2, radio3;
    ButtonGroup group; // buttongroup is used to ensures that only one radio button can be selected at a time;

    Radio(){
        myFrame = new JFrame("Radio");
        b = new JButton("Click");
        radio1 = new JRadioButton("Male");
        radio2 = new JRadioButton("Female");
        radio3 = new JRadioButton("Other");
        group = new ButtonGroup();

        //frame;
        myFrame.setLayout(null);
        myFrame.setSize(700, 500);
        myFrame.setLocationRelativeTo(null);

        //radio;
        radio1.setBounds(10, 10, 100, 50);
        radio2.setBounds(10, 70, 100, 50);
        radio3.setBounds(10, 130, 100, 50);

        //add into group;
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        //add into frame;
        myFrame.add(radio1);
        myFrame.add(radio2);
        myFrame.add(radio3);

        //action;
        radio1.addActionListener(this);
        radio2.addActionListener(this);
        radio3.addActionListener(this);

        //frame;
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (radio1.isSelected()) {
            JOptionPane.showMessageDialog(myFrame, "Male");        
        }
        if (radio2.isSelected()) {       
            JOptionPane.showMessageDialog(myFrame, "Female");        
        }
        if (radio3.isSelected()) {
            JOptionPane.showMessageDialog(myFrame, "Other");   
        }

    }
}


public class j013_radio {
    public static void main(String[] args) {
        new Radio();
    }
}
