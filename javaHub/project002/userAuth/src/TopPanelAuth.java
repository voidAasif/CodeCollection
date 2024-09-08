import javax.swing.*;
import java.awt.*;

public class TopPanelAuth extends JPanel {

    // ImageIcon formIcon = new ImageIcon("userAuth/src/res/authentication.png");
    ImageIcon formIcon = new ImageIcon(getClass().getResource("res/authentication.png"));
    final int iconHeight = 100;
    final int iconWidth = iconHeight;
    
    JLabel formIconContainer;
    JLabel formTitle;
    
    TopPanelAuth(){
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0));
        this.setBackground(Color.WHITE);

        
        formIcon.setImage(formIcon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH));
        formIconContainer = new JLabel(formIcon);
        formIconContainer.setPreferredSize(new Dimension(iconWidth, iconHeight));

        formTitle = new JLabel("User Authentication");
        formTitle.setFont(new Font("Monospaced", Font.BOLD, 25));
        formTitle.setPreferredSize(new Dimension(iconWidth*3, iconHeight));
        formTitle.setBackground(Color.WHITE);
        formTitle.setOpaque(true);

        this.add(formIconContainer);
        this.add(formTitle);

    }
}
