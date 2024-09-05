package java.FrameSwing.practice;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener; //imports;

class Table2 extends JFrame implements ListSelectionListener {

    JFrame frame;
    JTable table;
    JScrollPane sp;

    Table2() {
        frame = new JFrame("Table select field"); // frame;

        frame.setLayout(null);
        frame.setSize(700, 500);

        String[] column = {"RollNo", "Name", "Div"}; // table head and data;
        String[][] data = {
            {"1", "abc", "I"},
            {"2", "tuv", "II"},
            {"3", "xyz", "III"},
        };

        table = new JTable(data, column); //add data into table;
        table.setCellSelectionEnabled(true); // to select individual cell in table;

        sp = new JScrollPane(table); // add table into scroll pane;
        frame.add(sp);               // add scroll pane int frame, add table indirectly;

        sp.setBounds(50, 25, 600, 90); // set bounds of scrollPane;


        // Add ListSelectionListener for both row && column selections;
        // table.getSelectionModel().addListSelectionListener(this);
        // table.getColumnModel().getSelectionModel().addListSelectionListener(this);
        
        //add listSelectionListener for only row || column selections;
        table.getSelectionModel().addListSelectionListener(this);

        // why we use selection model;
        //also same but not correct because JTable don't have listener method so we add listener on selection model;
        // table.getSelectionModel();
        // table.addListSelectionListener(this);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) { // ListSelectionListener;

        if(!e.getValueIsAdjusting()){ // run only once for single click;

            int row = table.getSelectedRow();       // get row index of element which is selected;
            int column = table.getSelectedColumn(); // get colomn index of element which is selected;

            String data = table.getValueAt(row, column).toString(); // locate value in 2D array.convert into string and store in data;

            System.out.println("You selected: " + data); // print output in terminal;

        }

    }
}

public class j002_table {
    public static void main(String[] args){
        new Table2();
    }
}