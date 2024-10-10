package mainCards;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.BorderFactory;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.Box;
import javax.swing.BoxLayout;

import java.sql.Date;

import CustomComponent.TodoListItemDone;
import CustomComponent.TodoListItemNotDone;
import DBase.DBManagement;
import SoundControl.*;

public class Todo extends JPanel implements ActionListener, ComponentListener {
    JPanel mainPanel;
    CardLayout cardLayout;

    ImageIcon previousButtonIcon = new ImageIcon(getClass().getResource("/res/icons/previous.png"));
    // ImageIcon addButtonIcon = new ImageIcon(getClass().getResource("/res/icons/addButton.png"));

    int previousButtonWidth = 30;
    int previousButtonHeight = previousButtonWidth;
    JButton previousButton;
    JLabel cardTitle;
    JPanel topPanel, midPanel, inCompleteTaskPanel, completedTaskPanel;

    JScrollPane inCompleteTaskPanelScroll, completedTaskPanelScroll;

    SoundEffect soundEffect = new SoundEffect();

    public Todo(){
        initUI();
    }

    public Todo(JPanel mainPanel, CardLayout cardLayout){
        this();

        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout; 
    }

    private void initUI(){
        // System.out.println("MY Goals"); //log;
        this.setLayout(new BorderLayout());
        this.addComponentListener(this);
        
        //previous button;
        previousButton = createPreviousButton(previousButtonIcon);
        previousButton.addActionListener(this);

        //previous button container;
        topPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 10));
        topPanel.add(previousButton);
        topPanel.add(new JLabel("Todo"));

        // add both done or notDone panel into midPanel and remove scroll from midPanel;

        //midPanel to contains user goals list;
        midPanel = new JPanel(new GridLayout(2, 1));
        midPanel.setBackground(null);

        inCompleteTaskPanel = new JPanel(); //panel contains incomplete task;
        inCompleteTaskPanel.setLayout(new BoxLayout(inCompleteTaskPanel, BoxLayout.Y_AXIS));
        // inCompleteTaskPanel.setBackground(Color.RED); //temp;

        completedTaskPanel = new JPanel(); //panel contains complete task;
        completedTaskPanel.setLayout(new BoxLayout(completedTaskPanel, BoxLayout.Y_AXIS));
        // completedTaskPanel.setBackground(Color.BLUE); //temp;

        //scrollPane for complete on incomplete task;
        inCompleteTaskPanelScroll = new JScrollPane(inCompleteTaskPanel);
        inCompleteTaskPanelScroll.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.WHITE));
        completedTaskPanelScroll = new JScrollPane(completedTaskPanel);
        completedTaskPanelScroll.setBorder(null);

        midPanel.add(inCompleteTaskPanelScroll);
        midPanel.add(completedTaskPanelScroll);

        //add components into this panel;
        this.add(topPanel, BorderLayout.NORTH);
        this.add(midPanel, BorderLayout.CENTER);
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

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == previousButton){
            soundEffect.playSound("/res/audio/slides.wav");
            cardLayout.show(mainPanel, "DashCard");
        }
    }

    @Override
    public void componentHidden(ComponentEvent arg0) {}

    @Override
    public void componentMoved(ComponentEvent arg0) {}

    @Override
    public void componentResized(ComponentEvent arg0) {}
    
    @Override
    public void componentShown(ComponentEvent arg0) { checkToday(); }

    private void checkToday(){
        DBManagement dbManagement = new DBManagement();

        boolean dateFlag = dbManagement.getWhichDate(); //it must be return bool;

        incompleteGoals();
        completeGoals();
    }
    
    // update inCompleteTaskPanel;
    private void incompleteGoals(){
        inCompleteTaskPanel.removeAll();
        DBManagement dbManagement = new DBManagement();
        List<String> goalNameList = new ArrayList<>();

        goalNameList = dbManagement.getIncompleteGoals();

        goalNameList.forEach(goalName -> {inCompleteTaskPanel.add(new TodoListItemNotDone(completedTaskPanel, inCompleteTaskPanel, inCompleteTaskPanelScroll, goalName));});

        inCompleteTaskPanel.revalidate();
        inCompleteTaskPanel.repaint();
        inCompleteTaskPanelScroll.revalidate();
        inCompleteTaskPanelScroll.repaint();
    }

    // update completedTaskPanel;
    private void completeGoals(){
        completedTaskPanel.removeAll();
        DBManagement dbManagement = new DBManagement();
        List<String> goalNameList = new ArrayList<>();

        goalNameList = dbManagement.getCompleteGoals();

        goalNameList.forEach(goalName -> {completedTaskPanel.add(new TodoListItemDone(inCompleteTaskPanel, completedTaskPanel, completedTaskPanelScroll, goalName));});

        completedTaskPanel.revalidate();
        completedTaskPanel.repaint();
        completedTaskPanelScroll.revalidate();
        completedTaskPanelScroll.repaint();
    }

}

