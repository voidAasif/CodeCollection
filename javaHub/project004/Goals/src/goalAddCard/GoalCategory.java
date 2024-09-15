package goalAddCard;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Color;

public class GoalCategory extends JPanel {

    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;
    
    public GoalCategory(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        this.setBackground(Color.BLUE);

        // temp
        JLabel label = new JLabel("Goal Category");

        this.add(label);
        System.out.println("Goal Category");
    }
}
