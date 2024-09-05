package java.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

class List extends JFrame {

    List(){
        JFrame frame = new JFrame("List");
        frame.setLayout(null);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        
        String[] listItem = {"apple", "ball", "cat", "dog", "apple", "ball", "cat", "dog", "etc"}; // list items;

        JList<String> myList = new JList<>(listItem); // add items into list;

        JScrollPane scrollPane = new JScrollPane(myList); // add list into scroll pane;

        scrollPane.setBounds(10, 10, 100, 100); // set scroll pane;



        frame.add(scrollPane); // add scroll pane into frame;

        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}


public class j017_list {
    public static void main(String[] args){
        new List();
    }
}
