package javaHub.FrameSwing.practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame implements ActionListener{

    JButton addButton, deleteButton;
    JPanel scrollContainerPanel;
    JScrollPane componentContainer;
    JTextField textField;

    public int labelCount = 0;

    MainFrame(){
        this.setTitle("Dynamic label");
        this.setLayout(new BorderLayout());
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //create text field;
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 50));

        //create button;
        addButton = createButton("Add");
        deleteButton = createButton("Delete");

        //action;
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        scrollContainerPanel = new JPanel();
        scrollContainerPanel.setLayout(new BorderLayout());
        scrollContainerPanel.setBackground(Color.CYAN);

        
        //add scrollPane into panel;
        componentContainer = new JScrollPane(scrollContainerPanel);
        // componentContainer.add(scrollContainerPanel, BorderLayout.CENTER);


        //add all component into scrollPane;
        //left side;
        componentContainer.add(textField, BorderLayout.WEST);
        componentContainer.add(addButton, BorderLayout.WEST);
        componentContainer.add(deleteButton, BorderLayout.WEST);

        //now right side add labels; but in action method bcz i want to add label dynamically;
        

        //add panel into frame;
        this.add(scrollContainerPanel, BorderLayout.CENTER);

        //frame;
        this.setVisible(true);
    }

    private JButton createButton(String title){
        JButton button = new JButton(title);
        button.setFocusable(false);
        button.setPreferredSize(new Dimension(70, 30));
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == addButton) {
            //add label;
            addLabel(textField.getText());
        }
        if (arg0.getSource() == deleteButton) {
            //delete label;
            deleteLabel(textField.getText());
        }
    }

    private void addLabel(String text){
        JLabel label = new JLabel(text + ++labelCount);
        label.setPreferredSize(new Dimension(150, 100));
        label.setBackground(Color.RED);
        componentContainer.add(label);

        componentContainer.revalidate();
        componentContainer.repaint();
    }
    private void deleteLabel(String text){

    }
}

public class j008_dynamicLabel {
    public static void main(String[] args) {
        new MainFrame();
    }
}