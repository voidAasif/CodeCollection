package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class j003_AnimationExample extends JPanel implements ActionListener {
    private int x = 0; // x-coordinate of the circle
    private int y = 150; // y-coordinate of the circle
    private int radius = 50; // radius of the circle
    private int dx = 5; // change in x-coordinate for each frame
    private Timer timer; // Timer to trigger animation

    public j003_AnimationExample() {
        timer = new Timer(50, this); // Trigger actionPerformed every 50 milliseconds
        timer.start(); // Start the animation
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Clear the panel
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw the circle
        g2d.setColor(Color.BLUE);
        g2d.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move the circle
        x += dx;

        // If the circle reaches the right edge, reverse direction
        if (x + radius > getWidth() || x - radius < 0) {
            dx = -dx;
        }

        // Repaint the panel
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Add the animation panel to the frame
        frame.add(new j003_AnimationExample());

        frame.setVisible(true);
    }
}

