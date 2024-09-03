package code;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class j086_fileHandRead {
    public static void main(String[] args) {
        try {

            FileReader myFileReader = new FileReader("/home/predatorx/aasif/programming/java/code/code/aaFile/first.txt");
            Scanner sc = new Scanner(myFileReader);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

            System.out.println("Done...");
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
