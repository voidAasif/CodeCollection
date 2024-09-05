
import javax.swing.JFrame; // import JFrame;
import java.awt.Color;


class j001_frame {  // main class;

    // public JFrame myFrame; // now JFrame accessible in all the methods of j001 class;

    public j001_frame(){  // constructor of main class;

        // JFrame accessible only in the constructor of j001 class;
        JFrame myFrame = new JFrame(); // make obj of JFrame class;



        
        // myFrame.setLayout(null);   // set layout = null //play imp role for aligning items;
        myFrame.setSize(600, 400); // set width and hight; 
        
        myFrame.setTitle("Aasif"); // set title of frame;
        
        myFrame.setResizable(false); // now frame isn't resizable;

        myFrame.setVisible(true);  // set visibility (recommend: end place);

        myFrame.getContentPane().setBackground(Color.MAGENTA); // change bg color;
        // myFrame.getContentPane().setBackground(new Color(255, 255, 123)); // change bg color;
        // myFrame.getContentPane().setBackground(new Color(0xF4C6A3)); // change bg color;
    }



    public static void main(String[] args){

        new j001_frame(); // constructor call;
        // j001_frame obj = new j001_frame(); // also valid ('obj' store in memory);


        System.out.println("Open..");
    }
}