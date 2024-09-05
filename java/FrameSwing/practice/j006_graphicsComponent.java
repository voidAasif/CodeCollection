package java.FrameSwing.practice;

//#1;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class SpecificComponent extends JFrame {

    JButton button1, button2;
    JCheckBox checkBox1, checkBox2;
    JComboBox<String> comBox;

    SpecificComponent(){
        this.setTitle("Apply graphics on Specific component");
        this.setLayout(new FlowLayout());
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        button1 = new JButton("Button 1");
        button1.setPreferredSize(new Dimension(100, 50));

        button2 = new JButton("Button 2");
        button2.setPreferredSize(new Dimension(100, 50));
        
        checkBox1 = new JCheckBox("one");
        checkBox2 = new JCheckBox("two");
        checkBox1.setPreferredSize(new Dimension(100, 50));
        checkBox2.setPreferredSize(new Dimension(100, 50));

        String[] items = {"one", "two", "three"};
        comBox = new JComboBox<>(items);

        this.add(button1);
        this.add(button2);
        this.add(checkBox1);
        this.add(checkBox2);
        this.add(comBox);

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Custom painting code goes here
        g.setColor(Color.RED);
        g.fillRect(10, 10, 100, 100);
    }
}

public class j006_graphicsComponent {public static void main(String[] args) {new SpecificComponent();}}






//#2;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.Color;

// class CustomPanel extends JPanel {
//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         // Custom painting code goes here
//         g.setColor(Color.RED);
//         g.fillRect(10, 10, 100, 100);
//     }
// }

// class SpecificComponent extends JFrame {

//     JButton button1, button2;
//     JCheckBox checkBox1, checkBox2;
//     JComboBox<String> comBox;

//     SpecificComponent(){
//         this.setTitle("Apply graphics on Specific component");
//         this.setLayout(new FlowLayout());
//         this.setSize(700, 700);
//         this.setLocationRelativeTo(null);
//         this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//         button1 = new JButton("Button 1");
//         button1.setPreferredSize(new Dimension(100, 50));

//         button2 = new JButton("Button 2");
//         button2.setPreferredSize(new Dimension(100, 50));
        
//         checkBox1 = new JCheckBox("one");
//         checkBox2 = new JCheckBox("two");
//         checkBox1.setPreferredSize(new Dimension(100, 50));
//         checkBox2.setPreferredSize(new Dimension(100, 50));

//         String[] items = {"one", "two", "three"};
//         comBox = new JComboBox<>(items);

//         CustomPanel customPanel = new CustomPanel();
//         customPanel.add(button1);
//         customPanel.add(button2);
//         customPanel.add(checkBox1);
//         customPanel.add(checkBox2);
//         customPanel.add(comBox);
        
//         this.add(customPanel);

//         this.setVisible(true);
//     }
// }

// public class j006_graphicsComponent {
//     public static void main(String[] args) {
//         new SpecificComponent();
//     }
// }



//conclusion;
//to paint specific component we need to create class for each component and extends JComponent or JPanel.
//then override paintComponent method;

