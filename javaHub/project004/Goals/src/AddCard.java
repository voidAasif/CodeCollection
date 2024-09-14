import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;


public class AddCard extends JPanel implements ActionListener {
    //set controls;
    JPanel mainPanel;
    CardLayout cardLayout;

    Color themeColor = new Color(0xFFFFFF);

    JLabel goalName, goalCategory, goalDescription, goalStartDate, goalTargetDate;
    JTextField goalNameField, goalCategoryField, goalDescriptionField, goalStartDateField, goalTargetDateField;
    JPanel namePanel, categoryPanel, descriptionPanel, startPanel, targetPanel;
    JButton done;

    //icon for button;
    ImageIcon listAddIcon = new ImageIcon(getClass().getResource("/res/icons/listAdd.png"));
    ImageIcon listAddAfterIcon = new ImageIcon(getClass().getResource("/res/icons/listAddAfter.png"));
    int doneButtonWidth = 50;
    int doneButtonHeight = doneButtonWidth;

    AddCard(JPanel mainPanel, CardLayout cardLayout){
        this.mainPanel = mainPanel;
        this.cardLayout = cardLayout;

        //panel;
        // this.setBackground(Color.WHITE);
        // this.setOpaque(true);
        this.setLayout(new BorderLayout());

        //labels;
        goalName = createLabel("Goal: ");
        goalCategory = createLabel("Category: ");
        goalDescription = createLabel("Description: ");
        goalStartDate = createLabel("Start: ");
        goalTargetDate = createLabel("Target: ");

        //textFields;
        goalNameField = createTextField();
        goalCategoryField = createTextField();
        goalDescriptionField = createTextField();
        goalStartDateField = createTextField();
        goalTargetDateField = createTextField();

        //individual container;
        namePanel = createFieldContainer();
        categoryPanel = createFieldContainer();
        descriptionPanel = createFieldContainer();
        startPanel = createFieldContainer();
        targetPanel = createFieldContainer();

        //add textFields and labels into panel;
        namePanel.add(goalName);
        namePanel.add(goalNameField);

        categoryPanel.add(goalCategory);
        categoryPanel.add(goalCategoryField);

        descriptionPanel.add(goalDescription);
        descriptionPanel.add(goalDescriptionField);

        startPanel.add(goalStartDate);
        startPanel.add(goalStartDateField);

        targetPanel.add(goalTargetDate);
        targetPanel.add(goalTargetDateField);

        //create a button;
        listAddIcon.setImage(listAddIcon.getImage().getScaledInstance(doneButtonWidth, doneButtonHeight, Image.SCALE_SMOOTH));
        done = new JButton();
        done.setIcon(listAddIcon);
        done.setFocusable(false);
        done.setBackground(null);
        done.setBorder(null);
        done.setContentAreaFilled(false);
        done.setPreferredSize(new Dimension(doneButtonWidth, doneButtonHeight));

        //action;
        done.addActionListener(this);
        

        //labels and textField container panel;
        JPanel all_fieldsContainerPanel = new JPanel(new GridLayout(5, 1));
        all_fieldsContainerPanel.setBackground(themeColor);

        //add all group panel into all_fieldContainerPanel;
        all_fieldsContainerPanel.add(namePanel);
        all_fieldsContainerPanel.add(categoryPanel);
        all_fieldsContainerPanel.add(descriptionPanel);
        all_fieldsContainerPanel.add(startPanel);
        all_fieldsContainerPanel.add(targetPanel);


        JPanel buttonContainerPanel = new JPanel();
        buttonContainerPanel.setBackground(themeColor);
        buttonContainerPanel.setPreferredSize(new Dimension(0, 100)); //0 -> auto;
        buttonContainerPanel.add(done);


        //add both two panels into this panel;
        this.add(all_fieldsContainerPanel, BorderLayout.CENTER);
        this.add(buttonContainerPanel, BorderLayout.SOUTH);

    } //end constructor;
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == done){
            clickEffect();
            
            Timer timer = new Timer(400, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    cardLayout.show(mainPanel, "DashCard");
                }   
            }); 
            timer.setRepeats(false);  // Only execute once
            timer.start();  // Start the timer 
        }
    }

    private JLabel createLabel(String text){
        JLabel label = new JLabel(text);
        label.setPreferredSize(new Dimension(150, 30));
        label.setFont(new Font("SansSerif", Font.BOLD, 20));

        return label;
    }

    private JTextField createTextField(){
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 50));
        textField.setFont(new Font("SansSerif", Font.BOLD, 16));

        return textField;
    }

    private JPanel createFieldContainer(){
        JPanel panel = new JPanel();
        panel.setBackground(themeColor);

        return panel;
    }

    private void clickEffect(){
        listAddAfterIcon.setImage(listAddAfterIcon.getImage().getScaledInstance(doneButtonWidth, doneButtonHeight, Image.SCALE_SMOOTH));
        done.setIcon(listAddAfterIcon);
        
        // Restore the original size after a delay using a timer
        Timer timer = new Timer(200, new ActionListener() { //work in actionListener, after given time execute another actionListener;
            @Override
            public void actionPerformed(ActionEvent e) {
                // Restore the original icon size
                listAddIcon.setImage(listAddIcon.getImage().getScaledInstance(doneButtonWidth, doneButtonHeight, Image.SCALE_SMOOTH));
                done.setIcon(listAddIcon);
            }
        });
        
        // Start the timer and stop after 1 action
        timer.setRepeats(false);  // Only execute once
        timer.start();  // Start the timer
    }

}
