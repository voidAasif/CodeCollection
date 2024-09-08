//clone notepad;
package javaHub.FrameSwing.project;


import javax.swing.ImageIcon; 
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;


class NotePad extends JFrame implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit, view,     color;
    JMenuItem newFile, open, save, saveAs,    cut, copy, paste,   clear, dark, light;
    JTextArea textArea;
    JFileChooser fileOpen, fileSave;
    String path = "/home/predatorx/aasif/programming/java/code/FrameSwing/res/untitled.txt";
    JScrollPane scrollPane;

    
    @SuppressWarnings("deprecation")
    NotePad(){
        //frame;
        frame = new JFrame("NotePad");
        // frame.setLayout(null);
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null);
        // frame.setResizable(false);
        ImageIcon icon = new ImageIcon("FrameSwing/res/icon2.png");
        frame.setIconImage(icon.getImage());
        frame.setCursor(Cursor.HAND_CURSOR);


        //menu item for file menu;
        newFile = new JMenuItem("New File");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save As");

        //menu item for edit menu;
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");

        //menu item for view menue;
        clear = new JMenuItem("Clear Screen");

        //menu item for color menue;
        dark = new JMenuItem("Dark");
        light = new JMenuItem("Light");


        //Add all menuItems into menu;

        //add menu items into color menu;
        color = new JMenu("Color");
        color.add(dark);
        color.add(light);

        //add menu items in file menu;
        file = new JMenu("File");
        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(saveAs);

        //add menu items in edit menu;
        edit = new JMenu("Edit");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        //add menu items in view menu;
        view = new JMenu("View");
        view.add(clear);
        view.add(color);


        //add all menu into menuBar;
        menuBar = new JMenuBar();
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);


        //textArea;
        textArea = new JTextArea();
        // textArea.setBounds(10, 10, 1170, 740);
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(new Color(255, 213, 98));
        Font font = new Font("Arial", Font.PLAIN, 32);
        textArea.setFont(font);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setCaretColor(Color.BLACK);

        //scroll pane;
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 10, 1170, 740);
        // scrollPane.setBounds(10, 10, frame.getWidth()-30, frame.getHeight()-60);


        //action;
        newFile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        saveAs.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        clear.addActionListener(this);
        dark.addActionListener(this);
        light.addActionListener(this);


        //add component into frame;
        frame.add(menuBar);
        frame.setJMenuBar(menuBar);
        // frame.add(textArea);
        frame.add(scrollPane);


        //frame;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == newFile){ //work;
            System.out.println("newFile"); //log;
            textArea.setText(""); // rempve text from text area;
            
            String fileName = JOptionPane.showInputDialog(frame, "Enter File Name:"); // show dialog to imput filename;
            path = "/home/predatorx/aasif/programming/java/code/FrameSwing/res/"+fileName+".txt";
            File myFile = new File(path); // path of file(name);

            try {
                myFile.createNewFile(); //create new file;
                JOptionPane.showMessageDialog(frame, "File Created"); // show dialog when file created;
            }
             catch (Exception fileE) {
                JOptionPane.showMessageDialog(frame, "Error"); // show dialog if an error occur while creating new file;
                fileE.printStackTrace(); // error log;
            }

        }
        else if(e.getSource() == open){ // work;
            System.out.println("open");
            
            try {
                fileOpen = new JFileChooser(); //obj;
                fileOpen.showOpenDialog(frame); //file chooser;
                path = String.valueOf(fileOpen.getSelectedFile()); // get path from fileChooser;

                //read file;
                try {

                    FileReader openFile = new FileReader(path); //obj, set path;
                    Scanner sc = new Scanner(openFile);
                    while(sc.hasNextLine()){ // read lines;
                        // System.out.println(sc.nextLine());
                        textArea.setText(sc.nextLine()); // print lines on textArea;
                    }
        
                    System.out.println("Done...");
                    sc.close();
        
                } catch (FileNotFoundException openE) {
                    System.out.println("File not found");
                    JOptionPane.showMessageDialog(frame, "Error: while reading file");
                    openE.printStackTrace();
                }

                JOptionPane.showMessageDialog(frame, "Done"); // open file opr done;
            } 
            catch (Exception openE) {
                JOptionPane.showMessageDialog(frame, "Error: file not found");
                openE.printStackTrace();
            }
        }
        else if(e.getSource() == save){ //work;
            System.out.println("save");

            try {
                FileWriter fileWriter = new FileWriter(path); //set path on writer;
                fileWriter.write(textArea.getText()); //get text from textArea and write into file;
                fileWriter.close(); //close writer;
                JOptionPane.showMessageDialog(frame, "File Saved"); // file save dialog;
            }
            catch(Exception saveE){
                JOptionPane.showMessageDialog(frame, "Error: file not saved"); // show dialog if an error occur while writing in file;
                saveE.printStackTrace(); // error log;
            }
        }
        else if(e.getSource() == saveAs){ //work;
            System.out.println("save");

            fileSave = new JFileChooser(); //obj;
            fileSave.showOpenDialog(frame); // open fileChooser;
            
            //create
            File myFile = new File(String.valueOf(fileSave.getSelectedFile())+".txt"); // path of file(name); //path of file where you want to save;
            System.out.println(String.valueOf(fileSave.getSelectedFile())+".txt"); //log;
            try {
                myFile.createNewFile(); //create new file;
                JOptionPane.showMessageDialog(frame, "File Saved at: "+String.valueOf(fileSave.getSelectedFile())+".txt"); // show dialog when file created;
            }
             catch (Exception fileE) {
                JOptionPane.showMessageDialog(frame, "Error file not saved"); // show dialog if an error occur while creating new file;
                fileE.printStackTrace(); // error log;
            }

            //write;
            try {
                FileWriter fileWriter = new FileWriter(String.valueOf(fileSave.getSelectedFile())+".txt"); //writing in file on current path;
                fileWriter.write(textArea.getText()); // get text from textArea and write into file;
                fileWriter.close();
            }
            catch(Exception saveE){
                JOptionPane.showMessageDialog(frame, "Error: while writing a file"); // show dialog if an error occur while writing in file;
                saveE.printStackTrace(); // error log;
            }

            //delete duplicate file;
            File deletFile = new File(path);
            try {
                deletFile.delete();
            } 
            catch (Exception deleteE) {
                deleteE.printStackTrace();
            }
            
        }
        else if(e.getSource() == cut){ //work;
            System.out.println("cut"); //cut from textArea;
            textArea.cut();
        }
        else if(e.getSource() == copy){ //work;
            System.out.println("copy"); //copy from textArea;
            textArea.copy();
        }
        else if(e.getSource() == paste){ //work;
            System.out.println("paste"); //paste from textArea;
            textArea.paste();
        }
        else if(e.getSource() == clear){ // clear screen;
            System.out.println("clear");
            int flag = JOptionPane.showConfirmDialog(frame, "Are you sure"); // show dialog;
            if(flag == 0){ // if user click ok;
                textArea.setText(""); // clear screen;
            }
        }
        else if(e.getSource() == dark){ //work; // change theme;
            System.out.println("dark");
            textArea.setForeground(new Color(255, 213, 98));
            textArea.setBackground(Color.BLACK);
            textArea.setCaretColor(Color.YELLOW);
        }
        else if(e.getSource() == light){ //work;
            System.out.println("light");
            textArea.setForeground(Color.BLACK);
            textArea.setBackground(new Color(255, 213, 98));
            textArea.setCaretColor(Color.BLACK);
        }
    }
}


public class j001_notepad {
    public static void main(String[] args) {
        new NotePad();
    }
}
