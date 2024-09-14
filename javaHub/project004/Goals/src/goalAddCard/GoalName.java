package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class GoalName extends JPanel{

    JPanel goalCardContainer;
    CardLayout innerPanelCardLayout;

    public GoalName(JPanel goalCardContainer, CardLayout innerPanelCardLayout){
        this.goalCardContainer = goalCardContainer;
        this.innerPanelCardLayout = innerPanelCardLayout;

        // temp
        JLabel label = new JLabel("Goal Name");
        this.add(label);
        System.out.println("Goal Name");
    } 
}
