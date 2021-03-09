package arraylist;

import java.util.ArrayList;

public class Wrappers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //An Integer object is en class-representation of int primitive
        list.add(1);
        list.add(2);
        int sum = list.get(0) + list.get(1);
        System.out.println(sum);
    }
}
