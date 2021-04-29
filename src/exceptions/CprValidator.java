package exceptions;

public class CprValidator {
    public boolean validateCpr(String cpr){
        if(cpr.length() != 10){
            throw new WrongCprException();
        }
        return true;
    }
}
