package DBase;

import goalInputCards.*;

public class DBManagement  {
    GoalName goalName = new GoalName();
    
    public DBManagement(){
        goalName.setGoalName();
        System.out.println("GoalName: "+goalName.getGoalName()); //not working;
    }
}
