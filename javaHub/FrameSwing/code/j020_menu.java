package javaHub.FrameSwing.code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Menu extends JFrame implements ActionListener{
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit;
                //file;                        //edit;
    JMenuItem newFile, open, save, exit,    copy, paste;

    Menu(){
        //frame;
        frame = new JFrame("MenuBar Example");
        frame.setLayout(null);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);


        //items for file menu;
        newFile = new JMenuItem("New File");
        open = new JMenuItem("Open File");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Save As");

        //items for edit menu;
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        
        //add menuItems of file menu;
        file = new JMenu("File");
        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);

        //add menuItems of edit menu;
        edit = new JMenu("Edit");
        edit.add(copy);
        edit.add(paste);

        //add menu(file and edit) into menuBar;
        menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(edit);

        //action;
        newFile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        //keyboard shortcuts;
        file.setMnemonic(KeyEvent.VK_F); //alt + f;
        edit.setMnemonic(KeyEvent.VK_E); //alt + f;

        newFile.setMnemonic(KeyEvent.VK_N); //n
        open.setMnemonic(KeyEvent.VK_O); //o
        save.setMnemonic(KeyEvent.VK_S); //s
        exit.setMnemonic(KeyEvent.VK_E); //e
        copy.setMnemonic(KeyEvent.VK_C); //c
        paste.setMnemonic(KeyEvent.VK_P); //p


        //add menuBar into frame;
        frame.add(menuBar);
        frame.setJMenuBar(menuBar);

        //frame;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == newFile) {
            System.out.println("newFile");
        }
        if (e.getSource() == open) {
            System.out.println("open");
        }
        if (e.getSource() == save) {
            System.out.println("save");
        }
        if (e.getSource() == exit) {
            System.exit(ABORT); //also pass int 0;
        }
        if (e.getSource() == copy) {
            System.out.println("copy");
        }
        if (e.getSource() == paste) {
            System.out.println("paste");
        }
    }
}



public class j020_menu {
    public static void main(String[] args) {
        new Menu();
    }
}
