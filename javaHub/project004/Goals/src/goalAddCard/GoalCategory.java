package goalAddCard;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;

public class GoalCategory extends JPanel {

    JPanel goalCardContainer;
    CardLayout innerPanelCardLayout;
    
    public GoalCategory(JPanel goalCardContainer, CardLayout innerPanelCardLayout){
        this.goalCardContainer = goalCardContainer;
        this.innerPanelCardLayout = innerPanelCardLayout;

        // temp
        JLabel label = new JLabel("Goal Category");

        this.add(label);
        System.out.println("Goal Category");
    }
}
