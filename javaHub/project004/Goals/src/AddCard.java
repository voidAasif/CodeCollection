import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;

public class AddCard extends JPanel{
    JPanel mainPanel;
    CardLayout cardLayout;

    AddCard(JPanel mainPanel, CardLayout cardLayout){
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        this.setBackground(Color.WHITE);
        this.setOpaque(true);
    }
}
