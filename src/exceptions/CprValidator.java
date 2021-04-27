package exceptions;

import java.util.InputMismatchException;

public class CprValidator {
    public boolean validateCpr(String cpr){
        if(cpr.length() != 10){
            throw new WrongCprException();
        }
        return true;
    }
}
