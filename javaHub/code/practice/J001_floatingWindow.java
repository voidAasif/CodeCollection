package practice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class J001_floatingWindow {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("GUI Example");

        // Create a new JButton
        JButton button = new JButton("Click Me!");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set frame size and make it visible
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}