package goalInputCards;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Image;

import java.util.ArrayList;

public class GoalCategory extends JPanel {

    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    // goal input icon;
    ImageIcon goalIcon = new ImageIcon(getClass().getResource("/res/icons/categories.png"));

    // card theme color;
    Color cardTheme = new Color(0xC3E8D1);

    JLabel goalFieldIcon, goalLabel;
    JComboBox<String> goalBox;
    JPanel goalLabelContainer, goalFieldContainer;

    int goalFieldHeight = 70;

    public String input_goalCategory;

    public GoalCategory(){
        initUI();
    }

    public GoalCategory(JPanel goalCardContainer, CardLayout goalCardContainerLayout) {
        this();

        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;
    }
    
    private void initUI(){

        // set card theme color;
        this.setBackground(cardTheme);
        this.setLayout(new GridLayout(2, 1));
    
        // label;
        goalLabel = new JLabel("Goal Category");
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
    
        //category items - comboBox items;
        ArrayList<String> categories = new ArrayList<>();
        categories.add("cat1");
        categories.add("cat2");
        categories.add("cat3");
        categories.add("cat4");
        categories.add("cat5");
        categories.add("catN");
    
        goalBox = new JComboBox<>(categories.toArray(new String[0]));
        goalBox.setPreferredSize(new Dimension(350, goalFieldHeight));
        goalBox.setFont(new Font("SansSerif", Font.PLAIN, 30));
        goalBox.setForeground(Color.BLACK);
        goalBox.setBackground(cardTheme);
        goalBox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 8));
    
        // Text field panel;
        goalFieldContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 80));
        goalFieldContainer.setBackground(null);
        goalFieldContainer.add(goalFieldIcon);
        goalFieldContainer.add(goalBox);
    
        // add both panels into this panel;
    
        this.add(goalLabelContainer);
        this.add(goalFieldContainer);
    }

    public void setGoalCategory() {
        this.input_goalCategory = String.valueOf(goalBox.getSelectedItem());
    }

    public String getGoalCategory() {
        return input_goalCategory;
    }
}
