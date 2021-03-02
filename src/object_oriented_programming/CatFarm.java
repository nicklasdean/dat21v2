package object_oriented_programming;

public class CatFarm {
    public static void main(String[] args) {
        //Cat farm class is creating an instance of the class 'Cat' by using the cats constructor
        Cat myFirstCat = new Cat("Holger", 10,5,1);
        Cat mySecondCat = new Cat("Danske", 5,5,1);
    }
    //Comparing the mood of two cats
    public int returnHighestMood(Cat firstCat, Cat secondCat){
        if(firstCat.getMood() > secondCat.getMood()){
            return firstCat.getMood();
        }
        else{
            return secondCat.getMood();
        }
    }
}
