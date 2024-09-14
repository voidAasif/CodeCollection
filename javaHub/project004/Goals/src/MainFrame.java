
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {

    JPanel mainPanel;

    MainFrame(){
        this.setLayout(new BorderLayout());
        this.setSize(700, 550);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //add mainPanel container into frame;
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.red);
        mainPanel.setOpaque(true);

        //add Cards into panel;


        //add mainPanel into frame;
        this.add(mainPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
