package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

public class GoalEnd extends JPanel {
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    public GoalEnd(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        this.setBackground(Color.YELLOW);

        // temp
        JLabel label = new JLabel("Goal End");
        this.add(label);
        System.out.println("Goal End");
    }
}
