package goalAddCard;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;

public class GoalEnd extends JPanel {
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    //card theme color;
    Color cardTheme = new Color(0xFFDAB9);

    public GoalEnd(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        this.setBackground(Color.YELLOW);

        //set card theme color;
        this.setBackground(cardTheme);
        this.setLayout(new FlowLayout());
    }
}
