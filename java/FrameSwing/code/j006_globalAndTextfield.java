import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;  // for actionListner;
import java.awt.event.ActionListener;

class Global extends JFrame implements ActionListener{
    // Global component;
    public JFrame myFrame;
    public JButton b;
    public JTextField tf;

    // constructor;
    Global(){
        // objs;
        myFrame = new JFrame();    
        b = new JButton("Invert");
        tf = new JTextField();

        // setting frame;
        myFrame.setLayout(null); //play imp role for aligning items;
        myFrame.setSize(700, 500); // width and hight;

        // setting text field;
        tf.setBounds(10, 10, 300, 50); // x y width hight;
        tf.setForeground(Color.YELLOW); // text color;
        tf.setBackground(Color.BLUE);  // background color;
        tf.setCaretColor(Color.CYAN); // caret color;
        tf.setEditable(true); //restrict user to edit text field if false;
        
        // setting buttons;
        b.setBounds(100, 70, 100, 50); //x y width hight;

        // add component into frame;
        myFrame.add(tf);
        myFrame.add(b);

        // add action listner ==> Override into differnet method of the class(outside constructor);
        b.addActionListener(this); // to use this we need to implement ActionListner in our class;


        myFrame.setVisible(true); // set visibility of main frame;
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE); // complete exit;
    }

    //method; // b.addActionListner(this=b) = function call;
    @Override
    public void actionPerformed(ActionEvent e){ // abstract method of ActionListner interface(compulsory to implement);
        tf.setForeground(Color.BLUE); // change text color;
        tf.setBackground(Color.YELLOW); // change background color;
        b.setText("Done");  // change title of button;
    }
}

public class j006_globalAndTextfield {
    public static void main(String[] args) {
        new Global(); // invoce constructor of Global class;
    }
}
