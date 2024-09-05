package java.FrameSwing.code;


import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Chooser extends JFrame implements ActionListener {

    JButton button;
    JFileChooser fileChooser;

    Chooser(){
        //frame;
        this.setTitle("File Chooser");
        this.setSize(500, 450);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //button;
        button = new JButton("Open File Chooser");
        button.setPreferredSize(new Dimension(200, 50));

        //action;
        button.addActionListener(this);
        
        
        //add into frame;
        this.add(button);
        
        //frame;
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            fileChooser = new JFileChooser();
            int a = fileChooser.showOpenDialog(null);
            // int a = fileChooser.showSaveDialog(null);
            System.out.println(a);

            System.out.println(fileChooser.getSelectedFile());
        }
    }
}


public class j032_fileChooser {
    public static void main(String[] args) {
        new Chooser();
    }
}
