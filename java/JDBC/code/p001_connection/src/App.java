
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First JDBC program");

        //database url;
        String url = "jdbc:mysql://localhost:3306/sqlDB";

        //database credentials;
        String username = "root";
        String password = "myPassword";

        //establish the connection;
        try (Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("connected to the database");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed");
        }

    }
}
