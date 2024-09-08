package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class j004_CenteredAnimationExample extends JPanel implements ActionListener {
    private int radius = 50; // radius of the circle
    private int x; // x-coordinate of the circle
    private int y; // y-coordinate of the circle
    private int dx = 5; // change in x-coordinate for each frame
    private Timer timer; // Timer to trigger animation

    public j004_CenteredAnimationExample(int width, int height) {
        // Calculate initial position of the circle to center it
        x = (width - radius) / 2;
        y = (height - radius) / 2;

        timer = new Timer(50, this); // Trigger actionPerformed every 50 milliseconds
        timer.start(); // Start the animation
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Clear the panel
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Draw the circle
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move the circle
        x += dx;

        // If the circle reaches the edges, reverse direction
        if (x + radius > getWidth() || x - radius < 0) {
            dx = -dx;
        }

        // Repaint the panel
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Centered Animation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Add the centered animation panel to the frame
        frame.add(new j004_CenteredAnimationExample(frame.getWidth(), frame.getHeight()));

        frame.setVisible(true);
    }
}

