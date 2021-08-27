package genopfriskning;

import java.util.Arrays;

public class Genopfriskning_7 {
    public static void main(String[] args) {

    }

    public static int search(String[] strArr, String s){
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals(s)){
                return i;
            }
        }
        return -1;
    }
}
