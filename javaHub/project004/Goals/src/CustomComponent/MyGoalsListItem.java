package CustomComponent;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

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
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import SoundControl.SoundEffect;

import DBase.DBManagement;

public class MyGoalsListItem extends JPanel implements ActionListener {

    JPanel midPanel; // to add this panel into midPanel;
    JScrollPane midPanelScroll;

    JPanel labelContainer, buttonContainer;
    JLabel nameLabel, endDateLabel;
    JButton updateButton, deleteButton;

    // icons for buttons;
    ImageIcon updateButtonIcon = new ImageIcon(getClass().getResource("/res/icons/updateButton.png"));
    ImageIcon deleteButtonIcon = new ImageIcon(getClass().getResource("/res/icons/deleteButton.png"));

    int buttonWidth = 30;
    int buttonHeight = buttonWidth;

    SoundEffect soundEffect = new SoundEffect();

    Color listTheme = new Color(0x123456);

    JDialog inputDialog;

    String oldGoalName;

    public MyGoalsListItem(JPanel midPanel, JScrollPane midPanelScroll, String goalName, Date goalEnd) {
        this.midPanel = midPanel;
        this.midPanelScroll = midPanelScroll;
        this.oldGoalName = goalName;

        this.setLayout(new BorderLayout());
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        this.setBackground(Color.LIGHT_GRAY);

        labelContainer = new JPanel(new FlowLayout(FlowLayout.LEFT, 80, 8));
        // labelContainer.setBackground(null);
        labelContainer.setBackground(listTheme);

        nameLabel = createLabel(goalName);
        endDateLabel = createLabel(String.valueOf(goalEnd));

        labelContainer.add(nameLabel);
        labelContainer.add(endDateLabel);

        buttonContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
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

    } // end constructor;

    private JLabel createLabel(String labelName) {
        JLabel label = new JLabel(labelName);
        label.setFont(new Font("Monospaced", Font.PLAIN, 20));
        label.setForeground(Color.WHITE);

        return label;
    }

    private JButton createButton(ImageIcon buttonIcon) {
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
            soundEffect.playSound("/res/audio/updateButton.wav");

            // show popup inputs to update listItem;

            JTextField goalNameField = new JTextField();
            Object[] message = {
                    "Enter New GoalName:", goalNameField
            };

            int option = JOptionPane.showOptionDialog(
                                                        this, // Parent;
                                                        message, // The message containing the text field;
                                                        "Update", // Title of the dialog;
                                                        JOptionPane.OK_OPTION, // Option type (only "Confirm" button);
                                                        JOptionPane.INFORMATION_MESSAGE, // Message type;
                                                        updateButtonIcon, // Update button icon;
                                                        new String[] { "Confirm" }, // Custom button labels;
                                                        "Confirm"); // Initial selection (pre-selected option);

            if (option == JOptionPane.OK_OPTION) {
                String newGoalName = goalNameField.getText();
                // Handle the new goal name input
                if (!newGoalName.isEmpty()) {
                    // System.out.println(newGoalName);

                    updateName(newGoalName, oldGoalName);
                }
            }
        }
        if (arg0.getSource() == deleteButton) {
            // System.out.println("Delete"); // log;
            soundEffect.playSound("/res/audio/deleteButton.wav");

            DBManagement dbManagement = new DBManagement();
            boolean deleteFlag = dbManagement.deleteGoal(nameLabel.getText());
            if (deleteFlag) {
                midPanel.remove(this); // if remove from DB then remove this from List;

                refreshList();
            }
        }
    }

    private void updateName(String newGoalName, String oldGoalName){
        DBManagement dbManagement = new DBManagement();

        boolean updateFlag = dbManagement.updateGoal(newGoalName, oldGoalName);

        if(updateFlag){
            nameLabel.setText(newGoalName);

            refreshList();
        }
    }

    private void refreshList(){
        midPanelScroll.revalidate(); // small bug while revalidating scrollPane after delete listItem;
        midPanelScroll.repaint();
        midPanel.revalidate();
        midPanel.repaint();
    }

}
