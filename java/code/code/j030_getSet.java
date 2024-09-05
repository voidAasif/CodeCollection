package code;

import java.util.Scanner;

class product {
    private int price;
    private String name;

    public void setPrice(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class j030_getSet {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in); // Scanner obj
    product obj = new product(); // class obj

        System.out.print("Enter price of product: "); // Input values
        int setp = in.nextInt();
        in.nextLine(); // Consume the newline character
        System.out.print("Enter name of product: ");
        String setn = in.nextLine();

        obj.setPrice(setp); // call
        obj.setName(setn);

        // System.out.println(obj.price); // Error ==> (price & name are private)
        // System.out.println(obj.name);

        System.out.println("Name ==>" + obj.getName()); // Print Output
        System.out.println("Price ==>" + obj.getPrice());

        in.close();
    }
}
