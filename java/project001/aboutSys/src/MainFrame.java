import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame; //imports;

public class MainFrame extends JFrame { //JFrame;

    ImageIcon frameIcon = new ImageIcon("aboutSys/src/res/frameIcon.png"); //FrameIcon;

    RightPanel rightPanel = new RightPanel(); // execute RightPanel;
    LeftPanel leftPanel = new LeftPanel(rightPanel); // execute LeftPanel and pass RightPanel in LeftPanel to control RightPanel from LeftPanel;

    MainFrame(){ //constructor;
        // Frame settings
        this.setIconImage(frameIcon.getImage()); // add icon into frame;
        this.setLayout(new BorderLayout()); //layout BorderLayout to use panel and directions;
        this.setTitle("About System"); // title;
        this.setSize(800, 600);
        this.setLocationRelativeTo(null); // open middle of the screen;

        // Add components into the frame
        this.add(leftPanel, BorderLayout.WEST);  //add left panel into west of mainFrame;
        this.add(rightPanel, BorderLayout.CENTER); //add right panel into center of the mainFrame;

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String toString(){
        return "Executing"; // set main frame return value;
    }
}
