package arraylist;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String KEYWORD = "no strings attached";
        boolean stop = false;

        while(stop == false){
            System.out.println("Input please:");
            String input = sc.nextLine();
            if(input.equals(KEYWORD)){
                stop = true;
            }
            else {
                //Tilføjer ordet til en arraylist
            }
        }
        System.out.println("End of program");
    }
}
