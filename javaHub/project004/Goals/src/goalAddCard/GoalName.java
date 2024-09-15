package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

public class GoalName extends JPanel{

    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    public GoalName(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        this.setBackground(Color.red);

        // temp
        JLabel label = new JLabel("Goal Name");
        this.add(label);
        System.out.println("Goal Name");
    } 

}
