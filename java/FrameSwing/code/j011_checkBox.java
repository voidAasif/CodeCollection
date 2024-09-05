import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;  // imports;

class CheckBox extends JFrame implements ActionListener { // main frame class;

    public JFrame myFrame; // main frame;
    public JLabel label;   // label;
    public JCheckBox checkBox1; // three checkBoxes;
    public JCheckBox checkBox2;
    public JCheckBox checkBox3;
    public JButton button; // one button to confirm order;

    public int amount; // total amount;

    CheckBox(){
        myFrame = new JFrame("CheckBox");
        label = new JLabel("Daal=100, chawal=50, roti=5");
        button = new JButton("Click");
        
        checkBox1 = new JCheckBox("Daal");
        checkBox2 = new JCheckBox("Chawal");
        checkBox3 = new JCheckBox("Roti"); // objs;




        //frame;
        myFrame.setLayout(null);
        myFrame.setSize(235, 400);

        //label;
        label.setBounds(10, 10, 205, 50);

        //checkBox;
        checkBox1.setBounds(50, 70, 100, 50);
        checkBox2.setBounds(50, 130, 100, 50);
        checkBox3.setBounds(50, 190, 100, 50);

        //button;
        button.setBounds(50, 250, 100, 50);

        //add;
        myFrame.add(label);
        myFrame.add(checkBox1);
        myFrame.add(checkBox2);
        myFrame.add(checkBox3);
        myFrame.add(button);

        //actionlistner;
        button.addActionListener(this);

        //frame;
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null); // to open window on center of the screen;
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        amount = 0; // set ammount isEqual to 0 every button clicked;
        String msg = null; // set msg string as null (for selected items);

        if (checkBox1.isSelected()) { // if first checkBox is selected;
            amount+=100;              // amount = amount = 100 (amount = 0 + 100);
            msg = "Daal\n";           // overrite null with Daal;
        }
        if (checkBox2.isSelected()) { // if second checkBox is also selected;
            amount+=50;               // amount = 100 + 50;
            msg += "Chawal\n";        // append Chawal;
        }
        if (checkBox3.isSelected()) { // same;
            amount+=5;
            msg += "Roti\n";
        }
        msg += "--------------\n"; // append new line in msg;
        JOptionPane.showMessageDialog(myFrame, msg + "Total: " + amount); // show dialog frame;
        
    }
}


public class j011_checkBox {
    public static void main(String[] args) {
        new CheckBox();
    }
}

