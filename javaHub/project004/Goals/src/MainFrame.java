import javax.swing.JFrame;
import javax.swing.JPanel;
import mainCards.AddCard;
import mainCards.DashCard;
import mainCards.HomeCard;
import mainCards.UpdateCard;

// import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {

    JPanel mainPanel;
    CardLayout cardLayout;

    //add frame logo;
    ImageIcon frameIcon = new ImageIcon(getClass().getResource("/res/icons/logo.png"));

    MainFrame(){
        this.setSize(700, 550);
        this.setMinimumSize(new Dimension(690, 520));
        this.setIconImage(frameIcon.getImage());
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
