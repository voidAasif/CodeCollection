import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class j021_labelBg {
    public static void main(String[] args){
        JFrame frame = new JFrame("Bg on label");
        // frame.setSize(700, 500);
        // frame.setLayout(null);
        // frame.setSize(frame.getMaximumSize());comment; //why this line hang my linux system;
        System.out.println(frame.getMaximumSize()); //return screen resolution (Dimension[width=2147483647,height=2147483647]);
        // frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //max width and hight;
        

        ImageIcon image = new ImageIcon("FrameSwing/res/bg.png");
        // image.getImage();
    
        Image resizedImage = image.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH); //width, height, method;

        //set border; 
        Border border = BorderFactory.createLineBorder(new Color(0xFF0000), 4); //color , 4px;

        //label;
        JLabel label = new JLabel("I am Label");
        label.setBounds(0, 0, 300, 300);
        label.setForeground(new Color(0xFF1111));
        label.setBackground(new Color(0x123456));
        label.setOpaque(true); //set true to display background color;

        //font;
        label.setFont(new Font("MV Boli", Font.ITALIC, 25)); // new font, font size;

        label.setHorizontalTextPosition(JLabel.CENTER); //set position of text //default = left;
        label.setVerticalTextPosition(JLabel.TOP); //set position of text //default = center;

        label.setIcon(new ImageIcon(resizedImage)); // add image into label;
        label.setIconTextGap(-15); // gap bw image and label;

        label.setBorder(border); // add border around label;

        label.setVerticalAlignment(JLabel.CENTER); //set alignment of text+imageIcon within a text;
        label.setHorizontalAlignment(JLabel.CENTER); //set alignment of text+imageIcon within a text;


        //add component into frame;
        frame.add(label);
        // responsive layout;
        frame.pack(); // auto adjust framse size acc to component in frame and no need to set layout as null and width or hight of frame;

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}