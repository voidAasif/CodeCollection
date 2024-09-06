import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement; // allows placeholders;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Prepared statements and Insert data into database");

        final String url = "jdbc:mysql://localhost:3306/sqlDB";
        final String username = "root";
        final String password = "myPassword";
        String query = "INSERT INTO student (name, dob) VALUE (?, ?)"; // '?' = placeholders;

        // Result set is not required here because 'query' doesn't return any output (it's an INSERT query);
        try {
            // Create a connection to the database;
            Connection conn = DriverManager.getConnection(url, username, password); 
            
            // Create a prepared statement to execute the query with placeholders;
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            // Set the values for the placeholders;
            preparedStatement.setString(1, "hello");  // Set 'name' column value;
            preparedStatement.setInt(2, 2001);        // Set 'dob' (YEAR type) as an integer value;

            // Execute the query and check if any rows were affected;
            if (preparedStatement.executeUpdate() != 0) { // executeUpdate returns the number of rows affected;
                System.out.println("Data uploaded successfully");
            } else {
                System.err.println("Data not uploaded");
            }

            // Close the connection and the statement;
            conn.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while inserting data into Database");
        }
    }
}
