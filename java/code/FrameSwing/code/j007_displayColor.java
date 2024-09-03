

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DisplayColor extends JFrame implements ActionListener {

    JFrame myFrame;
    JTextField tf;
    JButton rb; // red button;
    JButton bb; // blue button;
    JButton yb; // yellow button;
    JButton gb; // green button;
    JButton reb; // reset button;


    DisplayColor(){

        // obj;
        myFrame = new JFrame("DisplayColor");
        tf = new JTextField();
        rb = new JButton("Red");
        bb = new JButton("Blue");
        yb = new JButton("Yellow");
        gb = new JButton("Green");
        reb = new JButton("*Reset*");

        // frame;
        myFrame.setLayout(null);
        myFrame.setSize(700, 450);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);

        //textField;
        tf.setBounds(300, 10, 100, 50);

        //buttons;
        rb.setBounds(300, 70, 100, 50);
        bb.setBounds(300, 130, 100, 50);
        yb.setBounds(300, 190, 100, 50);
        gb.setBounds(300, 250, 100, 50);
        reb.setBounds(300, 310, 100, 50);

        // add component into frame;
        myFrame.add(tf);
        myFrame.add(rb);
        myFrame.add(bb);
        myFrame.add(yb);
        myFrame.add(gb);
        myFrame.add(reb);

        // actions;
        rb.addActionListener(this);
        bb.addActionListener(this);
        yb.addActionListener(this);
        gb.addActionListener(this);
        reb.addActionListener(this);

        // frame visibility and close opr;
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == rb) {
            tf.setBackground(Color.RED);
        } 
        else if(e.getSource() == bb){
            tf.setBackground(Color.BLUE);
        } 
        else if(e.getSource() == yb){
            tf.setBackground(Color.YELLOW);
        } 
        else if(e.getSource() == gb){
            tf.setBackground(Color.GREEN);
        } 
        else if(e.getSource() == reb){
            tf.setBackground(Color.WHITE);
            JOptionPane.showMessageDialog(myFrame, "Reset Successful"); // show message in mani frame;
        }

        // show Source;
        System.out.println("********************************************");
        System.out.println("aaaaaaaaaaaaaaaaaaa::::::::: "+e.getSource()); // return obj;
        System.out.println("********************************************");
    }
}

public class j007_displayColor {
    public static void main(String[] args) {
        new DisplayColor();
    }
}
