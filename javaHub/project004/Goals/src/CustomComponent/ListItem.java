package CustomComponent;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.BoxLayout;

public class ListItem extends JPanel implements ActionListener{

    JPanel midPanel; //to add this panel into midPanel;

    JLabel nameLabel, endDateLabel;
    JButton updateButton, deleteButton;

    public ListItem(JPanel midPanel, String goalName, Date goalEnd){
        this.midPanel = midPanel;

        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setPreferredSize(new Dimension(40, 40));
        this.setBackground(Color.LIGHT_GRAY);

        nameLabel = new JLabel(goalName);
        endDateLabel = new JLabel(String.valueOf(goalEnd));

        updateButton = createButton("Update");
        updateButton.addActionListener(this);

        deleteButton = createButton("Delete");
        deleteButton.addActionListener(this);

        this.add(nameLabel);
        this.add(endDateLabel);
        this.add(updateButton);
        this.add(deleteButton);

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
