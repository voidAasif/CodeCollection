package practice;
// IT'S RECOMMENDED TO CREATE ENUMS IN UPPERCASE;
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

enum SmartPhonePrice {
    SAMSUNG(100),
    OPPO(150),
    VIVO(200);

    int price;

    SmartPhonePrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
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

        //third enum;
        SmartPhonePrice smartPhonePrice = SmartPhonePrice.SAMSUNG;
        System.out.print(smartPhonePrice);
        System.out.println(": $"+smartPhonePrice.getPrice());
    }
}
