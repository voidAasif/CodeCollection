package java.FrameSwing.code;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;


public class j029_checkbox {
    public static void main(String[] args) {
        //frame;
        JFrame frame = new JFrame("checkBox");
        frame.setSize(700, 120);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15)); //gapBw Button and checkBox(vertical gap), margin top(horizontal gap);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //button;
        JButton button = new JButton("Submit");
        button.setFocusable(false);
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        button.setPreferredSize(new Dimension(90, 45)); //button size without x, y postition;


        //checkbox icons;
        ImageIcon tick = new ImageIcon("FrameSwing/res/tick.png");
        ImageIcon square = new ImageIcon("FrameSwing/res/square.png");

        //checkbox;
        JCheckBox checkBox = new JCheckBox("I'am not a robot");
        checkBox.setFont(new Font("Arial", Font.BOLD, 35));
        checkBox.setFocusable(false);
        checkBox.setIcon(square);
        checkBox.setSelectedIcon(tick);


        //action;
        // button.addActionListener(e -> System.out.println(checkBox.isSelected()));
        button.addActionListener(e -> System.out.println(checkBox.isSelected() ? "Selected" : "NotSelected"));


        //add into frame;
        frame.add(button);
        frame.add(checkBox);

        //frame;
        frame.setVisible(true);
    }
}
