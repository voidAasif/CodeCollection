
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException; //imports;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fetch and store image into dataBase"); //title;

        final String image_path = "javaHub/JDBC/code/p008_InsertImage/res/dp.jpg"; //path of image;

        //dataBase Credentials;
        final String url = "jdbc:mysql://localhost:3306/sqlDB"; 
        final String username = "root";
        final String password = "myPassword";

        final String query = "INSERT INTO imageTable (image) VALUE (?)"; //query to insert image into dataBase;

        try ( //resources;
            Connection conn = DriverManager.getConnection(url, username, password); //establish connection with DataBase;
            PreparedStatement pstmt = conn.prepareStatement(query); //create query statement;
            FileInputStream imageStream = new FileInputStream(image_path); //set path of image in file Input Stream, it input image as binary stream;
        ) {

            byte[] imageBytes = new byte[imageStream.available()]; //imageStream.available() -> for approximate size of array acc to image bytes size;
            imageStream.read(imageBytes); //read image bytes and set into byte array;
            
            pstmt.setBytes(1, imageBytes); //prepared statement -> set byte image array into statement to add bytes data into dataBase;

            int rowAffected = pstmt.executeUpdate(); //execute query, return row affected;

            if(rowAffected>0){
                System.out.println("Image Inserted into dataBase");
            }else {
                System.err.println("Image not Inserted");
            }
            
        } catch (SQLException e) { //DriverManager, Connection and PreparedStatement throw SQLException;
            e.printStackTrace();
            System.err.println("Error while connecting with dataBase");
        }catch (IOException e) { //FileInputStream throw IOException;
            e.printStackTrace();
            System.err.println("Error while reading file");
        }
    }
}
