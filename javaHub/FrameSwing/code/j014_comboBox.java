package javaHub.FrameSwing.code;

//combo box =>  city name;

import javax.swing.*;
import java.awt.event.*;

class ComboBox extends JFrame implements ActionListener {

    JFrame myFrame;
    JComboBox<String> myComboBox; //comboBox;
    JButton b;

    ComboBox(){
        myFrame = new JFrame("ComboBox");
        b = new JButton("Click");
        // myComboBox = new JComboBox(); // generic; // after list of city;

        //frame;
        myFrame.setLayout(null);
        myFrame.setSize(300, 300);
        myFrame.setLocationRelativeTo(null);

        
        //add items into combobox;
        String[] cityNames = {"Meerut", "Delhi", "Mumbai", "Chandigarh"};
        
        //add cityNames array into combobox;
        myComboBox = new JComboBox<>(cityNames);
        
        //combobox;
        myComboBox.setBounds(50, 50, 200, 50);

        // myComboBox.setEditable(true); // editable;
        // System.out.println(myComboBox.getItemCount()); //print num of elements;
        // myComboBox.addItem("Rohta"); //add item at the end;
        // myComboBox.insertItemAt("Meerput", 0); //add item at index 0;
        // myComboBox.setSelectedIndex(2); // initialy select item on index 2;
        // myComboBox.removeItem("Meerpur"); //remove item;
        // myComboBox.removeItemAt(0); //remove item from index;
        // myComboBox.removeAll(); // remove all items;

        //button;
        b.setBounds(50, 160, 200, 50);

        //add components into frame;
        myFrame.add(myComboBox);
        myFrame.add(b);

        //action to print selected item in combobox;
        b.addActionListener(this);


        //frame;
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        //getSelectedIndex() return index of selected option;
        //getItemAt(x) return item store at 'x' index;
        JOptionPane.showMessageDialog(myFrame, "You select: " + myComboBox.getItemAt(myComboBox.getSelectedIndex()));
        // JOptionPane.showMessageDialog(myFrame, "You select: " + myComboBox.getSelectedItem());
    }
}

public class j014_comboBox {
    public static void main(String[] args) {
        new ComboBox();
    }
}
