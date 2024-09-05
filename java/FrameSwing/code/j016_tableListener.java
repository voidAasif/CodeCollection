package java.FrameSwing.code;

import javax.swing.JFrame; // Import the JFrame class for creating windows
import javax.swing.JTable; // Import the JTable class for creating tables
import javax.swing.ListSelectionModel; // Import ListSelectionModel for handling selection models
import javax.swing.event.ListSelectionEvent; // Import ListSelectionEvent for handling selection events
import javax.swing.event.ListSelectionListener; // Import ListSelectionListener for listening to selection events
import javax.swing.JScrollPane; // Import JScrollPane for adding scrollable view to components

class TableListener extends JFrame { // Create a class TableListener that extends JFrame

    JFrame myFrame; // Declare a JFrame object
    JTable table; // Declare a JTable object
    JScrollPane scrollPane; // Declare a JScrollPane object

    TableListener(){
        myFrame = new JFrame("Table"); // Initialize the JFrame with a title
        
        // Configure frame layout and size
        myFrame.setLayout(null); // Set layout to null for absolute positioning
        myFrame.setSize(700, 500); // Set the size of the frame
        
        // Define column headers and data for the table
        String[] column = {"ID", "Name", "Add"}; // Define column headers
        String[][] data = { // Define data for the table
            {"1", "Aasif", "Chindori"},
            {"2", "Mohan", "Dalampur"},
            {"3", "Rohan", "Rohta"},
            {"4", "Manoj", "Meerpur"}
        };
        
        // Initialize the table with data and column headers
        table = new JTable(data, column); // Create a new JTable with the specified data and columns
        
        // Initialize the scroll pane and add the table to it
        scrollPane = new JScrollPane(table); // Create a JScrollPane and add the table to it

        table.setCellSelectionEnabled(true); // Enable cell selection in the table
        scrollPane.setBounds(10, 40, 600, 400); // Set bounds for the scroll pane

        // Add the scroll pane (which contains the table) to the frame
        myFrame.add(scrollPane); // Add the scroll pane to the frame


        //????????????????????????????????????????????????????????????????????

        // Set up the selection model for the table
        ListSelectionModel model = table.getSelectionModel(); // Get the selection model of the table
        model.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Set selection mode to single selection

        // Add a selection listener to the selection model
        model.addListSelectionListener(new ListSelectionListener() { // Add a ListSelectionListener
            public void valueChanged(ListSelectionEvent e){ // Define what happens when selection changes
                if (!e.getValueIsAdjusting()) { // Only proceed if the selection is stable
                    String data = null; // Initialize a string to store selected cell data
                    int[] row = table.getSelectedRows(); // Get selected rows
                    int[] column = table.getSelectedColumns(); // Get selected columns

                    for(int i=0; i<row.length; i++){ // Loop through selected rows 
                        for(int j=0; j<column.length; j++){ // Loop through selected columns
                            data = (String) table.getValueAt(row[i], column[j]); // Get the value of the selected cell
                        }
                    }
                    // Print the selected cell data
                    System.out.println("******************************************");
                    System.out.println("you select:   " + data);
                    System.out.println("******************************************");
                }
            }
        }); //???????????????????????????????????????????????????????????????

        // Make the frame visible and set the default close operation
        myFrame.setVisible(true); // Make the frame visible
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE); // Exit the application when the frame is closed
    }
}

public class j016_tableListener { // Main class
    public static void main(String[] args) { // Main method
        new TableListener(); // Create a new instance of TableListener
    }
}
// good explination in path: code/FrameSwing/practice/j002_table.java;