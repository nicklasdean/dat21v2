package genopfriskning;

import java.util.Locale;

public class Genopfriskning_5 {
    public static void main(String[] args) {
        properCase("num");
        properCase("små bogstaver");
        properCase("stort begyndelse");
    }
    public static String properCase(String str){
        String[] stringArray = str.split(" ");
        StringBuilder returnString = new StringBuilder();

        for (String s:stringArray) {
            if(s.equals(s.toLowerCase())){
                returnString.append(s + " ");
            }
            if(s.length() < 4){
                returnString.append(s.toLowerCase() + " ");
            }
            else{
                returnString.append(s.substring(0, 1).concat(s.substring(1)) + " ");
            }
        }
        return returnString.toString();
    }
}
