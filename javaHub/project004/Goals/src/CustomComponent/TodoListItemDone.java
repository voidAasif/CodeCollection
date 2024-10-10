package CustomComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import DBase.DBManagement;
import SoundControl.SoundEffect;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TodoListItemDone extends JPanel implements ActionListener{
    JPanel inCompleteTaskPanel;
    JPanel completedTaskPanel;
    JScrollPane completedTaskPanelScroll;
    String goalName;
    
    ImageIcon addButtonIcon = new ImageIcon(getClass().getResource("/res/icons/tick.png"));

    JButton addButton;
    JLabel goalNameLabel;

    JPanel container; //container which contains addButton and goalNameLabel;

    SoundEffect soundEffect = new SoundEffect();

    Color themeColor = Color.LIGHT_GRAY;
    Color themeColor2 = new Color(0x123456);


    public TodoListItemDone(JPanel inCompleteTaskPanel, JPanel completedTaskPanel, JScrollPane completedTaskPanelScroll, String goalName){
        this.inCompleteTaskPanel = inCompleteTaskPanel;
        this.completedTaskPanel = completedTaskPanel;
        this.completedTaskPanelScroll = completedTaskPanelScroll;
        this.goalName = goalName;

        this.setLayout(new BorderLayout());
        // this.setPreferredSize(new Dimension(150, 100));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 65));
        // this.setBackground(Color.LIGHT_GRAY);
        this.setBackground(themeColor2);

        //label;
        goalNameLabel = createLabel(goalName);

        //Add button;
        addButton = createButton(addButtonIcon);
        addButton.addActionListener(this);

        // add button and label Container;
        container = new JPanel(new BorderLayout());
        container.setPreferredSize(new Dimension(300, 70));
        container.setBackground(themeColor);
        container.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
        container.add(goalNameLabel, BorderLayout.CENTER);
        container.add(addButton, BorderLayout.EAST);

        this.add(container, BorderLayout.CENTER);
    }

    private JLabel createLabel(String labelName) {
        JLabel label = new JLabel(labelName);
        // label.setBorder(BorderFactory.createLineBorder(Color.white, 10));
        label.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 10, themeColor)); //left padding;
        label.setFont(new Font("Monospaced", Font.PLAIN, 20));
        // label.setForeground(Color.WHITE);
        label.setForeground(themeColor2);

        return label;
    }

    private JButton createButton(ImageIcon buttonIcon){
        JButton button = new JButton();
        button.setIcon(buttonIcon);
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == addButton){
            soundEffect.playSound("/res/audio/addButton.wav");
            
            moveToIncomplete(goalNameLabel.getText());
        }
    }

    private void moveToIncomplete(String goalName){
        DBManagement dbManagement = new DBManagement();

        boolean moveFlag = dbManagement.completeToInComplete(goalName);

        if(moveFlag){
            completedTaskPanel.remove(this);
            completedTaskPanel.revalidate();
            completedTaskPanel.repaint();

            inCompleteTaskPanel.add(new TodoListItemNotDone(completedTaskPanel, inCompleteTaskPanel, completedTaskPanelScroll, goalName));
            inCompleteTaskPanel.revalidate();
            inCompleteTaskPanel.repaint();
        }
    }
}

