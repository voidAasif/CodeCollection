package code;

class smartphone { //custom class
    int price;
    String name;
    float size;
    public void fun(){
        System.out.println(size + price);
    }
}

public class j028_customClass {
    public static void main(String[] args) {
        smartphone sm = new smartphone(); // creating an object
        smartphone mi = new smartphone();
        smartphone oppo = new smartphone();
        smartphone vivo = new smartphone();

        sm.price = 10000;
        sm.name = "s23";
        sm.size = 6.8f;

        mi.price = 9000;
        mi.name = "n6p";
        mi.size = 6.5f;

        oppo.price = 8000;
        oppo.name = "f19p";
        oppo.size = 6.7f;

        vivo.price = 7000;
        vivo.name = "v29";
        vivo.size = 6.4f;

        System.out.println(sm.price);
        System.out.println(mi.name);
        System.out.println(oppo.size);
        
        sm.fun();
        mi.fun();

    }
}