package code;

abstract class Cars{  //abstract class has at least one abstract method;
    abstract public void speed();  //no need to make all method abstract in abstract class;
    abstract public void safety();  //abstract class do not have any object;
    abstract public void engineType();  //abstract method do not have any body, we need to override it;
    abstract public void colour();  //abstract method compulsory to override;
    abstract public int price(int price);  
}

class Toyota extends Cars{
    @Override
    public void speed(){
        System.out.println("Speed: 300 Kmph");
    }
    public void safety(){
        System.out.println("Safety Rating: * * * *");
    }
    public void engineType(){
        System.out.println("Engine Type: v12");
    }
    public void colour(){
        System.out.println("Colour: Black");
    }
    public int price(int x){
        int gst = 420, price;
        price = x + gst;
        return price;
    }
}

class Volvo extends Cars{
    @Override
    public void speed(){
        System.out.println("Speed: 200 Kmph");
    }
    public void safety(){
        System.out.println("Safety Rating: * * * * *");
    }
    public void engineType(){
        System.out.println("Engine Type: v8");
    }
    public void colour(){
        System.out.println("Colour: White");
    }
    public int price(int x){
        int gst = 420, price;
        price = x + gst;
        return price;
    }
}

class Bugatti extends Cars{
    @Override
    public void speed(){
        System.out.println("Speed: 400 Kmph");
    }
    public void safety(){
        System.out.println("Safety Rating: * * * * *");
    }
    public void engineType(){
        System.out.println("Engine Type: w16");
    }
    public void colour(){
        System.out.println("Colour: SkyBlue");
    }
    public int price(int x){
        int gst = 420, price;
        price = x + gst;
        return price;
    }
}


public class j045_abstractClasses {
    public static void main(String[] args){

        System.out.println("###############Toyota Supra#####################");

        Toyota supra = new Toyota();
        supra.speed();
        supra.safety();
        supra.engineType();
        supra.colour();
        System.out.println("Price: " + supra.price(1000));

        System.out.println("###############Volvo XC60#######################");

        Volvo xc60 = new Volvo();
        xc60.speed();
        xc60.safety();
        xc60.engineType();
        xc60.colour();
        System.out.println("Price: " + xc60.price(500));

        System.out.println("###############Bugatti Chiron###################");

        Bugatti chiron = new Bugatti();
        chiron.speed();
        chiron.safety();
        chiron.engineType();
        chiron.colour();
        System.out.println("Price: " + chiron.price(1500));

        System.out.println("################################################");
    }
}
