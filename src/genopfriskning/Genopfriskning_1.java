package genopfriskning;

import java.util.ArrayList;

public class Genopfriskning_1 {
    public static boolean doesArrayListContainString(String s, ArrayList<String> l){
        if(l.contains(s)){
            System.out.println("The String has been found");
            return true;
        }
        l.add(s);
        return false;
    }
}
