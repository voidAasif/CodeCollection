package java.FrameSwing.code;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class FrameLabel extends JFrame {
    FrameLabel(){
        JFrame myFrame = new JFrame("Label");

        myFrame.setSize(400, 200);


        //text area;
        JTextArea myTextArea = new JTextArea("HI..");
        myTextArea.setBounds(100, 100, 300, 100);
        
        
        //label;
        JLabel myLabel = new JLabel("First Name: ");
        myLabel.setBounds(1, 1, 100, 100);        
        

        // add both into frame;
        myFrame.add(myLabel);
        myFrame.add(myTextArea);

        myFrame.setVisible(true);
    }
}




public class j003_label {
    public static void main(String[] args) {
        new FrameLabel();
    }
}
