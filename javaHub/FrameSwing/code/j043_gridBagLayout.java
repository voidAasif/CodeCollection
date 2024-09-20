package javaHub.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.GridBagLayout; //gridBagLayout;
import java.awt.GridBagConstraints;

class gridBagLayoutDemo extends JFrame {

    gridBagLayoutDemo(){
        this.setLayout(new GridBagLayout());//set GridBagLayout;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints(); //used to manage coordinate;

        //add components;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new JButton("0, 0"), gbc); //add button with coordinate;

        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(new JButton("1, 1"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(new JButton("2, 2"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        this.add(new JButton("3, 3"), gbc);

        gbc.gridx = 4;
        gbc.gridy = 4;
        this.add(new JButton("4, 4"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        this.add(new JButton("2, 4"), gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        this.add(new JButton("4, 2"), gbc);

        gbc.weightx = 0.1; //now it move horizontally with respect to frame, but space is empty(dimensions of component remains same); (0 -> disable, 0+ -> enable)
        gbc.gridx = 5;
        gbc.gridy = 5;
        this.add(new JButton("5, 5 wx-0.1"), gbc);
        gbc.weightx = 0; //reset value;

        gbc.weighty = 0.1; //same like weightx but for vertical;
        gbc.gridx = 6;
        gbc.gridy = 6;
        this.add(new JButton("6, 6 wy-0.1"), gbc);
        gbc.weighty = 0; // reset value;

        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.VERTICAL; //to fill empty space vertically;
        gbc.gridx = 0;
        gbc.gridy = 7;
        this.add(new JButton("0, 7 wy-1 fil-ver"), gbc);
        gbc.weighty = 0;

        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL; //to fill empty space horizontally;
        gbc.gridx = 1;
        gbc.gridy = 7;
        this.add(new JButton("1, 7 wx-1 fil-hor"), gbc);
        gbc.weightx = 0;

        gbc.weightx = 0.1; //enable;
        gbc.weighty = 0.1; //enable;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 9;
        this.add(new JButton("0, 7 wxy-1,1 fil-horVer"), gbc);
        gbc.weightx = 0;
        gbc.weighty = 0;


        gbc.gridwidth = 2; //now it takes 2 columns;
        gbc.gridheight = 3; // two rows;
        gbc.gridx = 2;
        gbc.gridy = 9;
        this.add(new JButton("2, 9 gw-2, gh-2"), gbc);
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        gbc.ipadx = 3;
        gbc.ipady = 3;
        gbc.gridx = 4;
        gbc.gridy = 10;
        this.add(new JButton("4, 10 ipx-3, ipy-3"), gbc);

        this.pack();
        this.setVisible(true);
    }
}

public class j043_gridBagLayout {
    public static void main(String[] args) {
        new gridBagLayoutDemo();
    }
}
