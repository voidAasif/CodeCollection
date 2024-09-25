package goalInputCards;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

import java.awt.Image;
import java.sql.Date;
// import java.util.Date; //collide with sql Date;

import com.toedter.calendar.JCalendar;



public class GoalStart extends JPanel {
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    //goal input icon;
    ImageIcon goalIcon = new ImageIcon(getClass().getResource("/res/icons/calendar.png"));

    //card theme color;
    Color cardTheme = new Color(0xE4D1FF);

    JLabel goalFieldIcon, goalLabel;
    JCalendar startDate;
    JPanel goalLabelContainer, goalFieldContainer;

    int goalFieldHeight = 70;

    public Date input_goalStart;

    public GoalStart(){
        initUI();
    }

    public GoalStart(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this();
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;  
    }    
    
    private void initUI(){
        //set card theme color;
        this.setBackground(cardTheme);
        
        this.setLayout(new GridLayout(2, 1));
    
        //label;
        goalLabel = new JLabel("Goal Start");
        goalLabel.setFont(new Font("SansSerif", Font.BOLD, 70));
    
        //Label Panel;
        goalLabelContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 80));
        goalLabelContainer.setBackground(null);
        goalLabelContainer.add(goalLabel);
    
        //text Field;
    
        //setLabel to contains image;
        goalIcon.setImage(goalIcon.getImage().getScaledInstance(goalFieldHeight, goalFieldHeight, Image.SCALE_SMOOTH));
        goalFieldIcon = new JLabel(goalIcon);
        goalFieldIcon.setBackground(null);
        goalFieldIcon.setBorder(null);
        goalFieldIcon.setOpaque(true);
    
        //calendar;
        startDate = new JCalendar();
        startDate.setPreferredSize(new Dimension(350, 200));
        startDate.setForeground(Color.BLACK);
    
        startDate.getDayChooser().getDayPanel().setBackground(new Color(0xCBE9F2));
        startDate.getDayChooser().getDayPanel().setForeground(Color.BLACK);
        startDate.getMonthChooser().getComboBox().setBackground(cardTheme);
        startDate.getMonthChooser().getComboBox().setForeground(Color.BLACK);
    

        //Text field panel;
        goalFieldContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        goalFieldContainer.setBackground(null);
        goalFieldContainer.add(goalFieldIcon);
        goalFieldContainer.add(startDate);
    
        //add both panels into this panel;
    
        this.add(goalLabelContainer);
        this.add(goalFieldContainer);
    }

    public void setGoalStart() {
        //use date formatter class to set YYYY-MM-DD format;
        java.util.Date simpleDate = startDate.getDate();
        java.sql.Date formattedDate = new java.sql.Date(simpleDate.getTime());

        this.input_goalStart = formattedDate;
    }

    public Date getGoalStart() {
        return input_goalStart;
    }
}
