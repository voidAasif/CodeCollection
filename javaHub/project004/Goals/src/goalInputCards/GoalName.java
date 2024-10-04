package goalInputCards;

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

public class GoalName extends JPanel {

    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    // goal input icon;
    ImageIcon goalIcon = new ImageIcon(getClass().getResource("/res/icons/goal.png"));

    // card theme color;
    Color cardTheme = new Color(0xA6C8FF);

    JLabel goalFieldIcon, goalLabel;
    JTextField goalField;
    JPanel goalLabelContainer, goalFieldContainer;

    int goalFieldHeight = 70;

    public String input_goalName;

    public GoalName() {
        initUI();
    }

    public GoalName(JPanel goalCardContainer, CardLayout goalCardContainerLayout) {

        this();

        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;
    }

    private void initUI() {
        // set card theme color;
        this.setBackground(cardTheme);
        this.setLayout(new GridLayout(2, 1));

        // label;
        goalLabel = new JLabel("Enter Your Goal");
        goalLabel.setFont(new Font("SansSerif", Font.BOLD, 70));

        // Label Panel;
        goalLabelContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 80));
        goalLabelContainer.setBackground(null);
        goalLabelContainer.add(goalLabel);

        // text Field;

        // setLabel to contains image;
        goalIcon.setImage(goalIcon.getImage().getScaledInstance(goalFieldHeight, goalFieldHeight, Image.SCALE_SMOOTH));
        goalFieldIcon = new JLabel(goalIcon);
        goalFieldIcon.setBackground(null);
        goalFieldIcon.setBorder(null);
        goalFieldIcon.setOpaque(true);

        goalField = new JTextField();
        goalField.setPreferredSize(new Dimension(350, goalFieldHeight));
        goalField.setFont(new Font("SansSerif", Font.PLAIN, 30));
        goalField.setCaretColor(cardTheme);
        goalField.setForeground(cardTheme);
        goalField.setBackground(Color.BLACK);
        goalField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 8));

        // Text field panel;
        goalFieldContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 80));
        goalFieldContainer.setBackground(null);
        goalFieldContainer.add(goalFieldIcon);
        goalFieldContainer.add(goalField);

        // add both panels into this panel;

        this.add(goalLabelContainer);
        this.add(goalFieldContainer);
    }

    public void setGoalName() {
        this.input_goalName = goalField.getText();
        goalField.setText(""); //reset field;
    }

    public String getGoalName() {
        return input_goalName;
    }

}
