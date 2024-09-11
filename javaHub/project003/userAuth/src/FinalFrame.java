import javax.swing.*;
import java.awt.*;

public class FinalFrame extends JFrame{

    ImageIcon frameIcon = new ImageIcon("");
    JLabel label;

    FinalFrame(){
        this.setTitle("Final Form");
        // this.setLayout(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.setIconImage(frameIcon.getImage());

        label = new JLabel("Login Successful");
        label.setFont(new Font("Arial", Font.BOLD, 100));
        label.setForeground(Color.GREEN);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);


        this.add(label);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
