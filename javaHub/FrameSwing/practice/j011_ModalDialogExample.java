// How do you create a modal dialog using JDialog in Swing?
// Create an instance of JDialog, set it modal using setModal(true), and display it using setVisible(true).

package javaHub.FrameSwing.practice;

import javax.swing.*;

public class j011_ModalDialogExample {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Main Window");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Create a button that will open the modal dialog
        JButton button = new JButton("Open Modal Dialog");
        button.addActionListener(e -> {
            // Create a JDialog instance
            JDialog dialog = new JDialog(frame, "Modal Dialog", true); // true sets the dialog as modal

            // Set the size of the dialog
            dialog.setSize(200, 150);

            // Add content to the dialog (e.g., a label)
            dialog.add(new JLabel("This is a modal dialog", SwingConstants.CENTER));

            // Set location relative to the main frame (centered)
            dialog.setLocationRelativeTo(frame);

            // Make the dialog visible
            dialog.setVisible(true);
        });

        // Add the button to the main frame
        frame.add(button);

        // Make the main frame visible
        frame.setVisible(true);
    }
}

