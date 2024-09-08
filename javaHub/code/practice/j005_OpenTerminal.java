package practice;

import java.io.IOException;

public class j005_OpenTerminal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            // Command to open terminal based on common terminal emulators
            String command = "";
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
                // Linux
                command = "x-terminal-emulator";
            } else if (os.contains("mac")) {
                // MacOS
                command = "open -a Terminal";
            } else {
                System.out.println("Unsupported OS: " + os);
                return;
            }
            // Execute the command
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

