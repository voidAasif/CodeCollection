
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.io.FileOutputStream;
import java.io.IOException; //imports;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fetch Image from dataBase");
        
        final String image_path = "javaHub/JDBC/code/p009_fetchImage/res/fetch_dp.jpg"; //path where i want to download image;

        final String url = "jdbc:mysql://localhost:3306/sqlDB"; // dataBase credentials;
        final String username = "root";
        final String password = "myPassword";

        final String query = "SELECT image FROM imageTable WHERE image_id = 1;"; //query to fetch image from dataBase;

        try (
            Connection conn = DriverManager.getConnection(url, username, password); //create connection;
            PreparedStatement pstmt = conn.prepareStatement(query); //setup query;
            ResultSet resultSet = pstmt.executeQuery(); //execute query and store output in resultSet;
            FileOutputStream imageWrite = new FileOutputStream(image_path); // file output stream to convert bytes into image;
        ) {

            while (resultSet.next()) { //while next line occur;
                imageWrite.write(resultSet.getBytes("image")); //fileOutputStream write on path, ResultSet get bytes from 'image' column of table;
            }
            
            
        } catch (SQLException e) { //throw exception by jdbc;
            e.printStackTrace();
            System.err.println("DataBase not found");
        } catch (IOException e){ //throw exception by fileOutputStream;
            e.printStackTrace();
            System.err.println("File not found");
        }

    }
}
