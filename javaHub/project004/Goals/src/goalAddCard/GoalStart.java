package goalAddCard;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

public class GoalStart extends JPanel {
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    public GoalStart(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        this.setBackground(Color.GRAY);

        // temp
        JLabel label = new JLabel("Goal Start");
        this.add(label);
        System.out.println("Goal Start");
    }
}
