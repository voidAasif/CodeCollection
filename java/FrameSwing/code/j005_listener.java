import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;  // for actionListner (interface); 
import java.awt.event.ActionListener;

class Listener extends JFrame {
    Listener(){
        JFrame myFrame = new JFrame("Listner");

        myFrame.setSize(400, 300);

        // make button;
        JButton greetButton = new JButton("Hello");
        greetButton.setBounds(20, 1, 100, 50);

        // make label;
        JLabel replyLabel = new JLabel("............");
        replyLabel.setBounds(20, 20, 100, 50);


        // add button and label;
        myFrame.add(greetButton);
        myFrame.add(replyLabel);
        
        greetButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){ 
                replyLabel.setText("Hlo..how are you");
                // System.out.println(e);
            }

        });

        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE); // exit when close;
    }
}


public class j005_listener {
    public static void main(String[] args) {
        new Listener();
    }
}
