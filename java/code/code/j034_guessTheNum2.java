package java.code.code;

/*
 * Create a class game, which allows a user to play guess the number game once. game should have the following methods --> 
 * 1. constructor to generate the random number
 * 2. takeUserInput() to take a user input of number
 * 3. isCorrectNumber() to detect whether the number entered by the user is true
 * 4. getter and setter for number of guesses
 * use properties such as noOfGuesses(int), etc to get this task done;
 */

import java.util.Scanner;
import java.util.Random;

class game {
    int guess = 0;
    int random;
    Scanner in = new Scanner(System.in); //temp
    public game(){
        // random number
        int max = 1000, min = 0;  //range
        Random ran = new Random();
        random = ran.nextInt(max - min + 1) - min;  // generate random number
        // System.out.println("Temp random: " + random);
    }
    public int getRandom(){
        return random;
    }
    public int takeUserInput(){
        // takeUserInput
        System.out.print("Enter number between 0 to 1000: ");
        int input = in.nextInt();
        return input;
    }
    public void isCorrectNumber( int random , int input){ // display
        if(random == input){
            System.out.println("*****************************");
            System.out.println("You guess the right number");
            System.out.println("*****************************");
            guess +=1;
        }
        else if(random > input){
            System.out.println("*****************************");
            System.out.println("You guess the smaller number");
            System.out.println("*****************************");
            guess +=1;
        }
        else{
            System.out.println("*****************************");
            System.out.println("You guess the larger number");
            System.out.println("*****************************");
            guess +=1;
        }
    }

    public void setGuess(int guess){
        this.guess = guess;    
    }
    public int getGuess(){
        return guess;
    }
    
}

public class j034_guessTheNum2 {
    public static void main(String[] args) {
        game obj = new game();

        int random = obj.getRandom();

        while(true){
            int input = obj.takeUserInput();
            obj.isCorrectNumber(random, input); // pass ran* or inp*
            if(random == input){  // break loop
                break;
            }
        }
        System.out.print("[[Score]]: " + obj.getGuess());  // display score
    }
}