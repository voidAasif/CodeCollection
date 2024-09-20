//please run j013_dynamic.java;

package javaHub.FrameSwing.practice;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class j013_listLine extends JPanel implements ActionListener {

    JPanel listContainer; //to hold control of listContainer from dynamicList file;
    JLabel label; //label for list item text;
    JButton update, delete; //buttons;
    JPanel labelPanel, buttonPanel; //label panel to contains label and button panel to contains both buttons;

    j013_listLine(JPanel listContainer, String labelText){ //receive control of listContainer from dynamicList class and text for JLabel;

        this.listContainer = listContainer; //set listContainer;

        this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20)); //use flow layout to arrange label, update and delete button in same line;
        this.setPreferredSize(new Dimension(460, 50));
        this.setBackground(Color.ORANGE);

        //initialize both panels;
        labelPanel = new JPanel();
        buttonPanel = new JPanel();

        //label;
        label = new JLabel();
        label.setText(labelText);

        //buttons;
        update = new JButton("Update");
        update.addActionListener(this);

        delete = new JButton("Delete");
        delete.addActionListener(this);

        labelPanel.add(label); //add label into labelPanel;

        //add buttons into buttonPanel;
        buttonPanel.add(update); 
        buttonPanel.add(delete);

        //add both panels into this panel;
        this.add(labelPanel);
        this.add(buttonPanel);
    }

    @Override //actions;
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == update) {
            String newData = JOptionPane.showInputDialog("Enter new Data: "); //popup to input newData;
            label.setText(newData); //set newData on label;
            revalidate(); //update this;
        }
        if (arg0.getSource() == delete) {
            listContainer.remove(this); //remove this panel from listContainer (remove item form listContainer);
            listContainer.revalidate(); //update listContainer panel;
            listContainer.repaint();
            
        }

        revalidate(); // update this;
        repaint();
    }
}

