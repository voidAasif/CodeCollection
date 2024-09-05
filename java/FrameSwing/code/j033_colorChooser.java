import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

class ColorChooser extends JFrame implements ActionListener {

    JButton button;
    JColorChooser chooser;

    ColorChooser(){
        //frame;
        this.setTitle("Color chooser");
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 100));
        this.setPreferredSize(new Dimension(700, 300));

        //button;
        button = new JButton("Pick Color");
        button.setFont(new Font("Arial", Font.BOLD, 50));
        button.setFocusable(false);

        //action;
        button.addActionListener(this);
        
        // add color chooser into frame;
        this.add(button);  
        
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            chooser = new JColorChooser(); // color chooser;
            Color color = JColorChooser.showDialog(null, "pick color", Color.WHITE); //parent, title, initial color;
            
            button.setBackground(color);
            button.setText("rgb("+color.getRed()+","+color.getGreen()+","+color.getBlue()+")");
        }
        
    }
}

public class j033_colorChooser {
    public static void main(String[] args) {
        new ColorChooser();
    }
}
