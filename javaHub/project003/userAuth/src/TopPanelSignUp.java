import javax.swing.*;
import java.awt.*;

public class TopPanelSignUp extends JPanel {

    // ImageIcon formIcon = new ImageIcon("userAuth/src/res/signUp.png");
    ImageIcon formIcon = new ImageIcon(getClass().getResource("res/signUp.png"));

    final int iconHeight = 100;
    final int iconWidth = iconHeight;
    
    JLabel formIconContainer;
    JLabel formTitle;
    
    TopPanelSignUp(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
        this.setBackground(Color.WHITE);

        
        formIcon.setImage(formIcon.getImage().getScaledInstance(iconWidth-10, iconHeight-10, Image.SCALE_SMOOTH));
        formIconContainer = new JLabel(formIcon);
        formIconContainer.setPreferredSize(new Dimension(iconWidth, iconHeight));

        formTitle = new JLabel("Create New Account");
        formTitle.setFont(new Font("Monospaced", Font.BOLD, 27));
        formTitle.setPreferredSize(new Dimension(iconWidth*3, iconHeight));
        formTitle.setBackground(Color.WHITE);
        formTitle.setOpaque(true);

        this.add(formIconContainer);
        this.add(formTitle);

    }
}

