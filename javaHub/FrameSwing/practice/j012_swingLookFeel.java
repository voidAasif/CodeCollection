// How do you implement a Swing Look and Feel, and how can you change it dynamically at runtime?
// Use UIManager.setLookAndFeel() to change the Look and Feel.
// You can change it dynamically by calling it and then using SwingUtilities.updateComponentTreeUI() to refresh the UI.

package javaHub.FrameSwing.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class j012_swingLookFeel {
    public static void main(String[] args) {
        // Create the main JFrame window
        JFrame frame = new JFrame("Look and Feel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        // Create a panel with some components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button = new JButton("A Button");
        JLabel label = new JLabel("Current Look and Feel:");
        JComboBox<String> comboBox = new JComboBox<>(new String[] { "Metal", "Nimbus", "Windows", "Motif" });

        panel.add(label);
        panel.add(button);
        panel.add(comboBox);

        // Add the panel to the frame
        frame.add(panel);

        // Create an ActionListener to change the Look and Feel dynamically
        comboBox.addActionListener((ActionEvent e) -> {
            String selectedLaf = (String) comboBox.getSelectedItem();
            try {
                switch (selectedLaf) {
                    case "Metal":
                        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); //default look and feel;
                        break;
                    case "Nimbus":
                        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                        break;
                    case "Windows":
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                        break;
                    case "Motif":
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                        break;
                }

                // Update the component tree to apply the new look and feel
                SwingUtilities.updateComponentTreeUI(frame);
                // frame.pack();  // Repack to update sizes if needed

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // Show the main window
        frame.setVisible(true);
    }
}

