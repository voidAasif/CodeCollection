package javaHub.JDBC.code.p005_CRUDopr.src;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner; //imports;

public class App {

    //queries;
    static String queryC = "INSERT INTO student (rollNo, name, dob) VALUE (?,?,?);";
    static String queryR = "SELECT * FROM student;";
    static String queryU = "UPDATE student SET name = ?, dob = ? WHERE rollNo = ?;";
    static String queryD = "DELETE FROM student WHERE rollNo = ?;";

    //global interfaces;
    static Connection connect;
    static Statement statement;
    static PreparedStatement preparedStatement;
    static ResultSet resultSet;

    public static void main(String[] args) throws Exception {
        System.out.println("Perform CRUD operation");

        // C => CREATE;
        // R => READ;
        // U => UPDATE;
        // D => DELETE;

        final String url = "jdbc:mysql://localhost:3306/sqlDB";
        final String username = "root";
        final String password = "myPassword";

        try {
            connect = DriverManager.getConnection(url, username, password); //connect with server;
            System.out.println("Successfully connected to dataBase");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while connecting");
        }

        
        while (true) { //infinite loop;
            System.out.println();
            System.out.println("1. INSERT DATA");
            System.out.println("2. PRINT DATA");
            System.out.println("3. UPDATE DATA");
            System.out.println("4. DELETE DATA");
            System.out.println();
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = in.nextInt(); //input choice;
    
            //variables for queries;
            int rollNo; 
            String name;
            int dob;

            switch (choice) {
                case 1: //C
                    System.out.print("Roll No: ");
                    rollNo = in.nextInt(); in.nextLine();
                    System.out.print("Name: ");
                    name = in.nextLine();
                    System.out.print("DOB: ");
                    dob = in.nextInt();

                    insert(rollNo, name, dob); //call;

                    break;
                case 2: //R
                    select();

                    break;
                case 3: //U
                    System.out.print("Select row by RollNo: ");
                    rollNo = in.nextInt(); in.nextLine();
                    System.out.print("Enter new Name: ");
                    name = in.nextLine();
                    System.out.print("Enter new DOB: ");
                    dob = in.nextInt();

                    update(rollNo, name, dob); //call;

                    break;
                case 4: //D
                    System.out.print("Enter Roll No: ");
                    rollNo = in.nextInt();

                    delete(rollNo); //call;

                    break;

                default:
                    in.close();
                    connect.close();
                    System.out.println("Server close");
                    break;
            }
        }

    }

    private static void insert(int rollNo, String name, int dob) {
        try {
            preparedStatement = connect.prepareStatement(queryC); //create Prepared statement;
            preparedStatement.setInt(1, rollNo); //set values into queries;
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, dob);

            rowAffected(preparedStatement.executeUpdate()); //execute queries;

            preparedStatement.close(); //close Prepared Statement;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while Inserting data into table");
        }
    }

    private static void select() {
        try {
            statement = connect.createStatement(); //create statement;
            resultSet = statement.executeQuery(queryR); // execute query;

            while (resultSet.next()) { //print table;
                int rollNo = resultSet.getInt("rollNo");
                String name = resultSet.getString("name");
                int dob = resultSet.getInt("dob");

                System.out.println("--------------------------");
                System.out.printf("| %d | %s | %d| \n", rollNo, name, dob);
            }

            resultSet.close(); //close resultSet and Statement;
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while Reading Table");
        }
    }

    private static void update(int rollNo, String name, int dob) {
        try {
            preparedStatement = connect.prepareStatement(queryU); //create statement;
            preparedStatement.setString(1, name); //set values in queries;
            preparedStatement.setInt(2, dob);
            preparedStatement.setInt(3, rollNo);

            rowAffected(preparedStatement.executeUpdate()); //execute query;

            preparedStatement.close(); //close prepared statement;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while Updating value");
        }
    }

    private static void delete(int rollNo) {
        try {
            preparedStatement = connect.prepareStatement(queryD); //create prepared statement;
            preparedStatement.setInt(1, rollNo); //set values;

            rowAffected(preparedStatement.executeUpdate()); //execute query;

            preparedStatement.close(); //close prepared statement;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while deleting from table");
        }
    }

    private static void rowAffected(int rowAff){
        if (rowAff>0) {
            System.out.println(rowAff+"- Rows Affected");
        }
        else {
            System.err.println("No change");
        }
    }
}

//second way: pass queries into methods;
