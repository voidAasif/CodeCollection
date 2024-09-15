package goalAddCard;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;


public class GoalStart extends JPanel {
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    //card theme color;
    Color cardTheme = new Color(0xE4D1FF);

    public GoalStart(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        this.setBackground(Color.GRAY);

        //set card theme color;
        this.setBackground(cardTheme);
        this.setLayout(new FlowLayout());
    }
}
