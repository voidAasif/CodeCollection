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

    JLabel label;
    JButton update, delete;
    JPanel listContainer;
    JPanel labelPanel, buttonPanel;

    j013_listLine(JPanel listContainer, String labelText){

        this.listContainer = listContainer;

        this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
        this.setPreferredSize(new Dimension(460, 50));
        this.setBackground(Color.ORANGE);

        labelPanel = new JPanel();
        buttonPanel = new JPanel();

        //label;
        label = new JLabel();
        // label.setPreferredSize(new Dimension(250, 50));
        label.setText(labelText);

        //buttons;
        update = new JButton("Update");
        update.addActionListener(this);

        delete = new JButton("Delete");
        delete.addActionListener(this);

        labelPanel.add(label);

        buttonPanel.add(update);
        buttonPanel.add(delete);

        this.add(labelPanel);
        this.add(buttonPanel);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == update) {
            String newData = JOptionPane.showInputDialog("Enter new Data: ");
            label.setText(newData);
            revalidate();
        }
        if (arg0.getSource() == delete) {
            listContainer.remove(this);
            listContainer.revalidate();
            listContainer.repaint();
            
        }

        revalidate();
        repaint();
    }
}

