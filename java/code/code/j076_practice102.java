package code;


// import java.util.ArrayList;

//#1
// Create an Arraylist and store names of 10 students inside it.
// print it using a for-each loop;


// import java.sql.Date;
// import java.util.Calendar;
// import java.text.SimpleDateFormat;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
//#2,3,4
// Use the date class in java to print time in the following formate: 
// 21:47:02
// repeat #2 using the calendar class;
// repeat #2 using java time API;


// import java.util.HashSet;
//#5
// Create a set in java. Try to store duplicate elements inside that set.
// and verify that only are instance is stored;



public class j076_practice102 {
    public static void main(String[] args){
        //#1
        // ArrayList<String> alObj = new ArrayList<>();

        // alObj.add("1. Aasif saifi");
        // alObj.add("2. Rohan");
        // alObj.add("3. Mohan");
        // alObj.add("4. Sohan");
        // alObj.add("5. Ompal");
        // alObj.add("6. Sompal");
        // alObj.add("7. Amarpal");
        // alObj.add("8. Rampal");
        // alObj.add("9. Mohanpal");
        // alObj.add("10.Birajpal");

        // for(String ele: alObj){
        //     System.out.println(ele);
        // }

        //#2,3,4
        //using date class;
        // Date myDate = new Date(0);
        
        // SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        // String myDtf = formatter.format(myDate);
        // System.out.println(myDtf);

        // //using calendar class;
        // Calendar myCalendar = Calendar.getInstance();
        // System.out.println(myCalendar.get(Calendar.HOUR) + ":" + myCalendar.get(Calendar.MINUTE) + ":" + myCalendar.get(Calendar.SECOND));

        //  //&&

        // SimpleDateFormat formatter1 = new SimpleDateFormat("hh:mm:ss");
        // String myDtf1 = formatter1.format(myCalendar.getTime());
        // System.out.println(myDtf1);

        // //using java time api;
        // LocalTime lt = LocalTime.now();
        // DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        // String myDtf2 = dtFormatter.format(lt);
        // System.out.println(myDtf2);

        //#5
        // HashSet<Integer> hs = new HashSet<>();
        
        // hs.add(5);
        // hs.add(7); // duplicate;
        // hs.add(34);
        // hs.add(6);
        // hs.add(56);
        // hs.add(7); // duplicate;
        // hs.add(32);

        // System.out.println(hs);
    }
}
