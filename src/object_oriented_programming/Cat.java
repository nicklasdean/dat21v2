package object_oriented_programming;

public class Cat {
    //Attributes of a cat
    String name;
    int mood;
    int hungry;
    int energy;

    //Constructor
    public Cat(String nameOfCat, int moodOfCat, int hungerOfCat, int energyOfCat){
        this.name = nameOfCat;
        this.mood = moodOfCat;
        this.hungry = hungerOfCat;
        this.energy = energyOfCat;
    }
}
