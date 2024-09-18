package javaHub.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class j041_tabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel firstPanel = new JPanel();
        firstPanel.setBackground(Color.RED);
        firstPanel.add(new JLabel("I am First Panel"));
        
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.GREEN);
        secondPanel.add(new JLabel("I am Second Panel"));
        
        JPanel thirdPanel = new JPanel();
        thirdPanel.setBackground(Color.BLUE);
        thirdPanel.add(new JLabel("I am Third Panel"));

        //tabbed pane;
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(10, 10, 550, 400);
        tabbedPane.addTab("First Tab", firstPanel); //add component into tabbedPanel;
        tabbedPane.addTab("Second Tab", secondPanel);
        tabbedPane.addTab("Third Tab", thirdPanel);

        //add tabbedPane into frame;
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
