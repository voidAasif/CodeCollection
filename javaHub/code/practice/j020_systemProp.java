package practice;

// import java.util.Map;
// import java.util.Properties;



public class j020_systemProp {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(System.getProperty("os.name")); //os name
        
        // System.out.println(System.getProperty("os.version"));  // os version

        // System.out.println(System.currentTimeMillis());  // ?

        // System.out.println(System.getSecurityManager());  // ? java var 17

        // System.out.println(System.nanoTime());  // ?




        // Get system environment variables  //gpt
        // Map<String, String> envVariables = System.getenv();
        // System.out.println("System Environment Variables:");

        // for (Map.Entry<String, String> entry : envVariables.entrySet()) {
        //     System.out.println(entry.getKey() + " = " + entry.getValue());
        // }

        System.out.println("\n-------------------------------------\n");

        // Get system properties
        // Properties systemProperties = System.getProperties();
        // System.out.println("System Properties:");
        // systemProperties.forEach((key, value) -> {
        //     System.out.println(key + " = " + value);
        // });
    
    }
}
