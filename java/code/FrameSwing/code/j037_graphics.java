import javax.swing.JFrame;
import java.awt.*;
import java.awt.Color;

class GraphicsFrame extends JFrame{

    

    GraphicsFrame(){
        this.setTitle("graphics");
        this.setLayout(null);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.darkGray);
        // this.setUndecorated(true);


        this.setVisible(true);
    }

    public void paint(Graphics g){

        super.paint(g);

        g.setColor(Color.red);
        g.fillRect(50, 100, 100, 100);

        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.white);
        g2d.fillRect(150, 100, 100, 100);
        
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(10));
        g2d.drawOval(100, 100, 100, 100);

        g2d.setColor(Color.white);
        g2d.drawArc(100, 100, 100, 100, 90, 170);

        g2d.setColor(Color.red);
        g2d.drawArc(100, 100, 100, 100, 270, 170);


    }
}

public class j037_graphics {
    public static void main(String[] args) {
        new GraphicsFrame();
    }
}
