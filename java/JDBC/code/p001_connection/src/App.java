
import java.sql.DriverManager; //import connection driver;
import java.sql.Connection; //responsible for connection;
import java.sql.SQLException; //handle exception;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First JDBC program");

        //database url;
        String url = "jdbc:mysql://localhost:3306/sqlDB";

        //database credentials;
        String username = "root";
        String password = "myPassword";

        //establish the connection;
        try (Connection connection = DriverManager.getConnection(url, username, password)){ //use try-with-res to auto close the connection;
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed");
        }

    }
}
