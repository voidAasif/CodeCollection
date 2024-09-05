package java.code.code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class j075_dateTimePackage {
    public static void main(String[] args){
        LocalDate d = LocalDate.now(); //print current date;
        System.out.println(d);

        LocalTime t = LocalTime.now(); //print current time;
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now(); //print current date and time;
        System.out.println(dt);

        // date time formatter; use to display date and time as user defined;
        System.out.println("****Date-Time Formatter****");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd:MM:yyyy [ a ]-- E");// set formate for date and date-time;
        String myFormattedDate = dt.format(df); //store formatted localDate into myFormattedDate variable;

        System.out.println(myFormattedDate);

        //inbuilt formate;
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;
        String myFormattedDate2 = t.format(df2);

        System.out.println(myFormattedDate2);
    }
}
