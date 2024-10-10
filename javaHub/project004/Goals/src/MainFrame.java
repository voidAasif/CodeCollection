import javax.swing.JFrame;
import javax.swing.JPanel;
import mainCards.AddCard;
import mainCards.DashCard;
import mainCards.StartupCard;
import mainCards.Todo;
import mainCards.MyGoals;
import mainCards.Priority;

// import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;

//import DB;
import DBase.DBManagement;

public class MainFrame extends JFrame {

    JPanel mainPanel;
    CardLayout cardLayout;

    StartupCard startupCard;
    AddCard addCard;
    DashCard dashCard;
    MyGoals myGoals;
    Todo todo;
    Priority priority;

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
        startupCard = new StartupCard(mainPanel, cardLayout);
        addCard = new AddCard(mainPanel, cardLayout);
        dashCard = new DashCard(mainPanel, cardLayout);
        myGoals = new MyGoals(mainPanel, cardLayout);
        todo = new Todo(mainPanel, cardLayout);
        priority = new Priority(mainPanel, cardLayout);

        //add Cards into panel and control the flow of cards;
        
        

        displayCards();

        //add mainPanel into frame;
        this.add(mainPanel);

        this.setVisible(true);
    }

    private void displayCards(){
        DBManagement dbManagement = new DBManagement();
        
        boolean setupFlag = dbManagement.isSetupCompleted();

        System.out.println(setupFlag);

        mainPanel.add(startupCard, "StartupCard");
    mainPanel.add(dashCard, "DashCard");
    mainPanel.add(myGoals, "MyGoals");
    mainPanel.add(todo, "Todo");
    mainPanel.add(priority, "Priority");
    mainPanel.add(addCard, "AddCard");

    if (!setupFlag) {
        // Show StartupCard for setup on first run
        cardLayout.show(mainPanel, "StartupCard");
    } else {
        // Skip setup and show DashCard
        cardLayout.show(mainPanel, "DashCard");
    }
    }
}
