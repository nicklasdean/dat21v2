package loops_strings;

import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {

        countToTen();
        countDownFrom10();
        generateRandomNumbers();


        //Print each letter of a String on a separate line
    }

    //Count to 10
    public static void countToTen(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("Running for the " + i + "th time");
        }
    }

    //Count down from 10
    public static void countDownFrom10(){
        for(int i = 10 ; i > 0 ; i--){
            System.out.println(i);
        }
    }

    //Generate & print 10 random numbers between 1-10
        //Sum the numbers
    public static void generateRandomNumbers(){
        Random randomGenerator = new Random();
        int sum = 0;

        for(int i = 0 ; i < 100 ; i++){
            int randomInteger = 1 + randomGenerator.nextInt(10);
            sum += randomInteger;
            System.out.println(randomInteger);
        }

        System.out.println(sum);
    }
}
