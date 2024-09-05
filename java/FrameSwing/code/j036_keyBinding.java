package java.FrameSwing.code;

import java.awt.Color;
// import java.awt.Desktop.Action;
import javax.swing.Action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

class Binding extends JFrame {
    JFrame frame;
    JLabel label;

    //declare actions;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Binding(){
        //frame;
        this.setTitle("keyBinding; use:(a,d,up,down)");
        this.setLayout(null);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);

        //label;
        label = new JLabel();
        label.setBounds(100, 100, 100, 100);
        label.setBackground(Color.black);
        label.setOpaque(true);

        //actions, dynamic method dispatch, Action with inner classes;
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        //define keyStrokes, use inputMap to set key;
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "goUp"); //key, name;
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "goDown"); //key, name;
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "goLeft"); //key, name;
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "goRight"); //key, name;

        //call classes corresponding to keys, use actionMap to target;
        label.getActionMap().put("goUp", upAction); //name, action;
        label.getActionMap().put("goDown", downAction); //name, action;
        label.getActionMap().put("goLeft", leftAction); //name, action;
        label.getActionMap().put("goRight", rightAction); //name, action;

        //add into frame;
        this.add(label);

        //frame;
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //inner classes;

    class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
           label.setLocation(label.getX(), label.getY()-10);
        }
        
    }
    class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
        
    }
    class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY() );
        }
        
    }
    class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
           label.setLocation(label.getX()+10, label.getY() );
        }
        
    }
}



public class j036_keyBinding {
    public static void main(String[] args) {
        new Binding();
    }
}
