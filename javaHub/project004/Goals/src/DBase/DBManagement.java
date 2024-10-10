package DBase;

import goalInputCards.*;

//DB imports;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;

import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.util.ArrayList;


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
            // System.out.println("Connection Established Successfully"); //log;

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

            // System.out.println("Insertion Successful"); //log;
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

            // System.err.println("Goal Deleted"); //log;
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

            // System.err.println("Goal Updated"); //log;
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

            // System.err.println("Priority inserted into table"); //log;
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
            System.err.println("Error while fetching data from DB"); //log;
        }


        return dashDataList;
    }

    public boolean getWhichDate(){
        final String fetchDateQuery = "SELECT whichDate FROM dateNow WHERE dateId = 1;";
        Date whichDate;
        Date todayDate = new Date(System.currentTimeMillis());

        try (
            Statement fetchDate = dbConnection.createStatement();
            ResultSet fetchResult = fetchDate.executeQuery(fetchDateQuery);
        ) {

            while(fetchResult.next()){
                whichDate = fetchResult.getDate("whichDate");

                System.out.println(todayDate);
                System.out.println(whichDate);

                if(!(todayDate.toString().equals(whichDate.toString()))){
                    System.out.println("debug date");
                    resetDateNow(todayDate);
                    moveIntoIncomplete();
                    clearCompleteGoals();
                    return false; //not today;
                }else {
                    System.out.println("Both date same");
                }
            }

            System.out.println("Success fetch date"); //log;
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while fetching Date"); //log;
        }

        return true; //today;
    }

    private void resetDateNow(Date todayDate){
        final String updateDateQuery = "UPDATE dateNow SET whichDate = ? WHERE dateId = 1;";

        try (
            PreparedStatement updateEntry = dbConnection.prepareStatement(updateDateQuery);
        ) {
            updateEntry.setDate(1, todayDate);

            updateEntry.executeUpdate();

            System.out.println("Date reset success");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while updating today date"); //log;
        }
    }

    private void moveIntoIncomplete(){
        final String copyQuery = "SELECT goalName FROM goalsData;";
        final String resetIncompleteQuery = "DELETE FROM incompleteGoals;";
        final String pasteQuery = "INSERT INTO incompleteGoals (goalName) VALUES (?);";

        try (
            Statement copyStmt = dbConnection.createStatement(); // for copy query;
            ResultSet copyResult = copyStmt.executeQuery(copyQuery);

            Statement resetStmt = dbConnection.createStatement(); // for reset query;

            PreparedStatement pasteStmt = dbConnection.prepareStatement(pasteQuery); //for paste query;
        ) {
            resetStmt.executeUpdate(resetIncompleteQuery);

            while(copyResult.next()){
                String currentName = copyResult.getString("goalName");
                pasteStmt.setString(1, currentName);
                pasteStmt.addBatch();
            }

            pasteStmt.executeBatch();

            System.out.println("Move data success");
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while copy paste data");
        }
    }

    private void clearCompleteGoals(){

        final String clearQuery = "DELETE FROM completeGoals;";

        try (
            Statement clearStmt = dbConnection.createStatement();
        ) {
            clearStmt.executeUpdate(clearQuery);
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while clearing complete table");
        }
    }

    public List<String> getIncompleteGoals(){
        final String fetchGoalNameQuery = "SELECT goalName FROM incompleteGoals;";

        List<String> goalNameList = new ArrayList<>();

        try (
            Statement fetchGoalName = dbConnection.createStatement();
            ResultSet fetchResult = fetchGoalName.executeQuery(fetchGoalNameQuery);
        ) {
            
            while(fetchResult.next()){
                goalNameList.add(fetchResult.getString("goalName"));
            }

            System.out.println("Get data success");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while fetching goalName from incompleteGoals");
        }

        return goalNameList;
    }

    public List<String> getCompleteGoals(){
        final String fetchGoalNameQuery = "SELECT goalName FROM completeGoals;";

        List<String> goalNameList = new ArrayList<>();

        try (
            Statement fetchGoalName = dbConnection.createStatement();
            ResultSet fetchResult = fetchGoalName.executeQuery(fetchGoalNameQuery);
        ) {
            
            while(fetchResult.next()){
                goalNameList.add(fetchResult.getString("goalName"));
            }

            System.out.println("Get data success");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while fetching goalName from incompleteGoals");
        }

        return goalNameList;
    }

    //TodoListItemNotDone;
    public boolean inCompleteToComplete(String goalName){
    
        final String pasteQuery = "INSERT INTO completeGoals (goalName) VALUES (?);";
        final String deleteQuery = "DELETE FROM incompleteGoals WHERE goalName = ?";

        try (
            PreparedStatement pasteStmt = dbConnection.prepareStatement(pasteQuery);
            PreparedStatement deleteStmt = dbConnection.prepareStatement(deleteQuery);
        ) {
            pasteStmt.setString(1, goalName);
            pasteStmt.executeUpdate(); //insert into complete table;

            deleteStmt.setString(1, goalName);
            deleteStmt.executeUpdate(); //delete from incomplete table;

            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //TodoListItemDone;
    public boolean completeToInComplete(String goalName){
        final String pasteQuery = "INSERT INTO incompleteGoals (goalName) VALUES (?);";
        final String deleteQuery = "DELETE FROM completeGoals WHERE goalName = ?";

        try (
            PreparedStatement pasteStmt = dbConnection.prepareStatement(pasteQuery);
            PreparedStatement deleteStmt = dbConnection.prepareStatement(deleteQuery);
        ) {
            pasteStmt.setString(1, goalName);
            pasteStmt.executeUpdate(); //insert into complete table;

            deleteStmt.setString(1, goalName);
            deleteStmt.executeUpdate(); //delete from incomplete table;

            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean isSetupCompleted(){
        final String getSetupFlagQuery = "SELECT setupFlag FROM setupData;";
        final String setFlagFalse = "UPDATE setupData SET setupFlag = 1 WHERE setupId = 1;";

        try (
            Statement setupFlagStmt = dbConnection.createStatement();
            Statement setFlagFalseStmt = dbConnection.createStatement();
            ResultSet setupFlagResult = setupFlagStmt.executeQuery(getSetupFlagQuery);
        ) {
            
            while(setupFlagResult.next()){
                setFlagFalseStmt.executeUpdate(setFlagFalse);
                return setupFlagResult.getBoolean("setupFlag");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while fetching setup flag fro setupData");
        }

        return false;
    }
}
