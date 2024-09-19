package mainCards;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import SoundControl.*;

public class MyGoals extends JPanel implements ActionListener {
    JPanel mainPanel;
    CardLayout cardLayout;

    ImageIcon previousButtonIcon = new ImageIcon(getClass().getResource("/res/icons/previous.png"));
    ImageIcon addButtonIcon = new ImageIcon(getClass().getResource("/res/icons/addButton.png"));
    ImageIcon updateButtonIcon = new ImageIcon(getClass().getResource("/res/icons/updateButton.png"));
    ImageIcon deleteButtonIcon = new ImageIcon(getClass().getResource("/res/icons/removeButton.png"));
    int previousButtonWidth = 30;
    int previousButtonHeight = previousButtonWidth;
    JButton previousButton;
    JLabel cardTitle;
    JPanel topPanel, midPanel, bottomPanel;
    JButton addButton, updateButton, deleteButton;

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
        midPanel.setBackground(Color.ORANGE);


        // code; //pending;








        //control buttons for bottom panel;
        addButton = createButton(addButtonIcon);
        addButton.addActionListener(this);

        updateButton = createButton(updateButtonIcon);
        updateButton.addActionListener(this);

        deleteButton = createButton(deleteButtonIcon);
        deleteButton.addActionListener(this);


        //bottomPanel to contains operations buttons;
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        bottomPanel.add(addButton);
        bottomPanel.add(updateButton);
        bottomPanel.add(deleteButton);


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
            // cardLayout.show(mainPanel, "AddCard"); //temp block navigation;
        }
        if(arg0.getSource() == updateButton){
            soundEffect.playSound("/res/audio/buttonClick.wav");
        }
        if(arg0.getSource() == deleteButton){
            soundEffect.playSound("/res/audio/buttonClick.wav");
        }
    }
}