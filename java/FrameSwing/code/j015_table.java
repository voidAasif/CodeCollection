package java.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;


class Table extends JFrame {

    JFrame myFrame;
    JTable table;
    JScrollPane scrollPane;

    Table(){
        myFrame = new JFrame("Table");
        
        //frame;
        myFrame.setLayout(null);
        myFrame.setSize(700, 500);
        
        //head and data;
        String[] column = {"ID", "Name", "Vill"};
        String[][] data = {
            {"1", "Aasif", "Chindori"},
            {"2", "Mohan", "Dalampur"},
            {"3", "Rohan", "Rohta"},
            {"4", "Manoj", "Meerpur"}
        };
        
        //table;
        table = new JTable(data, column);
        //scrollPane;
        scrollPane = new JScrollPane(table); // i am container of table;

        table.setCellSelectionEnabled(true); // select individual items in table(without this --> as default select complete column);
        scrollPane.setBounds(10, 40, 600, 400); // scrollPane(container of table);

        // scrollPane.add(table);
        myFrame.add(scrollPane); // add container into frame;


        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

public class j015_table {
    public static void main(String[] args) {
        new Table();
    }
}
