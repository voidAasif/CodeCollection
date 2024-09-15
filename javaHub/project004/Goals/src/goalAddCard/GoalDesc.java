package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

public class GoalDesc extends JPanel{
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    public GoalDesc(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;
        
        this.setBackground(Color.GREEN);

        // temp
        JLabel label = new JLabel("Goal Desc");
        this.add(label);
        System.out.println("Goal Desc");
    }
}