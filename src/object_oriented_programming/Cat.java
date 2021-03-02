package object_oriented_programming;

public class Cat{
    //Attributes of a cat
    private String name;
    private int mood;
    private int hungry;
    private int energy;

    //No args constructor
    public Cat(){}

    //Constructor
    public Cat(String name, int mood, int hungry, int energy){
        this.name = name;
        this.mood = mood;
        this.hungry = hungry;
        this.energy = energy;
    }

    //Constructor overloading
    public Cat(String name, int mood){
        this.name = name;
        this.mood = mood;
    }

    public void printYourName(){
        System.out.println(this.name);
    }

    public int getMood(){
        return this.mood;
    }
}