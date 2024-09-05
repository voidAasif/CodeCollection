import javax.swing.*;
import java.awt.*;
import java.awt.Color;

class LogoContainerFrame extends JFrame {
    LogoContainerFrame(){
        this.setTitle("Logo");
        this.setLayout(null);
        this.setSize(800, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.gray);
        g2d.setStroke(new BasicStroke(10));

        int top = 50;

        g2d.drawOval(10, top, 100, 100);
        g2d.drawOval(80, top, 100, 100);
        g2d.drawOval(150, top, 100, 100);
        g2d.drawOval(220, top, 100, 100);

        top = 200;

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(20));

        g2d.drawOval(30, top, 200, 200);
        
        g2d.setColor(Color.white);
        g2d.fillOval(40, top+10, 180, 180);

        g2d.setColor(Color.BLUE);
        g2d.fillArc(40, top+10, 180, 180, 40, 100);
        g2d.fillArc(40, top+10, 180, 180, 220, 100);


        top = 450;

        
    }
}




public class j005_graphicsLogo { public static void main(String[] args) { new LogoContainerFrame(); }}
