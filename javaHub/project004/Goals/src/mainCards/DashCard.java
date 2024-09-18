package mainCards;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashCard extends JPanel implements ActionListener {

    JPanel mainPanel;
    CardLayout cardLayout;

    JPanel topPanel, bottomPanel;

    //declare component for top Panel;
    JPanel b1Container, b2Container, b3Container;
    JButton myGoalsButton, dailyTaskButton, priorityButton;

    //4:3
    int buttonWidth = 186;
    int buttonHeight = 140;

    ImageIcon myGoalsButton_icon = new ImageIcon(getClass().getResource("/res/icons/logo.png"));
    ImageIcon dailyTaskButton_icon = new ImageIcon(getClass().getResource("/res/icons/logo.png"));
    ImageIcon priorityButton_icon = new ImageIcon(getClass().getResource("/res/icons/logo.png"));
    
    public DashCard(){
        initUI();
    }

    public DashCard(JPanel mainPanel, CardLayout cardLayout){
        this();

        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
    }

    private void initUI(){
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);

        topPanel = new JPanel(new GridLayout(1, 3));
        // topPanel.setBackground(null); //temp;
        topPanel.setPreferredSize(new Dimension(0, 150));

        //add component into top Panel;
        //buttons;
        myGoalsButton_icon.setImage(myGoalsButton_icon.getImage().getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH));
        dailyTaskButton_icon.setImage(dailyTaskButton_icon.getImage().getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH));
        priorityButton_icon.setImage(priorityButton_icon.getImage().getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH));

        myGoalsButton = createButton(myGoalsButton_icon);
        dailyTaskButton = createButton(dailyTaskButton_icon);
        priorityButton = createButton(priorityButton_icon);

        //button actions;
        myGoalsButton.addActionListener(this);
        dailyTaskButton.addActionListener(this);
        priorityButton.addActionListener(this);

        b1Container = new JPanel();
        b1Container.add(myGoalsButton);
        // b1Container.setBackground(null); //temp

        b2Container = new JPanel();
        b2Container.add(dailyTaskButton);
        // b2Container.setBackground(null); //temp;


        b3Container = new JPanel();
        b3Container.add(priorityButton);
        // b3Container.setBackground(null); //temp;


        topPanel.add(b1Container);
        topPanel.add(b2Container);
        topPanel.add(b3Container);


        //bottom Panel;
        bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.ORANGE);

        //add component into bottom panel;
        

        //add topPanel and BottomPanel into this panel;
        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.CENTER);

    }

    private JButton createButton(ImageIcon buttonIcon){
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        button.setIcon(buttonIcon);
        button.setFocusable(false);
        button.setBackground(Color.RED); //temp;
        // button.setBorder(null);
        // button.setFocusPainted(false);
        // button.setContentAreaFilled(false);

        return button;
    }

    //button actions;
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == myGoalsButton){ //open my Goals page after click on this button;
            System.out.println("myGoals button clicked"); //log;
        }
        if(arg0.getSource() == dailyTaskButton){ //open daily task page after click on this button;
            System.out.println("dailyTask button clicked"); //log;
        }
        if(arg0.getSource() == priorityButton){ //open priority page after click on this button;
            System.out.println("priority button clicked"); //log;
        }
    } 
}
