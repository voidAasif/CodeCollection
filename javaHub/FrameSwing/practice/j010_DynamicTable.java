package javaHub.FrameSwing.practice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j010_DynamicTable {
    public static void main(String[] args) {
        // Create and display the GUI on the Event Dispatch Thread (ADT)
        SwingUtilities.invokeLater(() -> { //use SwingUtilities.invokeLater method to manage component rendering;
            JFrame frame = new JFrame("Dynamic JTable Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 300);

            // Create table model with column names
            DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Name", "Age"}, 0);

            // Add initial rows to the model
            tableModel.addRow(new Object[]{"John", 25});
            tableModel.addRow(new Object[]{"Anna", 30});

            // Create JTable with the table model
            JTable table = new JTable(tableModel);

            // Create components for dynamic updates
            JTextField nameField = new JTextField(10);
            JTextField ageField = new JTextField(5);
            JButton addButton = new JButton("Add Row");
            JButton updateButton = new JButton("Update First Row");

            // Add new row when the button is clicked
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());
                    tableModel.addRow(new Object[]{name, age});
                }
            });

            // Update the first row when the button is clicked
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (tableModel.getRowCount() > 0) {
                        tableModel.setValueAt("Updated Name", 0, 0); // Update first row, first column
                        tableModel.setValueAt(99, 0, 1); // Update first row, second column
                        tableModel.fireTableDataChanged(); // Notify the table data has changed
                    }
                }
            });

            // Set up the layout
            JPanel panel = new JPanel();
            panel.add(new JLabel("Name:"));
            panel.add(nameField);
            panel.add(new JLabel("Age:"));
            panel.add(ageField);
            panel.add(addButton);
            panel.add(updateButton);

            // Add the table and the panel to the frame
            frame.add(new JScrollPane(table), "Center");
            frame.add(panel, "South");

            // Display the frame
            frame.setVisible(true);
        });
    }
}
