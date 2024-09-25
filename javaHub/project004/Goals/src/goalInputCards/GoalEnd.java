package goalInputCards;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JCalendar;
// import java.util.Date; //collide with sql date;
import java.sql.Date;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Dimension;

public class GoalEnd extends JPanel {
    JPanel goalCardContainer;
    CardLayout goalCardContainerLayout;

    //goal input icon;
    ImageIcon goalIcon = new ImageIcon(getClass().getResource("/res/icons/calendar.png"));

    //card theme color;
    Color cardTheme = new Color(0xFFDAB9);

    JLabel goalFieldIcon, goalLabel;
    JCalendar endDate;
    JPanel goalLabelContainer, goalFieldContainer;

    int goalFieldHeight = 70;

    public Date input_goalEnd;

    public GoalEnd(){
        initUI();
    }

    public GoalEnd(JPanel goalCardContainer, CardLayout goalCardContainerLayout){
        this();
        this.goalCardContainer = goalCardContainer;
        this.goalCardContainerLayout = goalCardContainerLayout;
    }
    
    private void initUI(){
        //set card theme color;
        this.setBackground(cardTheme);
        
        
        this.setLayout(new GridLayout(2, 1));
    
        //label;
        goalLabel = new JLabel("Goal End");
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
        endDate = new JCalendar();
        endDate.setPreferredSize(new Dimension(350, 200));
        endDate.setForeground(Color.BLACK);
    
        endDate.getDayChooser().getDayPanel().setBackground(new Color(0xCBE9F2));
        endDate.getDayChooser().getDayPanel().setForeground(Color.BLACK);
        endDate.getMonthChooser().getComboBox().setBackground(cardTheme);
        endDate.getMonthChooser().getComboBox().setForeground(Color.BLACK);
    

    
        //Text field panel;
        goalFieldContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        goalFieldContainer.setBackground(null);
        goalFieldContainer.add(goalFieldIcon);
        goalFieldContainer.add(endDate);
    
    
        //add both panels into this panel;
    
        this.add(goalLabelContainer);
        this.add(goalFieldContainer);

    }

    public void setGoalEnd() {
        //use date formatter class to set YYYY-MM-DD format;
        java.util.Date simpleDate = endDate.getDate();
        java.sql.Date formattedDate = new java.sql.Date(simpleDate.getTime());

        this.input_goalEnd = formattedDate;
    }

    public Date getGoalEnd() {
        return input_goalEnd;
    }
}
