package code;

// import java.sql.Date;

public class j073_dateAndTime { // 1970 + 54 = 2024 //old method (java 8);
    public static void main(String[] args){
                                           // ms     /  S /M /H /D /Y;
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); 
        
        // Date d = new Date(0);

        // System.out.println("d: " + d);
        // System.out.println("get time: " + d.getTime());
        // System.out.println("get date: " + d.getDate());
        // System.out.println("get seconds: " + d.getSeconds());
        // System.out.println("get min: " + d.getMinutes());
        // System.out.println("get hours: " + d.getHours());
        // System.out.println("get day: " + d.getDay());
        // System.out.println("get year: " + d.getYear());
    }
}
