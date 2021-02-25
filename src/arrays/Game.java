package arrays;

import object_oriented_programming.Cat;

public class Game {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Figaro", 10, 10,0);
        House firstHouse = new House(2, firstCat);

        System.out.println(firstHouse.catsInTheHouse[0].name);
    }
}
