//main file of j013;

package javaHub.FrameSwing.practice;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

class ListContainerFrame extends JFrame implements ActionListener {

    JButton add;
    JPanel listContainer; //mid panel;

    ListContainerFrame(){
        this.setLayout(new BorderLayout());
        this.setSize(500, 450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //button;
        add  = new JButton("Add");
        add.addActionListener(this);

        listContainer = new JPanel();

        //add component into frame;
        this.add(listContainer, BorderLayout.CENTER);
        this.add(add, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == add) {
            String text = JOptionPane.showInputDialog("Enter Data: ");
            listContainer.add(new j013_listLine(listContainer, text));
            revalidate();
            repaint();
        }
    }

}

public class j013_dynamicList {
    public static void main(String[] args){
        new ListContainerFrame();
    }
}