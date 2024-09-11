import javax.swing.*;
import java.awt.*;

public class AuthForm extends JFrame{

    TopPanelAuth topPanel = new TopPanelAuth();
    BottomPanelAuth bottomPanel = new BottomPanelAuth(this);

    // ImageIcon frameIcon = new ImageIcon("userAuth/src/res/authentication.png");
    ImageIcon frameIcon = new ImageIcon(getClass().getResource("res/authentication.png"));


    AuthForm(){
        this.setTitle("User: Sign In");
        this.setLayout(new BorderLayout(0, 100));
        this.setSize(500, 650);
        this.setMinimumSize(new Dimension(470, 577));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setIconImage(frameIcon.getImage());


        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
