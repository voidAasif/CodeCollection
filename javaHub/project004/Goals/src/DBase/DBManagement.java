package DBase;

import goalInputCards.*;

public class DBManagement  {
    GoalName goalName = new GoalName();
    
    public DBManagement(){
        System.out.println(goalName.getGoalName()); //not working;
    }
}
