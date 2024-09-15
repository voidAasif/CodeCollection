package goalAddCard;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;


public class GoalCategory extends JPanel {

    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    //card theme color;
    Color cardTheme = new Color(0xC3E8D1);
    
    public GoalCategory(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;

        this.setBackground(Color.BLUE);

        //set card theme color;
        this.setBackground(cardTheme);
        this.setLayout(new FlowLayout());
    }
}
