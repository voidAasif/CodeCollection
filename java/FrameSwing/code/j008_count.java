package java.FrameSwing.code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ClickCounter extends JFrame implements ActionListener{
    public JFrame myFrame;
    public JButton myButton;

    public int count = 0; // set count = 0;

    ClickCounter(){

        // obj;
        myFrame = new JFrame("Click Count");
        myButton = new JButton("Click me");

        // frame;
        myFrame.setLayout(null);
        myFrame.setSize(500, 300);

        //button;
        myButton.setBounds(10, 10, 100, 50);
        
        //add button into frame;
        myFrame.add(myButton);

        //action;
        myButton.addActionListener(this);


        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        count++; // increment count by 1 everytime when button click;
        myButton.setText(String.valueOf(count)); // convert int into string;
    }
}


public class j008_count {
    public static void main(String[] args){
        new ClickCounter();
    }
}
