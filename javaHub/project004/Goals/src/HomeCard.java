import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.Timer;


public class HomeCard extends JPanel implements ActionListener{

    JPanel titleContainer, midContainer, buttonContainer;
    JLabel mainTitle, title, slogan;
    JButton addGoalButton;

    Color themeColor = new Color(0xFFFFFF);

    //icon for button;
    ImageIcon addIcon = new ImageIcon(getClass().getResource("/res/icons/add.png"));
    ImageIcon addIconAfter = new ImageIcon(getClass().getResource("/res/icons/afterAdd.png"));
    int addButtonWidth = 60;
    int addButtonHeight = addButtonWidth;

    JPanel mainPanel;
    CardLayout cardLayout;

    HomeCard(JPanel mainPanel, CardLayout cardLayout){
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;


        this.setLayout(new BorderLayout());

        //create all labels;
        mainTitle = createLabel("Goal Tracking", 30);
        title = createLabel("Goal", 100);
        slogan = createLabel("We manage your goals and help you to achieve your Dreams", 15);

        //create a button;
        addIcon.setImage(addIcon.getImage().getScaledInstance(addButtonWidth, addButtonHeight, Image.SCALE_SMOOTH));
        addGoalButton = new JButton();
        addGoalButton.setIcon(addIcon);
        addGoalButton.setFocusable(false);
        addGoalButton.setBackground(null);
        addGoalButton.setBorder(null);
        addGoalButton.setContentAreaFilled(false);
        addGoalButton.setPreferredSize(new Dimension(addButtonWidth, addButtonHeight));
        
        //action;
        addGoalButton.addActionListener(this);

        //define panels to contains components;
        titleContainer = new JPanel();
        titleContainer.setPreferredSize(new Dimension(0, 60)); // 0 -> auto;
        titleContainer.add(mainTitle);
        titleContainer.setBackground(themeColor);
        
        
        midContainer = new JPanel(new GridLayout(2,1));
            JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 50));
                titlePanel.setBackground(null);
                titlePanel.add(title);
            JPanel sloganPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                sloganPanel.setBackground(null);
                sloganPanel.add(slogan);
        midContainer.add(titlePanel);
        midContainer.add(sloganPanel);
        midContainer.setBackground(themeColor);
        midContainer.setOpaque(true);
        
        
        buttonContainer = new JPanel();
        buttonContainer.setPreferredSize(new Dimension(0, 100)); // 0 -> auto;
        buttonContainer.add(addGoalButton);
        buttonContainer.setBackground(themeColor);



        //add labels and buttons into Panel;
        this.add(titleContainer, BorderLayout.NORTH);
        this.add(midContainer, BorderLayout.CENTER);
        this.add(buttonContainer, BorderLayout.SOUTH);

        
    }//end constructor;

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == addGoalButton){
            clickEffect();
            
            Timer timer = new Timer(400, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    cardLayout.show(mainPanel, "AddCard");
                }   
            }); 
            timer.setRepeats(false);  // Only execute once
            timer.start();  // Start the timer           
        }
    }

    //create labels;
    private JLabel createLabel(String text, int size){ 
        JLabel label = new JLabel(text);
        // label.setPreferredSize(new Dimension(200, 200));
        label.setFont(new Font("SansSerif", Font.BOLD, size));

        return label;
    }

    //button click effect;
    private void clickEffect(){
        addIconAfter.setImage(addIconAfter.getImage().getScaledInstance(addButtonWidth, addButtonHeight, Image.SCALE_SMOOTH));
        addGoalButton.setIcon(addIconAfter);
        
        // Restore the original size after a delay using a timer
        Timer timer = new Timer(200, new ActionListener() { //work in actionListener, after given time execute another actionListener;
            @Override
            public void actionPerformed(ActionEvent e) {
                // Restore the original icon size
                addIcon.setImage(addIcon.getImage().getScaledInstance(addButtonWidth, addButtonHeight, Image.SCALE_SMOOTH));
                addGoalButton.setIcon(addIcon);
            }
        });
        
        // Start the timer and stop after 1 action
        timer.setRepeats(false);  // Only execute once
        timer.start();  // Start the timer
    }

    
}
