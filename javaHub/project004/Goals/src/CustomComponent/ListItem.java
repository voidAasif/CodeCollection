package CustomComponent;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
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

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
        this.setPreferredSize(new Dimension(0, 0));
        this.setBackground(Color.RED);

        labelContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 0));
        nameLabel = new JLabel(goalName);
        endDateLabel = new JLabel(String.valueOf(goalEnd));

        labelContainer.add(nameLabel);
        labelContainer.add(endDateLabel);

        buttonContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        updateButton = createButton("Update");
        updateButton.addActionListener(this);

        deleteButton = createButton("Delete");
        deleteButton.addActionListener(this);

        buttonContainer.add(updateButton);
        buttonContainer.add(deleteButton);

        this.add(labelContainer);
        this.add(buttonContainer);

        midPanel.add(this);
        midPanel.revalidate();
        midPanel.repaint();

    } //end constructor;

    private JButton createButton(String btnName){
        JButton button = new JButton(btnName);
        button.setFocusable(false);

        return button;
    }




    @Override
    public void actionPerformed(ActionEvent arg0) {}
    
}
