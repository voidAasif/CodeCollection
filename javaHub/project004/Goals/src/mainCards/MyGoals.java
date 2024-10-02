package mainCards;
import javax.swing.JPanel;

import CustomComponent.ListItem;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.BoxLayout;

import SoundControl.*;
import CustomComponent.ListItem;
import java.sql.Date;

import DBase.DBManagement;

public class MyGoals extends JPanel implements ActionListener {
    JPanel mainPanel;
    CardLayout cardLayout;

    ImageIcon previousButtonIcon = new ImageIcon(getClass().getResource("/res/icons/previous.png"));
    ImageIcon addButtonIcon = new ImageIcon(getClass().getResource("/res/icons/addButton.png"));

    int previousButtonWidth = 30;
    int previousButtonHeight = previousButtonWidth;
    JButton previousButton;
    JLabel cardTitle;
    JPanel topPanel, midPanel, bottomPanel;
    JButton addButton;

    SoundEffect soundEffect = new SoundEffect();

    public MyGoals(){
        initUI();
    }

    public MyGoals(JPanel mainPanel, CardLayout cardLayout){
        this();

        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;
        
    }

    private void initUI(){
        System.out.println("MY Goals"); //log;
        this.setLayout(new BorderLayout());

        //buttons icons;
        
        
        //previous button;
        previousButton = createPreviousButton(previousButtonIcon);
        previousButton.addActionListener(this);

        //previous button container;
        topPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 10));
        topPanel.add(previousButton);
        topPanel.add(new JLabel("My Goals"));

        //midPanel to contains user goals list;
        midPanel = new JPanel(); //pending;
        midPanel.setLayout(new BoxLayout(midPanel, BoxLayout.Y_AXIS));
        midPanel.setBackground(Color.ORANGE);

        updateList();

        //control buttons for bottom panel;
        addButton = createButton(addButtonIcon);
        addButton.addActionListener(this);


        //bottomPanel to contains operations buttons;
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        bottomPanel.add(addButton);

        //add components into this panel;
        this.add(topPanel, BorderLayout.NORTH);
        this.add(midPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
    }

    private JButton createPreviousButton(ImageIcon buttonIcon){
        JButton button = new JButton();
        buttonIcon.setImage(buttonIcon.getImage().getScaledInstance(previousButtonWidth, previousButtonHeight, Image.SCALE_SMOOTH));
        button.setIcon(buttonIcon);
        button.setPreferredSize(new Dimension(previousButtonWidth, previousButtonHeight));
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);

        return button;
    }

    private JButton createButton(ImageIcon buttonIcon){
        JButton button = new JButton();
        button.setIcon(buttonIcon);
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == previousButton){
            soundEffect.playSound("/res/audio/buttonClick.wav");
            cardLayout.show(mainPanel, "DashCard");
        }
        if(arg0.getSource() == addButton){
            soundEffect.playSound("/res/audio/buttonClick.wav");
            cardLayout.show(mainPanel, "AddCard"); //temp block navigation;
        }
    }

    private void updateList(){
        DBManagement dbManagement = new DBManagement(); //receive name and end date to add into list Item;

        List<String> nameList = dbManagement.getNameList();
        List<Date> endDateList = dbManagement.getEndDateList();

        for(int i=0; i<nameList.size(); i++){
            midPanel.add(new ListItem(midPanel, nameList.get(i), endDateList.get(i)));
        }

        this.revalidate();
        this.repaint();
    }

}


