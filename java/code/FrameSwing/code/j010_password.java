import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class j010_password extends JFrame{
    j010_password(){
        JFrame myFrame = new JFrame("Password");
        JPasswordField pass = new JPasswordField();  // for password;
        JLabel label = new JLabel("Enter your Password: ");
        JButton button = new JButton("Show Password");


        myFrame.setLayout(null);
        myFrame.setSize(700, 500);

        label.setBounds(10, 10, 200, 50);
        pass.setBounds(220, 10, 150, 50);
        button.setBounds(10, 110, 200, 50);

        myFrame.add(label);
        myFrame.add(pass); // add password field into frame;
        myFrame.add(button);

        button.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent e){
                // label.setText(pass.getText());

                JOptionPane.showMessageDialog(myFrame, "Pass: " + pass.getText());  // show message on dialog box;
            
            }
        });


        myFrame.setVisible(true);
        myFrame.setAlwaysOnTop(true);  // always on top;
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new j010_password();
    }
}
