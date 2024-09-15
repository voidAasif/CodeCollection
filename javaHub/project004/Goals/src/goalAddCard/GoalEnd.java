package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Image;

public class GoalEnd extends JPanel {
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    //goal input icon;
    ImageIcon goalIcon = new ImageIcon(getClass().getResource("/res/icons/calendar.png"));

    //card theme color;
    Color cardTheme = new Color(0xFFDAB9);

    JLabel goalFieldIcon, goalLabel;
    JTextField goalField;
    JPanel goalLabelContainer, goalFieldContainer;

    int goalFieldHeight = 70;

    public GoalEnd(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        //set card theme color;
        this.setBackground(cardTheme);
        
        
        this.setLayout(new GridLayout(2, 1));

        //label;
        goalLabel = new JLabel("Goal End");
        goalLabel.setFont(new Font("SansSerif", Font.BOLD, 70));

        //Label Panel;
        goalLabelContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 80));
        goalLabelContainer.setBackground(null);
        goalLabelContainer.add(goalLabel);

        //text Field;

        //setLabel to contains image;
        goalIcon.setImage(goalIcon.getImage().getScaledInstance(goalFieldHeight, goalFieldHeight, Image.SCALE_SMOOTH));
        goalFieldIcon = new JLabel(goalIcon);
        goalFieldIcon.setBackground(null);
        goalFieldIcon.setBorder(null);
        goalFieldIcon.setOpaque(true);

        goalField = new JTextField(); //temp;
        goalField.setPreferredSize(new Dimension(350, goalFieldHeight));
        goalField.setFont(new Font("SansSerif", Font.PLAIN, 30));
        goalField.setCaretColor(cardTheme);
        goalField.setForeground(cardTheme);
        goalField.setBackground(Color.BLACK);
        goalField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 8));


        //Text field panel;
        goalFieldContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 80));
        goalFieldContainer.setBackground(null);
        goalFieldContainer.add(goalFieldIcon);
        goalFieldContainer.add(goalField);


        //add both panels into this panel;

        this.add(goalLabelContainer);
        this.add(goalFieldContainer);
    }
}
