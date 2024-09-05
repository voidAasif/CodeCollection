package java.code.code;

import java.util.Scanner;
import java.util.Random;

class guessNum {
    public int ranNum() {
        int min = 0, max = 1000;
        Random ran = new Random();
        int random = ran.nextInt(max - min + 1) + min;
        return random;
    }
}

public class j033_guessTheNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        guessNum obj = new guessNum();
        System.out.println("Enter the value between 0 to 1000");
        int score = 0;
        boolean b = true;
        int rnum = obj.ranNum();
        while(b){
            int value = in.nextInt();
            if(value > rnum){
                System.out.println("enter smaller value");
                score += 1;
            }
            else if(value < rnum){
                System.out.println("enter bigger value");
                score += 1;
            }
            else {
                System.out.println("score: " + score);
                b = false;
            }
    }
       in.close(); 
    }
}
