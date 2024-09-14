
import javax.swing.JFrame;
import javax.swing.JPanel;
// import java.awt.Color;
import java.awt.CardLayout;

public class MainFrame extends JFrame {

    JPanel mainPanel;
    CardLayout cardLayout;

    
    MainFrame(){
        this.setSize(700, 550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //add mainPanel container into frame;
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        //use cards;
        HomeCard homeCard = new HomeCard(mainPanel, cardLayout);
        AddCard addCard = new AddCard(mainPanel, cardLayout);
        DashCard dashCard = new DashCard(mainPanel, cardLayout);
        UpdateCard updateCard = new UpdateCard(mainPanel, cardLayout);

        //add Cards into panel;
        mainPanel.add(homeCard, "HomeCard");
        mainPanel.add(addCard, "AddCard");
        mainPanel.add(dashCard, "DashCard");
        mainPanel.add(updateCard, "UpdateCard");


        //add mainPanel into frame;
        this.add(mainPanel);

        this.setVisible(true);
    }
}
