package loops_strings;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Guessing game !
        Random randomGenerator = new Random();
        int numberToGuess = randomGenerator.nextInt(3) + 1;

        //Scanner for input
        Scanner sc = new Scanner(System.in);

        //Flag to determine if the user guessed correctly
        boolean didUserGuessCorrectly = false;

        while(didUserGuessCorrectly == false){
            //Prompt user for input
            System.out.println("What is your guess?");
            int guess = sc.nextInt();

            //If guess is correct congratulate user
            if(guess == numberToGuess){
                System.out.println("Congratulations you won THE game");
                didUserGuessCorrectly = true;
            }
            else{
                System.out.println("Try again");
            }
        }

        System.out.println("Worlds worst game ending");
    }
}
