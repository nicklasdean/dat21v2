package unit_tests;

public class AgeValidator {
    public String isLegalAge(int age){
        if(age>17){
            return "Legal age";
        }
        else if(age<0){
            return "Illegal";
        }
        else{
            return "not legal";
        }
    }
}
