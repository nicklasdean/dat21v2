package object_oriented_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        Cat c = new Cat("Nicklas",1,2,3);
        Cat c1 = new Cat("Bob",1,2,3);
        Cat c2 = new Cat("Alice",1,2,3);
        Cat c3 = new Cat("Hund",1,2,3);

        ArrayList<Cat> catList = new ArrayList<Cat>(Arrays.asList(c,c1,c2,c3));

        System.out.println(c.toString());
    }
}
