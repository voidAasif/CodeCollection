package javaHub.FrameSwing.code;

import javax.swing.JFrame;
// import javax.swing.JOptionPane;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MainFrame extends JFrame implements WindowListener{ //contains 7 methods;


    MainFrame(){
        this.setLayout(null);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.addWindowListener(this); //add listener on this frame;

        this.setVisible(true);
    }

    @Override
    public void windowActivated(WindowEvent arg0) { //when window is on focus; (! Deactivated);
        System.out.println("Window Activated");
    }

    @Override
    public void windowClosed(WindowEvent arg0) { //when window closed; (! Opened);
        System.out.println("Window Closed");
    }

    @Override
    public void windowClosing(WindowEvent arg0) { //when window try to closing;
        System.out.println("Window Closing");
        // JOptionPane.showMessageDialog(null, "Closing after 5 seconds");
        // try {
        //     Thread.sleep(1000*5);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) { //when window not on focus;
        System.out.println("Window Deactivated");
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) { // revert to current state(maximize); (! Iconified);
        System.out.println("Windows Deiconified");
    }

    @Override
    public void windowIconified(WindowEvent arg0) { // when window minimize;
        System.out.println("Window IconiFied");
    }

    @Override
    public void windowOpened(WindowEvent arg0) { //when window opened;
        System.out.println("WIndow Opened");
    }
}


public class j038_winListeners {
    public static void main(String[] args){
        new MainFrame();
    }
}