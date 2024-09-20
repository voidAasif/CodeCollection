// Practice button alignment with GridBagLayout
package javaHub.FrameSwing.practice;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

class gridBagLayoutDemo extends JFrame {
    gridBagLayoutDemo(){
        // Set GridBagLayout as the layout manager
        this.setLayout(new GridBagLayout());

        // Configure JFrame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  // Close on exit
        this.setLocationRelativeTo(null);  // Center the window on screen

        GridBagConstraints gbc = new GridBagConstraints(); // Used to manage coordinates and alignment

        // Add Button 1 at position (0, 0)
        gbc.gridx = 0;  // Set grid x-coordinate
        gbc.gridy = 0;  // Set grid y-coordinate
        this.add(new JButton("Button 1"), gbc);  // Add button with the specified constraints

        // Add Button 2 at position (1, 0)
        gbc.gridx = 1;  // Move to next column in the same row
        gbc.gridy = 0;  // Same row as Button 1
        this.add(new JButton("Button 2"), gbc);  // Add button

        // Add Button 3 at position (2, 0)
        gbc.gridx = 2;  // Next column in the same row
        gbc.gridy = 0;  // Same row
        this.add(new JButton("Button 3"), gbc);  // Add button

        // Add Button 4 at position (0, 1) with special configurations
        gbc.gridx = 0;  // Starting at column 0
        gbc.gridy = 1;  // Move to the second row
        gbc.gridwidth = 3;  // Make the button span across 3 columns
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Stretch the button horizontally to fill the space
        gbc.ipady = 40;  // Increase internal padding in the vertical direction to make the button taller
        this.add(new JButton("Button 4"), gbc);  // Add button

        // Reset gridwidth and ipady for future components
        gbc.gridwidth = 1;  // Reset gridwidth to default (1 column wide)
        gbc.ipady = 0;  // Reset internal padding

        // Add Button 5 at position (1, 2) with alignment at the bottom and spanning 2 columns
        gbc.gridx = 1;  // Start at column 1
        gbc.gridy = 2;  // Move to the third row
        gbc.gridwidth = 2;  // Make the button span across 2 columns
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Stretch the button horizontally to fill space
        gbc.weighty = 0.1;  // Assign some vertical weight to push it toward the bottom
        gbc.anchor = GridBagConstraints.PAGE_END;  // Align the button to the bottom of its cell
        this.add(new JButton("Button 5"), gbc);  // Add button

        // Automatically resize the frame to fit all components
        this.pack();
        this.setVisible(true);  // Make the frame visible
    }
}


public class j014_gridBagLayout {public static void main(String[] args) {new gridBagLayoutDemo();}}
