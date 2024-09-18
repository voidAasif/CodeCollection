package mainCards;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        this.setBackground(null);

        topPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 20, 20));
        topPanel.setBackground(dashTheme);

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


        //bottom Panel;
        bottomPanel = new JPanel();
        bottomPanel.setBackground(dashTheme);

        //add component into bottom panel;
        

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
            System.out.println("myGoals button clicked"); //log;
            soundEffect.playSound("/res/audio/buttonClick.wav");
        }
        if(arg0.getSource() == dailyTaskButton){ //open daily task page after click on this button;
            System.out.println("dailyTask button clicked"); //log;
            soundEffect.playSound("/res/audio/buttonClick2.wav");
        }
        if(arg0.getSource() == priorityButton){ //open priority page after click on this button;
            System.out.println("priority button clicked"); //log;
        }
    } 
}
