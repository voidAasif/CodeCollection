package CustomComponent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JPanel;

public class CirclePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the parent class's paintComponent

        Graphics2D g2d = (Graphics2D) g;

        // Set the color to light gray
        g2d.setColor(Color.LIGHT_GRAY);

        // Draw a circle (oval with equal width and height)
        g2d.fillOval(50, 50, 300, 300);
    }
}

