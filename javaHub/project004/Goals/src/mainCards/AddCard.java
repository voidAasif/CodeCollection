package mainCards;

import javax.swing.JPanel;

import DBase.DBManagement;
import goalInputCards.GoalCategory;
import goalInputCards.GoalDesc;
import goalInputCards.GoalEnd;
import goalInputCards.GoalName;
import goalInputCards.GoalStart;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AddCard extends JPanel implements ActionListener {

    JPanel mainPanel;
    CardLayout cardLayout;

    Color themeColor = new Color(0xFFFFFF);
    JButton nextButton, previousButton, tempButton; //temp;

    //icon for button;
    ImageIcon nextButtonIcon = new ImageIcon(getClass().getResource("/res/icons/next.png"));
    ImageIcon previousButtonIcon = new ImageIcon(getClass().getResource("/res/icons/previous.png"));
    int buttonWidth = 50;
    int buttonHeight = buttonWidth;

    JPanel goalCardContainer, bottomPanel;
    CardLayout goalCardContainerLayout;

    public AddCard(JPanel mainPanel, CardLayout cardLayout){
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        this.setLayout(new BorderLayout());

        goalCardContainerLayout = new CardLayout();
        goalCardContainer = new JPanel(goalCardContainerLayout);

        GoalName goalName = new GoalName(goalCardContainer, goalCardContainerLayout);
        GoalDesc goalDesc = new GoalDesc(goalCardContainer, goalCardContainerLayout);
        GoalCategory goalCategory = new GoalCategory(goalCardContainer, goalCardContainerLayout);
        GoalStart goalStart = new GoalStart(goalCardContainer, goalCardContainerLayout);
        GoalEnd goalEnd = new GoalEnd(goalCardContainer, goalCardContainerLayout);
        
        //top panel;
        goalCardContainer = new JPanel(goalCardContainerLayout);
        goalCardContainer.add(goalName, "card1");
        goalCardContainer.add(goalDesc, "card2");
        goalCardContainer.add(goalCategory, "card3");
        goalCardContainer.add(goalStart, "card4");
        goalCardContainer.add(goalEnd, "card5");
        
        //create button;
        previousButton = createButton(previousButtonIcon);
        nextButton = createButton(nextButtonIcon);
        tempButton = createButton(nextButtonIcon);

        //action;
        previousButton.addActionListener(this);
        nextButton.addActionListener(this);
        tempButton.addActionListener(this);
        

        //bottom panel;
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10)); //gap between buttons;
        bottomPanel.setPreferredSize(new Dimension(0, 80));
        bottomPanel.add(previousButton);
        bottomPanel.add(nextButton);

        //add both panel into main panel;
        this.add(goalCardContainer, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);

        //control next and previous button;
        previousButton.setEnabled(false);


    } //end constructor;
    
    @Override
    public void actionPerformed(ActionEvent arg0) {

        if(arg0.getSource() == nextButton){
            goalCardContainerLayout.next(goalCardContainer);
            
            buttonEnableControl();
        }
        if(arg0.getSource() == previousButton){
            goalCardContainerLayout.previous(goalCardContainer);
            
            buttonEnableControl();
        }
        if(arg0.getSource() == tempButton){ //temp;
            setInputGoal();

            cardLayout.show(mainPanel, "DashCard");

        }
    }

    private void buttonEnableControl(){
        if(goalCardContainer.getComponent(0).isVisible()){
            previousButton.setEnabled(false);
        }
        else{
            previousButton.setEnabled(true);
        }
        if(goalCardContainer.getComponent(4).isVisible()){
            bottomPanel.remove(nextButton);
            bottomPanel.add(tempButton);
            tempButton.setEnabled(true);
        }
        else {
            nextButton.setEnabled(true);
        }

        //also same;
        // previousButton.setEnabled(!goalCardContainer.getComponent(0).isVisible());
        // nextButton.setEnabled(!goalCardContainer.getComponent(4).isVisible());
    }

    private void setInputGoal(){
        new DBManagement();
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
