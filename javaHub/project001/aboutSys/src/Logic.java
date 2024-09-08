
import java.io.BufferedReader;
import java.io.InputStreamReader; //imports;

public class Logic {

    public String getHome() { //default text or home page;
        return "About System\n" +
                "Version: 1.0\n" +
                "Developed By: Aasif\n" +
                "Release Date: August 2024\n" +

                "----------------------------\n" +

                "Description: This software provides a comprehensive solution for displaying detailed system specifications. It offers an intuitive interface to view critical information about your system, including operating system, version, processor, battery status, display details, RAM, and memory.\n"
                +

                "----------------------------\n" +

                "Key Features:\n" +
                "- Feature 1: [Display Software Specifications]\n" +
                "- Feature 2: [Display Hardware Specifications]\n" +

                "----------------------------\n" +

                "Support: For assistance, please contact aasifsaifi9280@gmail.com.\n" +

                "----------------------------\n" +

                "Feedback: We value your feedback! Please visit [predator-rwx.github.io/aasif] to share your thoughts and suggestions.\n";
    }

    public String getOs() {
        return "\n\nOS Name: " + System.getProperty("os.name") +
                "\nOS Architecture: " + System.getProperty("os.arch") +
                "\nUser Name: " + System.getProperty("user.name") +
                "\nUser Home Directory: " + System.getProperty("user.home") +
                "\nOS Version: " + System.getProperty("os.version");
    }

    public String getProcessor() { 

        String os = System.getProperty("os.name").toLowerCase(); //get os name;
        String command = ""; //empty string used to set command according to OS;

        // Determine the OS and set the command to retrieve processor details
        if (os.contains("win")) {
            command = "wmic cpu";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            command = "lscpu";
        } else {
            return "Unsupported Operating System";
        }

        return executeCommand(command); // call method which return output of command;
    }

    public String getMemory() { 
        String os = System.getProperty("os.name").toLowerCase(); //same;
        String command = "";

        if (os.contains("win")) {
            command = "wmic memorychip";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            command = "df -h";
        } else {
            return "Unsupported Operating System";
        }

        return executeCommand(command);
    }

    public String getBattery() {
        String os = System.getProperty("os.name").toLowerCase(); //same;
        String command = "";

        if (os.contains("win")) {
            command = "WMIC PATH Win32_Battery";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            command = "upower -i /org/freedesktop/UPower/devices/battery_BAT0\n" + "";
        } else {
            return "Unsupported Operating System";
        }

        return executeCommand(command);
    }

    public String getDisplay() {
        String os = System.getProperty("os.name").toLowerCase(); //same;
        String command = "";

        if (os.contains("win")) {
            // Command for Windows to get display information (Resolution)
            command = "wmic path Win32_VideoController";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            // Command for Linux/macOS to get display information
            command = "xrandr --query";
        } else {
            return "Unsupported Operating System";
        }

        return executeCommand(command);
    }


    //method to read command output;
    @SuppressWarnings("deprecation")
    private String executeCommand(String command) { //receive different command from above methods;;

        StringBuilder output = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec(command); //execute command;
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream())); //read output;
            String line; //initialize String variable to append trim output;
            while ((line = reader.readLine()) != null) { //if line null then trim string and if line is not Null then append in line;
                line = line.trim(); //trim line;
                if(!line.isEmpty()){
                    output.append(line).append("\n"); //append line into output;
                }
            }
            reader.close(); //close output reader;
        } catch (Exception e) {
            return "Error retrieving processor details: " + e.getMessage();
        }
        return output.toString().trim(); //return output;
    }
}
