package DBase;

import goalInputCards.*;

//DB imports;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;

import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.sql.Date;


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
        insertData(); //execute query or statement to insert data;

    }

    private void establishConnection(){
        final String url = "jdbc:mysql://localhost:3306/goals";
        // final String url = "jdbc:mysql://localhost:3307/goals"; //temp

        final String username = "root";
        final String password = "myPassword";

        try {
            dbConnection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully");

            // dbConnection.close(); //temp stay open the connection;
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

    public DBManagement(){
        establishConnection();
    }

    public List<String> getNameList(){ //to return name;
        // fetch name and end date form DB;

        final String nameQuery = "SELECT goalName FROM goalsData;";

        List<String> nameList = new ArrayList<>();

        try (
            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(nameQuery);
        ) {
            while (rs.next()) {
                nameList.add(rs.getString("goalName"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while fetching data from DB");
        }


        return nameList;
    }

    public List<Date> getEndDateList(){ //to return end date;
        // fetch name and end date form DB;

        final String endQuery = "SELECT goalEnd FROM goalsData;";

        List<Date> endList = new ArrayList<>();

        try (
            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(endQuery);
        ) {
            while (rs.next()) {
                endList.add(rs.getDate("goalEnd"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while fetching data from DB");
        }


        return endList;
    }

    public boolean deleteGoal(String goalName){
        boolean deleteFlag = true;
        final String deleteQuery = "DELETE FROM goalsData WHERE goalName = ?;";

        try (
            PreparedStatement deleteEntry = dbConnection.prepareStatement(deleteQuery);
        ) {
            deleteEntry.setString(1, goalName);
            deleteEntry.executeUpdate();

            System.err.println("Goal Deleted");
        } catch (SQLException e) {
            e.printStackTrace();
            deleteFlag = false;
            System.err.println("Error while deleting Goal");
        }

        return deleteFlag;
    }
}
