package catmagotchi;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public void presentMainChoices(){
        System.out.println("Welcome");
        System.out.println("Press 1 to create a cat");
        System.out.println("Press 2 to do something else");
        System.out.println("Press 3 to exit the program");
    }

    public int fetchUserInput() {
        int userInput = sc.nextInt();
        return userInput;
    }

}
