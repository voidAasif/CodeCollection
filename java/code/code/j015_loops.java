package code;

public class j015_loops {
    public static void main(String[] args) {
        int i = 0;
        //while loop
        while(i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("End of while loop");
        i = 0;
        //do-while loop
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
        System.out.println("End of do-while loop");

        //for loop
        for(i=0;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("End of for loop");
    }
}
