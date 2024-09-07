//four textField [three input, one output]
//one button
//insert three value into sql DB (rollN0[int], name[String], dob[int]);


//swing imports;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//jdbc imports;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

class MainFrame extends JFrame implements ActionListener{

	JTextField rollNo, name, dob, output;
	JButton submit;
	
	public int inputRollNo;
	public String inputName;
	public int inputDob;
	
	public String rowAffected;

	MainFrame(){
		//frame;
		this.setTitle("GUI with DB");
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 200));
		this.setSize(1700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//JTextField;
		rollNo = createJTextField();
		name = createJTextField();
		dob = createJTextField();
		output = createJTextField();
		
		//button;
		submit = new JButton("Submit");
		submit.setPreferredSize(new Dimension(200, 200));
		submit.setFocusable(false);
		
		//action;
		submit.addActionListener(this);
		
		//add into frame;
		this.add(rollNo);
		this.add(name);
		this.add(dob);
		this.add(output);
		this.add(submit);
		
		//frame;
		this.setVisible(true);
		
	} //constructor end;
	
	private JTextField createJTextField(){
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(300, 100));
		textField.setFont(new Font("Arial", Font.BOLD, 25));
		return textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == submit){
			inputRollNo = Integer.parseInt(rollNo.getText());
			inputName = name.getText();
			inputDob = Integer.parseInt(dob.getText());
			
			insert(inputRollNo, inputName, inputDob);
			
			output.setText(getRowAffected() + "-- Row Affected");
		}
	}
	
	private void setRowAffected(int rowAffected){
			this.rowAffected = String.valueOf(rowAffected);
	}
	private String getRowAffected(){
		return rowAffected;
	}
	
	private void insert(int inputRollNo, String inputName, int inputDob){
		final String url = "jdbc:mysql://localhost:3306/sqlDB";
		final String username = "root";
		final String password = "myPassword";
		
		String query = "INSERT INTO student (rollNo, name, dob) VALUE (?, ?, ?);";
		
		try (
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = connection.prepareStatement(query);
		) {
			
			pstmt.setInt(1, inputRollNo);
			pstmt.setString(2, inputName);
			pstmt.setInt(3, inputDob);
			
			int rowAffected = pstmt.executeUpdate();
			
			if(rowAffected > 0){
				setRowAffected(rowAffected);
				System.out.println("Query Executed");
			}
			else {
				System.err.println("Query not Executed");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error while connection with database");
		}
	}
}

class App {
	public static void main(String[] args){
		new MainFrame(); //to access input values from GUI;
	}
}

