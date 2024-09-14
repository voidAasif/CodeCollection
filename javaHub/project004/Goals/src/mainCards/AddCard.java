package mainCards;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import goalAddCard.GoalCategory;
import goalAddCard.GoalDesc;
import goalAddCard.GoalEnd;
import goalAddCard.GoalName;
import goalAddCard.GoalStart;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AddCard extends JPanel implements ActionListener {

    JPanel mainPanel;
    CardLayout cardLayout;

    Color themeColor = new Color(0xFFFFFF);
    JButton nextButton, previousButton;

    //icon for button;
    ImageIcon nextButtonIcon = new ImageIcon(getClass().getResource("/res/icons/next.png"));
    ImageIcon previousButtonIcon = new ImageIcon(getClass().getResource("/res/icons/previous.png"));
    int buttonWidth = 50;
    int buttonHeight = buttonWidth;

    JPanel goalCardContainer, bottomPanel;
    CardLayout innerPanelCardLayout;

    public AddCard(JPanel mainPanel, CardLayout cardLayout){
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        this.setLayout(new BorderLayout());

        GoalName goalName = new GoalName(goalCardContainer, innerPanelCardLayout);
        GoalDesc goalDesc = new GoalDesc(goalCardContainer, innerPanelCardLayout);
        GoalCategory goalCategory = new GoalCategory(goalCardContainer, innerPanelCardLayout);
        GoalStart goalStart = new GoalStart(goalCardContainer, innerPanelCardLayout);
        GoalEnd goalEnd = new GoalEnd(goalCardContainer, innerPanelCardLayout);
        
        //top panel;
        goalCardContainer = new JPanel(innerPanelCardLayout);
        goalCardContainer.add(goalName, "GoalName");
        goalCardContainer.add(goalDesc, "goalDesc");
        goalCardContainer.add(goalCategory, "goalCategory");
        goalCardContainer.add(goalStart, "goalStart");
        goalCardContainer.add(goalEnd, "goalEnd");
        goalCardContainer.setBackground(Color.RED);
        
        //create button;
        previousButton = createButton(previousButtonIcon);
        nextButton = createButton(nextButtonIcon);

        //action;
        previousButton.addActionListener(this);
        nextButton.addActionListener(this);


        //bottom panel;
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10)); //gap between buttons;
        bottomPanel.setPreferredSize(new Dimension(0, 80));
        bottomPanel.add(previousButton);
        bottomPanel.add(nextButton);

        //add both panel into main panel;
        this.add(goalCardContainer, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);


    } //end constructor;
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == nextButton){
            innerPanelCardLayout.next(goalCardContainer);
        }
        if(arg0.getSource() == previousButton){
            innerPanelCardLayout.previous(goalCardContainer);
        }
    }

    private JButton createButton(ImageIcon buttonIcon){
        JButton button = new JButton();
        buttonIcon.setImage(buttonIcon.getImage().getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH));
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        button.setIcon(buttonIcon);
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);

        return button;
    }
}
