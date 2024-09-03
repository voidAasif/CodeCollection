
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

class WordCount extends JFrame implements ActionListener {

    public JFrame myFrame;
    public JTextArea ta;
    public JButton b;
    public JLabel label;

    WordCount(){
        myFrame = new JFrame("Word Count");
        ta = new JTextArea();
        b = new JButton("Count");
        label = new JLabel("****");


        myFrame.setLayout(null);
        myFrame.setSize(700, 500);

        ta.setBounds(10, 10, 600, 100);
        ta.setAutoscrolls(true);

        b.setBounds(10, 120, 100, 50);

        label.setBounds(10, 340, 700, 100);


        myFrame.add(ta);
        myFrame.add(b);
        myFrame.add(label);

        b.addActionListener(this);

        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String letter = ta.getText();            // getText return number of character in string;
        String[] words = ta.getText().split(" "); //here we split using " "-> space show getText return number of words;
        
        label.setText("Letters: " + letter.length() + " and words: " + words.length); // pring length of letter and words;
    }
}



public class j009_wordCount {
    public static void main(String[] args) {
        new WordCount();
    }
}
