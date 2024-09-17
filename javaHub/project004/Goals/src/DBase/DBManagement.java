package DBase;

import goalInputCards.*;

public class DBManagement  {
    GoalName goalName; 
    
    public DBManagement(){
        goalName = new GoalName();
        // goalName.setGoalName();
        System.out.println("GoalName: "+goalName.getGoalName()); //not working;
    }
}
