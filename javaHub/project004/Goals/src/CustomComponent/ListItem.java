package CustomComponent;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.BoxLayout;

public class ListItem extends JPanel implements ActionListener{

    JPanel midPanel; //to add this panel into midPanel;

    JPanel labelContainer, buttonContainer;
    JLabel nameLabel, endDateLabel;
    JButton updateButton, deleteButton;

    public ListItem(JPanel midPanel, String goalName, Date goalEnd){
        this.midPanel = midPanel;

        this.setLayout(new BorderLayout());
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); 
        this.setPreferredSize(new Dimension(0, 0));
        this.setBackground(Color.LIGHT_GRAY);

        labelContainer = new JPanel(new FlowLayout(FlowLayout.RIGHT, 50, 0));
        labelContainer.setBackground(null);

        nameLabel = createLabel(goalName);
        endDateLabel = createLabel(String.valueOf(goalEnd));

        labelContainer.add(nameLabel);
        labelContainer.add(endDateLabel);

        buttonContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttonContainer.setBackground(null);

        updateButton = createButton("Update");
        updateButton.addActionListener(this);

        deleteButton = createButton("Delete");
        deleteButton.addActionListener(this);

        buttonContainer.add(updateButton);
        buttonContainer.add(deleteButton);

        this.add(labelContainer, BorderLayout.WEST);
        this.add(buttonContainer, BorderLayout.EAST);

        midPanel.add(this);
        midPanel.revalidate();
        midPanel.repaint();

    } //end constructor;

    private JLabel createLabel(String labelName){
        JLabel label = new JLabel(labelName);
        label.setFont(new Font("Monospaced", Font.PLAIN, 20));

        return label;
    }

    private JButton createButton(String btnName){
        JButton button = new JButton(btnName);
        button.setFocusable(false);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == updateButton) {
            System.out.println("Update"); // log;
        }
        if (arg0.getSource() == deleteButton) {
            System.out.println("Delete"); // log;
        }
    }
    
}
