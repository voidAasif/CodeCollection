import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//db imports;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BottomPanelAuth extends JPanel implements ActionListener{

    // String dataBasePath = "/res/db/dataBase.txt";
    final String url = "jdbc:mysql://localhost:3306/sqlDB";
    final String username = "root";
    final String password = "myPassword";

    int auto = 0;

    JPanel userNamePanel, passwordPanel, buttonsPanel;
    // ImageIcon userNameIcon = new ImageIcon("userAuth/src/res/user.png");
    // ImageIcon passwordIcon = new ImageIcon("userAuth/src/res/password.png");
    ImageIcon userNameIcon = new ImageIcon(getClass().getResource("/res/user.png"));
    ImageIcon passwordIcon = new ImageIcon(getClass().getResource("/res/password.png"));
    int iconWidth = 62;
    int iconHeight = iconWidth;
    JLabel userNameIconLabel, passwordIconLabel;
    JTextField userNameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();

    JButton signUp, signIn;

    JFrame authForm;

    BottomPanelAuth(JFrame authForm){
        this.authForm = authForm;
        this.setLayout(new GridLayout(4,1, 0, 20));
        this.setBackground(Color.WHITE);


        //setup Panels;
        
        userNamePanel = createPanel(auto, auto, null, 0, 0);
        passwordPanel = createPanel(auto, auto, null, 0, 0);
        buttonsPanel = createPanel(auto, auto, null, 50, 20);


        //set field icon size;
        userNameIcon.setImage(userNameIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH));
        passwordIcon.setImage(passwordIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH));


        //setLabel to contains image;
        userNameIconLabel = new JLabel(userNameIcon);
        userNameIconLabel.setBackground(null);
        userNameIconLabel.setBorder(BorderFactory.createLineBorder(new Color(0xEDEDED), 3));
        userNameIconLabel.setOpaque(true);
        
        passwordIconLabel = new JLabel(passwordIcon);
        passwordIconLabel.setBorder(BorderFactory.createLineBorder(new Color(0xEDEDED), 3));
        passwordIconLabel.setBackground(null);
        passwordIconLabel.setOpaque(true);
        
        
        // create input fields;
        userNameTextField = createTextField(350, iconHeight, new Color(0xEDEDED));
        passwordTextField = createPasswordField(350, iconHeight, new Color(0xEDEDED));


        //buttons;
        signUp = createButton("Sign Up");
        signIn = createButton("Sign In");

        //button actions;
        signUp.addActionListener(this);
        signIn.addActionListener(this);


        //add into inner panels;
        userNamePanel.add(userNameIconLabel);
        userNamePanel.add(userNameTextField);

        passwordPanel.add(passwordIconLabel);
        passwordPanel.add(passwordTextField);

        buttonsPanel.add(signUp);
        buttonsPanel.add(signIn);


        //add into bottom panel;
        this.add(userNamePanel);
        this.add(passwordPanel);
        this.add(buttonsPanel);

    }

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
    private JButton createButton(String text){
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(150, 50));
        button.setFocusable(false);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setBackground(new Color(0xcee1f5));
        button.setBorder(BorderFactory.createLineBorder(new Color(0x0580fc), 3));

        return button;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == signUp){
            authForm.dispose();
            new SignUpForm(); //open signup form and dispose auth form;
        }
        if(arg0.getSource() == signIn){

            String userName = userNameTextField.getText();
            String userPassword = passwordTextField.getText();

            if(authenticate(userName, userPassword)){
                //signing conditions pending;
                authForm.dispose();

                //replace this line with your software start point;
                new FinalFrame();
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }

        }
    }


    private boolean authenticate(String userName, String userPassword){

        final String fetchQuery = "SELECT user_name, user_password FROM userData;";

        try (
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet user = stmt.executeQuery(fetchQuery);
        ) {
            
            while (user.next()) {
                String name = user.getString("user_name");
                String pass = user.getString("user_password");

                if(name.equals(userName) && pass.equals(userPassword)){
                    return true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while fetching data from dataBase");
        }

        return false;
    }
}
