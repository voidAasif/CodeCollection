package java.code.code;

//#5
// write a program to generat a table of given number and write it to file;

//#6
// repeate #5 and make an new dir and write a table 1 to 10 into dir and eact table write into different file;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// import java.util.Scanner;



public class j088_practice112 {
    public static void main(String[] args) {

//#5



        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number for which you want the multiplication table: ");
        // int number = scanner.nextInt();

        // try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/predatorx/aasif/programming/java/code/code/aaFile/practice088Q5.txt"))) {
        //     for (int i = 1; i <= 10; i++) {
        //         writer.write(number + " * " + i + " = " + (number * i));
        //         writer.newLine();
        //     }
        //     System.out.println("Multiplication table of " + number + " has been written to " + "/home/predatorx/aasif/programming/java/code/code/aaFile/practice088Q5.txt");
        // } catch (IOException e) {
        //     System.err.println("An error occurred while writing the file: " + e.getMessage());
        // }

        // scanner.close();



//#6




        String directoryPath = "/home/predatorx/aasif/programming/java/code/code/aaFile/practice088Q6";
        File directory = new File(directoryPath); // pass path of dir to the constructor;

        // Create directory if it does not exist
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully: " + directoryPath);
            } else {
                System.err.println("Failed to create directory: " + directoryPath);
                return;
            }
        }

        // Generate multiplication tables from 1 to 10 and write to different files
        for (int number = 1; number <= 10; number++) { // 1 to 10;

            String filePath = directoryPath + "/Table_of_" + number + ".txt"; // dirPath/fileName.txt

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                for (int i = 1; i <= 10; i++) {
                    writer.write(number + " * " + i + " = " + (number * i)); // write table into file;
                    writer.newLine(); // new line;
                }
                System.out.println("Multiplication table of " + number + " has been written to " + filePath);
            } catch (IOException e) {
                System.err.println("An error occurred while writing the file: " + e.getMessage());
            }
        }




    }
}


