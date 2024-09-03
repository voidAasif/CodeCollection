package code;

import java.util.Calendar; //abstract class;
import java.util.GregorianCalendar; //concrete class;
import java.util.TimeZone;

public class j074_calendarClass {
    public static void main(String[] args){

        // Calendar obj = Calendar.getInstance(); // Asia/kolkata as default;
        Calendar obj = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println("## get calendar type: " + obj.getCalendarType());
        System.out.println("## get time in millis: " + obj.getTimeInMillis());
        System.out.println("## get time: " + obj.getTime());
        System.out.println("## get time zone: " + obj.getTimeZone());
        System.out.println("## get time zone id: " + obj.getTimeZone().getID());
        System.out.println("## get instance: " + Calendar.getInstance()); //static method;

        System.out.println("********************************");

        System.out.println(obj.get(Calendar.MONTH));
        System.out.println(obj.get(Calendar.DATE));
        System.out.println(obj.get(Calendar.HOUR));
        System.out.println(obj.get(Calendar.HOUR_OF_DAY));
        System.out.println(obj.get(Calendar.MINUTE));
        System.out.println(obj.get(Calendar.SECOND));

        System.out.println("********************************");

        System.out.println(obj.get(Calendar.HOUR) + ":" + obj.get(Calendar.MINUTE) + ":" + obj.get(Calendar.SECOND));


        System.out.println("********************************");

        //gregorian calendar; concrete class;

        GregorianCalendar gre = new GregorianCalendar();

        System.out.println(gre.isLeapYear(2024));
        System.out.println(gre.get(Calendar.HOUR) + ":" + gre.get(Calendar.MINUTE) + ":" + gre.get(Calendar.SECOND));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getAvailableIDs()[5]);
    }
}
