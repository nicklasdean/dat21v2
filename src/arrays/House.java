package arrays;

import object_oriented_programming.Cat;

public class House {
    int amountOfRooms;
    Cat[] catsInTheHouse = new Cat[10];

    public House(int amountOfRooms, Cat startCat){
        this.amountOfRooms = amountOfRooms;
        this.catsInTheHouse[0] = startCat;
    }
}
