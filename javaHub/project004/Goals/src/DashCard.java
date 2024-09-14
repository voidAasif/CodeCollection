import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;

public class DashCard extends JPanel{

    JPanel mainPanel;
    CardLayout cardLayout;

    DashCard(JPanel mainPanel, CardLayout cardLayout){
        JLabel temp = new JLabel("DashBoard");

        this.add(temp);
    }
    
}
