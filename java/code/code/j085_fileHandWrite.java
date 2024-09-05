package java.code.code;

import java.io.FileWriter;
import java.io.IOException;

public class j085_fileHandWrite {
    public static void main(String[] args){
        try {

            FileWriter myFileWriter = new FileWriter("/home/predatorx/aasif/programming/java/code/code/aaFile/first.txt");
            myFileWriter.write("abcdefghijklmnopqrstuvwxyz");
            myFileWriter.write("   xyz");
            myFileWriter.append("\n apple");
            myFileWriter.append("\n ball");
            myFileWriter.append("\n cat");
            myFileWriter.append("\n dog");
            myFileWriter.append("\n elephant");

            myFileWriter.close();
            System.out.println("Done...");

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
