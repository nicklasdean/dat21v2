package catmagotchi;

public class CatmagotchiGame {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.presentMainChoices();

        boolean didUserWantToExit = false;

        while(didUserWantToExit == false){
            int userInput = menu.fetchUserInput();
            switch(userInput){
                case 1:
                    System.out.println("You picked number one");
                    break;
                case 2:
                    System.out.println("You picked number two");
                    break;
                case 3:
                    System.out.println("You chose to exit the program - goodbye");
                    didUserWantToExit = true;
                    break;
            }
        }


    }
}
