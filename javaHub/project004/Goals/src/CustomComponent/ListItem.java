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
import javax.swing.ImageIcon;
import java.awt.Image;

import SoundControl.SoundEffect;


public class ListItem extends JPanel implements ActionListener{

    JPanel midPanel; //to add this panel into midPanel;

    JPanel labelContainer, buttonContainer;
    JLabel nameLabel, endDateLabel;
    JButton updateButton, deleteButton;

    //icons for buttons;
    ImageIcon updateButtonIcon = new ImageIcon(getClass().getResource("/res/icons/updateButton.png"));
    ImageIcon deleteButtonIcon = new ImageIcon(getClass().getResource("/res/icons/deleteButton.png"));

    int buttonWidth = 30;
    int buttonHeight = buttonWidth;

    SoundEffect soundEffect = new SoundEffect();

    Color listTheme = new Color(0x123456);

    public ListItem(JPanel midPanel, String goalName, Date goalEnd){
        this.midPanel = midPanel;

        this.setLayout(new BorderLayout());
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40)); 
        // this.setPreferredSize(new Dimension(0, 0));
        this.setBackground(Color.LIGHT_GRAY);

        labelContainer = new JPanel(new FlowLayout(FlowLayout.LEFT, 80, 5));
        // labelContainer.setBackground(null);
        labelContainer.setBackground(listTheme);

        nameLabel = createLabel(goalName);
        endDateLabel = createLabel(String.valueOf(goalEnd));

        labelContainer.add(nameLabel);
        labelContainer.add(endDateLabel);

        buttonContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        buttonContainer.setBackground(null);

        updateButton = createButton(updateButtonIcon);
        updateButton.addActionListener(this);

        deleteButton = createButton(deleteButtonIcon);
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
        label.setForeground(Color.WHITE);

        return label;
    }

    private JButton createButton(ImageIcon buttonIcon){
        JButton button = new JButton();
        buttonIcon.setImage(buttonIcon.getImage().getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH));
        button.setIcon(buttonIcon);
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == updateButton) {
            // System.out.println("Update"); // log;
            soundEffect.playSound("/res/audio/buttonClick.wav");
            System.out.println("Update Goal Name: " + nameLabel.getText()); //update in DB;

        }
        if (arg0.getSource() == deleteButton) {
            // System.out.println("Delete"); // log;
            soundEffect.playSound("/res/audio/buttonClick.wav");
            System.out.println("Delete Goal Name: " + nameLabel.getText()); //delete from DB;
        }
    }
    
}
