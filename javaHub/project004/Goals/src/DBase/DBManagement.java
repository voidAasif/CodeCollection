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

    public boolean updateGoal(String newGoalName, String oldGoalName){

        boolean updateFlag = true;
        final String updateQuery = "UPDATE goalsData SET goalName = ? WHERE goalName = ?;";

        try (
            PreparedStatement updateEntry = dbConnection.prepareStatement(updateQuery);
        ) {
            updateEntry.setString(1, newGoalName);
            updateEntry.setString(2, oldGoalName);

            updateEntry.executeUpdate();

            System.err.println("Goal Updated");
        } catch (SQLException e) {
            e.printStackTrace();
            updateFlag = false;
            System.err.println("Error while Updating Goal");
        }

        return updateFlag;
    }

    public boolean addPriorityGoal(String goalName){ //used by priorityListItem;

        boolean addFlag = true;
        final String fetchQuery = "SELECT goalId, goalName, goalEnd FROM goalsData;";

        try (
            PreparedStatement fetchStmt = dbConnection.prepareStatement(fetchQuery);
            ResultSet fetchEntry = fetchStmt.executeQuery(fetchQuery);
        ) {

            while (fetchEntry.next()) {
                int goalId = fetchEntry.getInt("goalId");
                String goalNameDB = fetchEntry.getString("goalName");
                Date goalEnd = fetchEntry.getDate("goalEnd");

                if (goalName.equals(goalNameDB)) {
                    addEntry(goalName, goalEnd, goalId);
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            addFlag = false;
            System.err.println("Error while Updating Priority Goal");
        }

        return addFlag;
    }

    private void addEntry(String goalName, Date goalEnd, int goalId){
        final String clearQuery = "DELETE FROM priorityGoal;";
        final String insertQuery = "INSERT INTO priorityGoal (goalName, goalEnd, goalId) VALUES (?, ?, ?);";

        try (
            PreparedStatement clearEntry = dbConnection.prepareStatement(clearQuery);
            PreparedStatement updateEntry = dbConnection.prepareStatement(insertQuery);
        ) {
            updateEntry.setString(1, goalName);
            updateEntry.setDate(2, goalEnd);
            updateEntry.setInt(3, goalId);

            clearEntry.executeUpdate(); //now only one item added at a time;
            updateEntry.executeUpdate();

            System.err.println("Priority inserted into table");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while inserting priority Goal");
        }
    }

    public List<String> getDashData(){ //used by dashCard;
        // fetch name and end date form priorityGoal table;

        final String fetchQuery = "SELECT goalName, goalEnd FROM priorityGoal;";

        List<String> dashDataList = new ArrayList<>();

        try (
            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(fetchQuery);
        ) {
            while (rs.next()) {
                dashDataList.add(rs.getString("goalName"));
                dashDataList.add(String.valueOf(rs.getDate("goalEnd")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while fetching data from DB");
        }


        return dashDataList;
    }
}
