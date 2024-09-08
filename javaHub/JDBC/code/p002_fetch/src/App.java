package javaHub.JDBC.code.p002_fetch.src;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fetch data from database");

        final String url = "jdbc:mysql://localhost:3306/sqlDB";
        final String username = "root";
        final String password = "myPassword";

        String query = "SELECT * FROM student;";

        // try {                                          //jdbc driver load automatically after jdbc4.0 version, now we no need to explicitly load drivers;
        //     Class.forName("com.mysql.cj.jdbc.Driver"); //load Driver;
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

        try {
            Connection connection = DriverManager.getConnection(url, username, password); //establish connection with database;
            Statement stmt = connection.createStatement(); // create statement using connection;
            ResultSet resultSet = stmt.executeQuery(query); //result set work when query return some output, execute query using statement;

            while(resultSet.next()){ // change below data for each iteration;
                int rollNo = resultSet.getInt("rollNo"); // first column;
                String name = resultSet.getString("name"); // second column;
                String dob = resultSet.getString("dob"); // third column;

                System.out.println("+---+-------+--------------+");
                System.out.println("| "+ rollNo +" | "+ name +" | "+ dob+ " |"); //print data;
            }

            resultSet.close(); // close all interfaces;
            stmt.close();
            connection.close();
            
        } catch (SQLException e) { // throw sql exception;
            e.printStackTrace();
        }

    }
}
