
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Delete data from table using preparedStatements");
        
        final String url = "jdbc:mysql://localhost:3306/sqlDB";
        final String username = "root";
        final String password = "myPassword";

        String DeleteQuery = "DELETE FROM student WHERE name = ?;"; //for prepared statement, bcz we want to delete various data;
        String PrintQuery = "SELECT * FROM student;"; //for statement, because we only need query output;

        try ( 
            Connection conn = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = conn.prepareStatement(DeleteQuery); // to execute delete query;
            Statement statement = conn.createStatement(); //to execute print query; 

            ) {
                
                //available data before deletion;
                ResultSet resultSet = statement.executeQuery(PrintQuery); //execute and print using resultSet;
                System.out.println("Table before deletion");
                while (resultSet.next()) {
                    int rollNo = resultSet.getInt("rollNo");
                    String name = resultSet.getString("name");
                    int dob = resultSet.getInt("dob");


                    System.out.printf("| %d | %s | %d |\n", rollNo, name, dob);
                }

                System.out.println("----------------------------------------------------");

                //set data into delete query;
                preparedStatement.setString(1, "hello");

                //execute delete query;
                if(preparedStatement.executeUpdate()>0){
                    System.out.println("Query executed successfully");
                }
                else {
                    System.err.println("Error while execution query");
                }


                System.out.println("----------------------------------------------------");


                //available data after deletion;
                resultSet = statement.executeQuery(PrintQuery); //execute print query again;
                System.out.println("Table after deletion");
                while (resultSet.next()) {
                    int rollNo = resultSet.getInt("rollNo");
                    String name = resultSet.getString("name");
                    int dob = resultSet.getInt("dob");


                    System.out.printf("| %d | %s | %d |\n", rollNo, name, dob);
                }

                resultSet.close(); // close resultSet because it's out of the resources block;
                
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
