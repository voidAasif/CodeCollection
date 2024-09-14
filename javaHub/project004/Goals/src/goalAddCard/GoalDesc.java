package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class GoalDesc extends JPanel{
    JPanel goalCardContainer;
    CardLayout innerPanelCardLayout;

    public GoalDesc(JPanel goalCardContainer, CardLayout innerPanelCardLayout){
        this.goalCardContainer = goalCardContainer;
        this.innerPanelCardLayout = innerPanelCardLayout;

        // temp
        JLabel label = new JLabel("Goal Desc");
        this.add(label);
        System.out.println("Goal Desc");
    }
}