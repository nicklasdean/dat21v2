package object_oriented_programming;

public class Cat{
    //Attributes of a cat
    private String name;
    private int mood;
    private int hunger;
    private int energy;

    //Static attribute
    private static int amountOfCatsInExistence = 0;

    //No args constructor
    public Cat() {
        amountOfCatsInExistence++;
    }

    //Constructor
    public Cat(String name, int mood, int hungry, int energy){
        this.name = name;
        this.mood = mood;
        this.hunger = hungry;
        this.energy = energy;
        amountOfCatsInExistence++;
    }

    //Constructor overloading
    public Cat(String name, int mood){
        this.name = name;
        this.mood = mood;
        amountOfCatsInExistence++;
    }

    public void printYourName(){
        System.out.println(this.name);
    }

    public int getMood(){
        return this.mood;
    }

    public String getName(){
        return this.name;
    }
}