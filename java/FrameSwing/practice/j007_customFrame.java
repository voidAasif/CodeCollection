package java.FrameSwing.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class j007_customFrame {
    private static Point initialClick;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom JFrame");

        // Make the frame undecorated
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom title bar panel
        JPanel titleBar = new JPanel();
        titleBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
        titleBar.setBackground(Color.LIGHT_GRAY);

        // Add custom buttons
        JButton closeButton = new JButton("X");
        JButton minimizeButton = new JButton("_");
        JButton maximizeButton = new JButton("[ ]");

        closeButton.addActionListener(e -> frame.dispose());

        minimizeButton.addActionListener(e -> frame.setState(Frame.ICONIFIED));

        maximizeButton.addActionListener(e -> {

            if (frame.getExtendedState() == Frame.MAXIMIZED_BOTH) {
                frame.setExtendedState(Frame.NORMAL);
            } else {
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
            }

        });

        titleBar.add(minimizeButton);
        titleBar.add(maximizeButton);
        titleBar.add(closeButton);

        // Add mouse listener for dragging the frame
        titleBar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                frame.getComponentAt(initialClick);
            }
        });

        titleBar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Get the current location of the window
                int thisX = frame.getLocation().x;
                int thisY = frame.getLocation().y;

                // Determine how much the mouse moved since the initial click
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Move window to this position
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                frame.setLocation(X, Y);
            }
        });

        // Adding the custom title bar and other components to the frame
        frame.add(titleBar, BorderLayout.NORTH);

        // Set size and visibility
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}

