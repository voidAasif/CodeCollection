package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class GoalStart extends JPanel {
    JPanel goalCardContainer;
    CardLayout innerPanelCardLayout;

    public GoalStart(JPanel goalCardContainer, CardLayout innerPanelCardLayout){
        this.goalCardContainer = goalCardContainer;
        this.innerPanelCardLayout = innerPanelCardLayout;

        // temp
        JLabel label = new JLabel("Goal Start");
        this.add(label);
        System.out.println("Goal Start");
    }
}
