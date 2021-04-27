package exceptions;

public class WrongCprException extends RuntimeException {
    WrongCprException(){
        super("Wrong CPR");
    }
}
