package practice;

enum Car {
    volvo, 
    bmw,
    toyota;
}

enum Day {
    Sunday, 
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;

    public String getDay(){
        return name().toLowerCase();
    }
}

enum smartPhonePrice {
    //key value enum;
}

public class j030_enum {
    public static void main(String[] args) {
        //first enum;
        Car car = Car.volvo;
        System.out.println(car);

        //second enum;
        Day day = Day.Wednesday;
        String str = day.getDay();
        System.out.println(str);
    }
}
