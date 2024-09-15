package CustomComponent;

import javax.swing.text.DefaultCaret;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Rectangle;

public class CustomCaret extends DefaultCaret {
    @Override
    protected synchronized void damage(Rectangle r) {
        if (r == null) {
            return;
        }
        // Make the caret thicker by modifying the width
        x = r.x - 1;  // Adjust left side if needed
        y = r.y;
        width = 4;    // Set desired thickness
        height = r.height;

        repaint(); // Request a repaint of the caret area
    }

    @Override
    public void paint(Graphics g) {
        // Override to provide custom caret painting
        if (getComponent() == null) {
            return;
        }
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(4)); // Set the thickness of the caret
        g2.drawLine(x, y, x, y + height);
    }
}
