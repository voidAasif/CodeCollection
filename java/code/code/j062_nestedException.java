package code;

public class j062_nestedException {
    public static void main(String[] args){
        System.out.println("Nested try catch block");

        try {
            System.out.println("lvl_1");



                    try {
                        System.out.println("lvl_2");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }


        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
