package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class GoalEnd extends JPanel {
    JPanel goalCardContainer;
    CardLayout innerPanelCardLayout;

    public GoalEnd(JPanel goalCardContainer, CardLayout innerPanelCardLayout){
        this.goalCardContainer = goalCardContainer;
        this.innerPanelCardLayout = innerPanelCardLayout;

        // temp
        JLabel label = new JLabel("Goal End");
        this.add(label);
        System.out.println("Goal End");
    }
}
