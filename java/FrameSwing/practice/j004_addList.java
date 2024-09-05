package java.FrameSwing.practice;

// combine two list into single list , selected items;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel; //imports;

class AddList extends JFrame implements ActionListener {
    JFrame frame;
    JButton button;
    JList<String> list1, list2 , list3; // x + y = z;
    JScrollPane scroll1, scroll2, scroll3;
    DefaultListModel<String> model1 , model2, model3;

    int i = 0; // to count item;

    AddList(){
        //frame;
        frame = new JFrame("Add two list");
        frame.setLayout(null);
        frame.setSize(420, 380);

        //use defaultListModel to manipulate data;
        model1 = new DefaultListModel<>(); //data for list1;
        model1.addElement("A");
        model1.addElement("B");
        model1.addElement("C");
        model1.addElement("D");
        model1.addElement("E");
        model1.addElement("F");
        model1.addElement("G");
        model1.addElement("H");
        model1.addElement("I");
        model1.addElement("J");


        model2 = new DefaultListModel<>(); // data for list2;
        model2.addElement("0");
        model2.addElement("1");
        model2.addElement("2");
        model2.addElement("3");
        model2.addElement("4");
        model2.addElement("5");
        model2.addElement("6");
        model2.addElement("7");
        model2.addElement("8");
        model2.addElement("9");

        model3 = new DefaultListModel<>(); // empty list (result);
        
        //add all models into list;
        list1 = new JList<>(model1);
        list2 = new JList<>(model2);
        list3 = new JList<>(model3);
        

        //add list into scrollPane and set size;
        scroll1 = new JScrollPane(list1);
        scroll1.setBounds(50, 25, 90, 150);
        
        scroll2 = new JScrollPane(list2);
        scroll2.setBounds(160, 25, 90, 150);
        
        scroll3 = new JScrollPane(list3);
        scroll3.setBounds(260, 25, 90, 150);


        //button;
        button = new JButton("ADD");
        button.setBounds(160, 200, 90, 50);
        button.addActionListener(this);



        //add into frame;
        frame.add(scroll1);
        frame.add(scroll2);
        frame.add(scroll3);
        frame.add(button);


        //frame;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String l1 = list1.getSelectedValue(); // get selected value of list1;
        String l2 = list2.getSelectedValue(); // get selected value of list2;

        model3.addElement(l1+l2); // add new element into new list;

        button.setText(String.valueOf(++i) +" ADD"); // convert int into string and show on button;

        System.out.println("New Item Added"); // show feedback into terminal
    }
}

public class j004_addList {
    public static void main(String[] args) {
        new AddList();
    }
}
