package DBase;

import goalInputCards.*;

public class DBManagement {
    GoalName goalName; 
    GoalDesc goalDesc;
    GoalCategory goalCategory;
    GoalStart goalStart;
    GoalEnd goalEnd;
    
    public DBManagement(GoalName goalName, GoalDesc goalDesc, GoalCategory goalCategory, GoalStart goalStart, GoalEnd goalEnd) {
        this.goalName = goalName;
        this.goalDesc = goalDesc;
        this.goalCategory = goalCategory;
        this.goalStart = goalStart;
        this.goalEnd = goalEnd;
        
        // Now you can access the goal name
        System.out.println("GoalName: " + goalName.getGoalName());
        System.out.println("GoalDesc: " + goalDesc.getGoalDesc());
    }
}
