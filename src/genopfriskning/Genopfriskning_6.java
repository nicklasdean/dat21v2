package genopfriskning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Genopfriskning_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(sc.nextLine());
        }
        Collections.sort(strings);
        Collections.reverse(strings);
        System.out.println(strings);
    }
}
