package mainCards;
import javax.swing.JPanel;

import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

import SoundControl.*;

public class DashCard extends JPanel implements ActionListener {

    JPanel mainPanel;
    CardLayout cardLayout;

    JPanel topPanel, bottomPanel;

    //declare component for top Panel;
    JButton myGoalsButton, dailyTaskButton, priorityButton;

    ImageIcon myGoalsButton_icon = new ImageIcon(getClass().getResource("/res/icons/myGoals.png"));
    ImageIcon dailyTaskButton_icon = new ImageIcon(getClass().getResource("/res/icons/dailyTask.png"));
    ImageIcon priorityButton_icon = new ImageIcon(getClass().getResource("/res/icons/priority.png"));

    Color dashTheme = new Color(0xDCF4F7);

    SoundEffect soundEffect = new SoundEffect();

    //dashBoard display data;
    JLabel goalName, endDate, countDown;
    JPanel container1, innerContainer1, container2, dateContainer;
    
    public DashCard(){
        initUI();
    }

    public DashCard(JPanel mainPanel, CardLayout cardLayout){
        this();

        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
    }

    private void initUI(){
        this.setLayout(new BorderLayout(0, 50));
        this.setBackground(dashTheme);

        topPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 20, 20));
        topPanel.setBackground(null);

        myGoalsButton = createButton(myGoalsButton_icon);
        dailyTaskButton = createButton(dailyTaskButton_icon);
        priorityButton = createButton(priorityButton_icon);

        //button actions;
        myGoalsButton.addActionListener(this);
        dailyTaskButton.addActionListener(this);
        priorityButton.addActionListener(this);


        topPanel.add(myGoalsButton);
        topPanel.add(dailyTaskButton);
        topPanel.add(priorityButton);

        //component for bottom panel;
        goalName = new JLabel("ABC Goal"); //demo data;
        goalName.setFont(new Font("Arial", Font.BOLD, 35));
        goalName.setBackground(null);

        endDate = new JLabel("00-00-0000"); //demo data;
        endDate.setFont(new Font("Arial", Font.BOLD, 25));
        endDate.setBackground(null);

        countDown = new JLabel("365"); //demo data;
        countDown.setFont(new Font("Arial", Font.BOLD, 200));
        countDown.setBackground(null);

        dateContainer = new JPanel();
        dateContainer.add(endDate);
        dateContainer.setBackground(null);

        innerContainer1 = new JPanel(new GridLayout(2, 1));
        innerContainer1.add(goalName);
        innerContainer1.add(dateContainer);
        innerContainer1.setBackground(null);

        container1 = new JPanel();
        container1.setBackground(null);
        container1.add(innerContainer1);
        container1.setBackground(null);

        container2 = new JPanel();
        container2.add(countDown);
        container2.setBackground(null);


        //bottom Panel;
        bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(null);
        // bottomPanel.setBackground(Color.ORANGE);

        //add component into bottom panel;
        bottomPanel.add(container1, BorderLayout.NORTH);
        bottomPanel.add(container2, BorderLayout.CENTER);

        //add topPanel and BottomPanel into this panel;
        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.CENTER);

    }

    private JButton createButton(ImageIcon buttonIcon){
        JButton button = new JButton();
        button.setIcon(buttonIcon);
        button.setFocusable(false);
        button.setBorder(null);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);

        return button;
    }

    //button actions;
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == myGoalsButton){ //open my Goals page after click on this button;
            // System.out.println("myGoals button clicked"); //log;
            soundEffect.playSound("/res/audio/buttonClick.wav");
            cardLayout.show(mainPanel, "MyGoals");

        }
        if(arg0.getSource() == dailyTaskButton){ //open daily task page after click on this button;
            // System.out.println("dailyTask button clicked"); //log;
            soundEffect.playSound("/res/audio/buttonClick.wav");
            // cardLayout.show(mainPanel, "Todo");

        }
        if(arg0.getSource() == priorityButton){ //open priority page after click on this button;
            // System.out.println("priority button clicked"); //log;
            soundEffect.playSound("/res/audio/buttonClick.wav");
            // cardLayout.show(mainPanel, "Priority");

        }
    } 
}
