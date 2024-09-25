package DBase;

import goalInputCards.*;

//DB imports;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBManagement {
    GoalName goalName; 
    GoalDesc goalDesc;
    GoalCategory goalCategory;
    GoalStart goalStart;
    GoalEnd goalEnd;

    Connection dbConnection;
    
    public DBManagement(GoalName goalName, GoalDesc goalDesc, GoalCategory goalCategory, GoalStart goalStart, GoalEnd goalEnd) {
        this.goalName = goalName;
        this.goalDesc = goalDesc;
        this.goalCategory = goalCategory;
        this.goalStart = goalStart;
        this.goalEnd = goalEnd;
        
        // Now you can access the goal name
        // System.out.println("GoalName: " + goalName.getGoalName());
        // System.out.println("GoalDesc: " + goalDesc.getGoalDesc());
        // System.out.println("GoalCategory: " + goalCategory.getGoalCategory());
        // System.out.println("GoalStart: " + goalStart.getGoalStart());
        // System.out.println("GoalEnd: " + goalEnd.getGoalEnd());

        establishConnection();
    }

    private void establishConnection(){
        final String url = "jdbc:mysql://localhost:3306/goals";

        final String username = "root";
        final String password = "myPassword";

        try {
            dbConnection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully");
            insertData(); //execute query or statement to insert data;
            dbConnection.close();
        } 
        catch (SQLException e) {
            e.printStackTrace(); //log;
            System.err.println("Connection not Established");
        }
    }

    private void insertData(){

        final String query = "INSERT INTO goalsData (goalName, goalDesc, goalCategory, goalStart, goalEnd) VALUE (?, ?, ?, ?, ?);";

        try(
            PreparedStatement insertGoals = dbConnection.prepareStatement(query);
        ){
            insertGoals.setString(1, goalName.getGoalName());
            insertGoals.setString(2, goalDesc.getGoalDesc());
            insertGoals.setString(3, goalCategory.getGoalCategory());
            insertGoals.setDate(4, goalStart.getGoalStart());
            insertGoals.setDate(5, goalEnd.getGoalEnd());

            insertGoals.executeUpdate();

            System.out.println("Insertion Successful"); //log;
        } 
        catch (SQLException e) {
            e.printStackTrace(); //log;
            System.err.println("Error while Inserting data");
        }
    }
}
