package javaHub.JDBC.code.p006_transaction.src;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Transaction Handling");

        final String url = "jdbc:mysql://localhost:3306/sqlDB";
        final String username = "root";
        final String password = "myPassword";


        String creditQuery = "UPDATE account SET balance = balance - ? WHERE acNo = ?;";
        String depositQuery = "UPDATE account SET balance = balance + ? WHERE acNo = ?;";


        try (
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement creditStatement = connection.prepareStatement(creditQuery);
            PreparedStatement depositStatement = connection.prepareStatement(depositQuery);
        ) {
            connection.setAutoCommit(false);
            System.out.println("Connection Established");


            try {
                creditStatement.setDouble(1, 500.00);
                creditStatement.setString(2, "1234");
                int creditRowAffected = creditStatement.executeUpdate();
                
                depositStatement.setDouble(1, 500.00);
                depositStatement.setString(2, "5678");
                int depositRowAffected = depositStatement.executeUpdate();


                if (creditRowAffected>0 && depositRowAffected>0){
                    connection.commit();
                    System.out.println("Transaction Successful");
                }
                else {
                    System.err.println("Transaction Failed");
                }
                
                
            } catch (SQLException e) {
                connection.rollback();
                e.printStackTrace();   
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while connecting with DataBase");
        }
    }
}
