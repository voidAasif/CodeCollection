import javax.swing.*;
import java.awt.*;
public class SignUpForm extends JFrame {
    
    TopPanelSignUp topPanel = new TopPanelSignUp();
    BottomPanelSignUp bottomPanel = new BottomPanelSignUp(this);

    // ImageIcon frameIcon = new ImageIcon("userAuth/src/res/signUp.png");
    ImageIcon frameIcon = new ImageIcon(getClass().getResource("res/signUp.png"));

    
    SignUpForm(){
        this.setTitle("User: Sign Up");
        this.setLayout(new BorderLayout(0, 80));
        this.setSize(500, 650);
        this.setMinimumSize(new Dimension(470, 577));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setIconImage(frameIcon.getImage());
    
    
        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.CENTER);
    
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
    }
}
