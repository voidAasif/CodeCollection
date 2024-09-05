
// create table (roll no , name , class);
// create input field (rollno(int) , name(string) , class(int));
// create button (click: add input field into table);

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class AddTable extends JFrame implements ActionListener {

    JFrame frame;
    JTextField tf1, tf2, tf3;
    JButton button;
    JTable table;
    JScrollPane scrollPane;
    DefaultTableModel model;

    AddTable(){
        //frame;
        frame = new JFrame("Add value into table");
        frame.setLayout(null);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);


        //table data;
        String[] column = {"RollNo", "Name", "Class"};
        Object[][] data = {
                            // {1, "abc", "I"},
                            // {2, "aaa", "II"},
                            // {3, "bbb", "III"},
        };

        model = new DefaultTableModel(data, column); // for add opr(JTable do not containt methods--> addRow etc);

        table = new JTable(model);
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 25, 600, 250);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();

        tf1.setBounds(50, 295, 200, 30);
        tf2.setBounds(50, 330, 200, 30);
        tf3.setBounds(50, 365, 200, 30);

        button = new JButton("ADD");
        button.setBounds(280, 330, 100, 30);

        //action;
        button.addActionListener(this);



        //add component into table;
        frame.add(scrollPane);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(button);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){ // apply condition for empty input;
        String rollno = tf1.getText(); // get data from textfields;
        String name = tf2.getText();
        String clas = tf3.getText();

        String[] data = {rollno, name, clas}; // place data into array;

        model.addRow(data); // add new row using DefaultTableModel;
        System.out.println("New data added");
    }
}


public class j003_addTable {
    public static void main(String[] args) {
        new AddTable();
    }
}
