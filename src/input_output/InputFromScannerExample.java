package input_output;
import java.util.Scanner;

public class InputFromScannerExample {
    public static void main(String[] args){

        //Prompt the users name
        System.out.println("What is your name?");
        Scanner inputFromUser = new Scanner(System.in);
        String name = inputFromUser.nextLine();


        //Prompt my age
        System.out.println("How old are you?");
        int age = inputFromUser.nextInt();

        //Output users name and age with a friendly message
        System.out.println("Friendly message:" + name + " " + age);

        //Hvorfor bruger vi new
        //For at lave en ny instans/objekt af Scanneren

    }

}
