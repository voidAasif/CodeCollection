package java.code.code;

import java.io.File;

public class j084_fileHandCreate {
    public static void main(String[] args){
        
        try {
            File myFile = new File("/home/predatorx/aasif/programming/java/code/code/aaFile/first.txt");
            myFile.createNewFile();

            System.out.println("Done...");
        }
        catch(Exception e){
            System.out.println("Error while creatin file");
            e.printStackTrace();
        }
    }
}
