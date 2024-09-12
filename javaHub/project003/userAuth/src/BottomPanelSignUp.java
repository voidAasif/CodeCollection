import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.io.*;

//db imports;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BottomPanelSignUp extends JPanel implements ActionListener{

    // String dataBasePath = "userAuth/src/res/db/dataBase.txt";
    final String url = "jdbc:mysql://localhost:3306/sqlDB";
    final String username = "root";
    final String password = "myPassword";

    int auto = 0;

    JPanel gmailPanel, userNamePanel, passwordPanel, buttonsPanel;
    ImageIcon gmailIcon = new ImageIcon(getClass().getResource("/res/gmail.png"));
    ImageIcon userNameIcon = new ImageIcon(getClass().getResource("/res/user.png"));
    ImageIcon passwordIcon = new ImageIcon(getClass().getResource("/res/password.png"));
    int iconWidth = 50;
    int iconHeight = iconWidth;
    JLabel gmailIconLabel, userNameIconLabel, passwordIconLabel;

    JTextField gmailTextField = new JTextField();
    JTextField userNameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();

    ImageIcon beforeIcon = new ImageIcon(getClass().getResource("/res/before.png"));
    JButton signIn, before;

    JFrame signUpForm;

    BottomPanelSignUp(JFrame signUpForm){
        this.signUpForm = signUpForm;
        this.setLayout(new GridLayout(4,1, 0, 20));
        this.setBackground(Color.WHITE);


        //setup Panels;
        gmailPanel = createPanel(auto, auto, null, 0, 0);
        userNamePanel = createPanel(auto, auto, null, 0, 0);
        passwordPanel = createPanel(auto, auto, null, 0, 0);
        buttonsPanel = createPanel(auto, auto, null, 10, 20);


        //set field icon size;
        gmailIcon.setImage(gmailIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH));
        userNameIcon.setImage(userNameIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH));
        passwordIcon.setImage(passwordIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH));


        //setLabel to contains image;
        gmailIconLabel = new JLabel(gmailIcon);
        gmailIconLabel.setBackground(null);
        gmailIconLabel.setBorder(BorderFactory.createLineBorder(new Color(0xEDEDED), 3));
        gmailIconLabel.setOpaque(true);

        userNameIconLabel = new JLabel(userNameIcon);
        userNameIconLabel.setBackground(null);
        userNameIconLabel.setBorder(BorderFactory.createLineBorder(new Color(0xEDEDED), 3));
        userNameIconLabel.setOpaque(true);
        
        passwordIconLabel = new JLabel(passwordIcon);
        passwordIconLabel.setBorder(BorderFactory.createLineBorder(new Color(0xEDEDED), 3));
        passwordIconLabel.setBackground(null);
        passwordIconLabel.setOpaque(true);
        
        
        //i am here right now; create input fields;
        gmailTextField = createTextField(350, iconHeight, new Color(0xEDEDED));
        userNameTextField = createTextField(350, iconHeight, new Color(0xEDEDED));
        passwordTextField = createPasswordField(350, iconHeight, new Color(0xEDEDED));


        //buttons;
        signIn = createButton("Sign In", 150, 50);
        before = createButton("", 50, 50);
        beforeIcon.setImage(beforeIcon.getImage().getScaledInstance(60 , 60, Image.SCALE_SMOOTH));
        before.setIcon(beforeIcon);


        //add action on buttons;
        signIn.addActionListener(this);
        before.addActionListener(this);

        //add into inner panels;
        gmailPanel.add(gmailIconLabel);
        gmailPanel.add(gmailTextField);

        userNamePanel.add(userNameIconLabel);
        userNamePanel.add(userNameTextField);

        passwordPanel.add(passwordIconLabel);
        passwordPanel.add(passwordTextField);

        buttonsPanel.add(before);
        buttonsPanel.add(signIn);




        //add into bottom panel;
        this.add(gmailPanel);
        this.add(userNamePanel);
        this.add(passwordPanel);
        this.add(buttonsPanel);

    } //constructor end;

    private JPanel createPanel(int width, int height, Color color , int vGap, int hGap){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, vGap, hGap));
        panel.setBackground(color);
        
        return panel;
    }

    private JTextField createTextField(int width, int height, Color color){
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(width, height));
        textField.setBackground(new Color(0xEDEDED));
        textField.setBorder(null);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setBorder(new EmptyBorder(0, 20, 0, 0));

        return textField;
    }
    private JPasswordField createPasswordField(int width, int height, Color color){
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(width, height));
        passwordField.setBackground(color);
        passwordField.setBorder(null);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordField.setBorder(new EmptyBorder(0, 20, 0, 0));

        return passwordField;
    }
    private JButton createButton(String text, int width, int height){
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(width, height));
        button.setFocusable(false);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setBackground(new Color(0xcee1f5));
        button.setBorder(BorderFactory.createLineBorder(new Color(0x0580fc), 3));

        return button;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == signIn){

            boolean test = true;

            //to check all fields is not empty;
            if(gmailTextField.getText().equals("") || userNameTextField.getText().equals("") || 
                passwordTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "All fields required");
                    test = false;
            }

            //gmail confirmation;
            else if(!gmailTextField.getText().endsWith("@gmail.com") || gmailTextField.getText().contains(" ") || gmailTextField.getText().length() < 11){
                JOptionPane.showMessageDialog(null, "Please Enter valid Gmail");
                test = false;
            }
            
            //username confirmation;
            else if(userNameTextField.getText().length() < 8 || userNameTextField.getText().length() > 12){
                JOptionPane.showMessageDialog(null, "UserName length error");
                test = false;
            }
            
            //password confirmation;
            else if(passwordTextField.getText().length() < 6 || passwordTextField.getText().length() > 10){
                JOptionPane.showMessageDialog(null, "Password length error");
                test = false;
            }
            else {
                if(passwordStrength(passwordTextField.getText()) < 50){
                    JOptionPane.showMessageDialog(null, "Strength: "+passwordStrength(passwordTextField.getText())+ "%");
                    test = false;
                }
            }



            String userName = userNameTextField.getText();
            String userPassword = passwordTextField.getText();
            String userGmail = gmailTextField.getText();

            //user already exist;
            if(!authenticate(userName)){
                JOptionPane.showMessageDialog(null, "User Already Exist");
                test = false;
            }


            if(test) {


                //save data into dataBase.txt;
                upload(userName, userPassword, userGmail);

                switchFrame();
                
            }


        }

        if(arg0.getSource() == before){
            switchFrame();
        }
    } //action end;

    private void switchFrame(){
        //new account creation conditions are pending;
        new AuthForm(); //execute authForm and dispose signup form;
        signUpForm.dispose();
    }

    private int passwordStrength(String password){
        int strength = 0;

        for(int i=0; i < password.length(); i++){
            //num;
            if(password.charAt(i) >= 48 && password.charAt(i) <= 57){ // between 48 to 57;
                strength += 4;
            }
            
            //lower case char;
            if(password.charAt(i) >= 97 && password.charAt(i) <= 122){ // between 97 to 122;
                strength += 6;
            }

            //upper case char;
            if(password.charAt(i) >= 65 && password.charAt(i) <= 90){ // between 65 to 90;
                strength += 8;
            }

            //symbols;
            if((password.charAt(i) >= 33 && password.charAt(i) <= 47) || 
                (password.charAt(i) >= 58 && password.charAt(i) <= 64) ||
                (password.charAt(i) >= 91 && password.charAt(i) <= 96) || 
                (password.charAt(i) >= 123 && password.charAt(i) <= 126)){
                strength += 10;
            }
        }

        return strength;
    } // strength end;

    private void upload(String userName, String userPassword, String userGmail ){ //1-task-db;

        final String insertQuery = "INSERT INTO userData (user_gmail, user_name, user_password) VALUES (?, ?, ?)";


        try (
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        ) {
            
            pstmt.setString(1, userGmail);
            pstmt.setString(2, userName);
            pstmt.setString(3, userPassword);

            if (pstmt.executeUpdate()>0) {
                System.out.println("Insert Successful");
            }else {
                System.err.println("Error while Inserting");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while connecting with DB");
        }
    } //upload end;

    private boolean authenticate(String userName){ //2-task-db;

        String userInputUserName = userName;

        final String fetchQuery = "SELECT user_name FROM userData";

        try (
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet fetchData = stmt.executeQuery(fetchQuery);
        ){
            
            while (fetchData.next()) {
                String userNameInDB = fetchData.getString("user_name");
System.out.println(userInputUserName +" |###| " + userNameInDB);
                if(userInputUserName == userNameInDB){
                    System.out.println("true"); //log;
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error while fetching data from dataBase");
        }
        return false;
    } //authenticate end;
}
