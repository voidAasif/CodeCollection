package practice;


import java.io.*;


public class j028_executeCommand {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

//#1;
        try{
            Process process = Runtime.getRuntime().exec("ls -a"); //execute command;
            process.waitFor(); //wait until command execute if needed;

            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream())); //read inputStream (command's output);

            String line; // used to print output lines;
            int lineNumber = 0;
            while((line = br.readLine()) != null){
                System.out.println(lineNumber++ + ": " + line);
            }
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

//#2;
        // try{
        //     ProcessBuilder builder = new ProcessBuilder("ls", "-a");
        //     Process process = builder.start();



        //     BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));

        //     String line;
        //     int lineNumber = 0;
        //     while((line = br.readLine()) != null){
        //         System.out.println(lineNumber++ + ": " + line);
        //     }
        //     br.close();
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
    }
}


