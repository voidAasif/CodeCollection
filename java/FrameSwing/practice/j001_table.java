package java.FrameSwing.practice;


import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JButton;

class Table1 extends JFrame implements ActionListener {

	JFrame frame;
	JTable table;
	JScrollPane sp;
	JButton button;
	
	Table1(){
		frame = new JFrame("Table select Button");
		button = new JButton("click");
		
		frame.setLayout(null);
		frame.setSize(700, 500);
		
		String[] column = {"RollNo", "Name", "Div"};
 		String[][] data = {
					{"1", "abc", "I"},
					{"2", "tuv", "II"},
					{"3", "xyz", "III"},
		};
		
		table = new JTable(data, column);
		//table.setBounds(10, 10, 600, 400);
		table.setCellSelectionEnabled(true);
		
		sp = new JScrollPane(table);
		frame.add(sp);
		
		sp.setBounds(50, 25, 600, 90);
		
		button.setBounds(50, 150, 600, 50);
		frame.add(button);
		
		button.addActionListener(this);
		
		
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		int row = table.getSelectedRow();
		int column = table.getSelectedColumn();
		
		String data = table.getValueAt(row, column).toString(); //convert into string;
 		
		System.out.println("You select: " + data);
	}

}


public class j001_table {
	public static void main(String[] args){
		new Table1();
	}
}
