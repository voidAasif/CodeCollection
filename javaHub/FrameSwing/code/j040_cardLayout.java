package javaHub.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout; //imports;

class CardDemo extends JFrame {

    JPanel mainPanel;
    JLabel label1, label2, label3;

    CardDemo(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("I am label 1"); //content of card 1;
        label2 = new JLabel("I am label 2"); //content of card 2;
        label3 = new JLabel("I am label 3"); //content of card3;


        //create panel with card Layout;
        mainPanel = new JPanel(); //main panel which contains all cards;
        CardLayout cardLayout = new CardLayout(); //create an object of card layout to manually control the card stack;
        mainPanel.setLayout(cardLayout); //set card layout on main panel;
        

        // add cards into panel;
        mainPanel.add(label1, "first"); //add cards into panel with unique id's;
        mainPanel.add(label2, "second");
        mainPanel.add(label3, "third");

        cardLayout.show(mainPanel, "second"); //display card by it's id;
        cardLayout.first(mainPanel); //display first card in stack;
        cardLayout.last(mainPanel); //display last card in stack;
        cardLayout.next(mainPanel); //display next card to the card displayed now;
        cardLayout.previous(mainPanel); //display previous card to the card displayed now;

        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
    }
}

public class j040_cardLayout {
    public static void main(String[] args) {
        new CardDemo();
    }
}
