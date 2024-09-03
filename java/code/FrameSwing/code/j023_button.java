import javax.swing.JButton;
import javax.swing.JFrame;

class myButton extends JFrame {
    JFrame frame;
    JButton btn;

    myButton(){
        //frame;
        frame = new JFrame("Button methods");
        frame.setLayout(null);
        frame.setSize(350, 350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //button;
        btn = new JButton("Click me");
        btn.setBounds(50, 50, 100, 50);
        btn.setFocusable(false); // remove unwanted focus border from btn;
        btn.addActionListener(e -> System.out.println("btn clicked")); //lambda expression;


        //add into frame;
        frame.add(btn);

        frame.setVisible(true);
    }
}


public class j023_button {
    public static void main(String[] args) {
        new myButton();
    }
}
