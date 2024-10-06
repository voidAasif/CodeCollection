package mainCards;
import javax.swing.JPanel;

import CustomComponent.MyGoalsListItem;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JScrollPane;

import SoundControl.*;
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

    JScrollPane midPanelScroll;

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
        // System.out.println("MY Goals"); //log;
        this.setLayout(new BorderLayout());
        this.addComponentListener(new ComponentListener() {

            @Override
            public void componentHidden(ComponentEvent arg0) {}

            @Override
            public void componentMoved(ComponentEvent arg0) {}

            @Override
            public void componentResized(ComponentEvent arg0) {}

            @Override
            public void componentShown(ComponentEvent arg0) { updateList(); }
            
        });

        //buttons icons;
        
        
        //previous button;
        previousButton = createPreviousButton(previousButtonIcon);
        previousButton.addActionListener(this);

        //previous button container;
        topPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 10));
        topPanel.add(previousButton);
        topPanel.add(new JLabel("My Goals"));

        //midPanel to contains user goals list;
        midPanel = new JPanel();
        midPanel.setLayout(new BoxLayout(midPanel, BoxLayout.Y_AXIS));

        //scrollPane to contain midPanel;
        midPanelScroll = new JScrollPane(midPanel);
        midPanelScroll.setBorder(null);

        //control buttons for bottom panel;
        addButton = createButton(addButtonIcon);
        addButton.addActionListener(this);


        //bottomPanel to contains operations buttons;
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        bottomPanel.add(addButton);

        //add components into this panel;
        this.add(topPanel, BorderLayout.NORTH);
        this.add(midPanelScroll, BorderLayout.CENTER);
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
            soundEffect.playSound("/res/audio/slides.wav");
            cardLayout.show(mainPanel, "DashCard");
        }
        if(arg0.getSource() == addButton){
            soundEffect.playSound("/res/audio/addButton.wav");
            cardLayout.show(mainPanel, "AddCard"); //temp block navigation;
        }
    }

    private void updateList(){
        midPanel.removeAll();
        DBManagement dbManagement = new DBManagement(); //receive name and end date to add into list Item;

        List<String> nameList = dbManagement.getNameList();
        List<Date> endDateList = dbManagement.getEndDateList();

        // System.out.println(nameList); //debug;

        for(int i=0; i<nameList.size(); i++){
            midPanel.add(new MyGoalsListItem(midPanel, midPanelScroll, nameList.get(i), endDateList.get(i))); //add new listItem;
            midPanel.add(Box.createVerticalStrut(10)); //add vertical gap between listItems;

            midPanelScroll.revalidate();
            midPanelScroll.repaint();

        }

    }

}


