package java.code.code;

import java.io.File;

public class j087_fileHandDelete {
    public static void main(String[] args){
        File myFile = new File("/home/predatorx/aasif/programming/java/code/code/aaFile/first.txt");

        try{
            myFile.delete();
            System.out.println("Done...");
        }
        catch(Exception e){
            System.out.println("Error while deleting file");
            e.printStackTrace();
        }
    }
}
