package goalInputCards;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Image;

public class GoalDesc extends JPanel{
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    //goal input icon;
    ImageIcon goalIcon = new ImageIcon(getClass().getResource("/res/icons/description1.png"));

    //card theme color;
    Color cardTheme = new Color(0xFFE4E1);
    JLabel goalFieldIcon, goalLabel;
    JTextArea goalTextArea;
    JPanel goalLabelContainer, goalFieldContainer;

    int goalFieldHeight = 70;

    public String input_goalDesc;

    public GoalDesc(){
        initUI();
    }

    public GoalDesc(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this();
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout; 
        
    }

    private void initUI(){
        //set card theme color;
        this.setBackground(cardTheme);
        
        
        this.setLayout(new GridLayout(2, 1));

        //label;
        goalLabel = new JLabel("Enter Goal Description");
        goalLabel.setFont(new Font("SansSerif", Font.BOLD, 50));

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

        goalTextArea = new JTextArea();
        goalTextArea.setPreferredSize(new Dimension(350, goalFieldHeight*2));
        goalTextArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        goalTextArea.setLineWrap(true);
        goalTextArea.setWrapStyleWord(true);
        goalTextArea.setForeground(cardTheme);
        goalTextArea.setBackground(Color.BLACK);
        goalTextArea.setCaretColor(cardTheme);
        goalTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 8));


        //Text field panel;
        goalFieldContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 40));
        goalFieldContainer.setBackground(null);
        goalFieldContainer.add(goalFieldIcon);
        goalFieldContainer.add(goalTextArea);


        //add both panels into this panel;

        this.add(goalLabelContainer);
        this.add(goalFieldContainer);
    }

    public void setGoalDesc() {
        this.input_goalDesc = goalTextArea.getText();
        goalTextArea.setText(""); //reset textArea;
    }

    public String getGoalDesc() {
        return input_goalDesc;
    }

}