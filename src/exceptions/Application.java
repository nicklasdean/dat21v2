package exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            CprValidator cpr = new CprValidator();
            System.out.println(cpr.validateCpr(sc.nextLine()));
        }
        catch(WrongCprException exception){
            System.out.println(exception.getMessage());
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
