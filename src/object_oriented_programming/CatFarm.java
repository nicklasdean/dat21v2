package object_oriented_programming;

public class CatFarm {
    public static void main(String[] args) {
        Cat myFirstCat = new Cat("Holger", 10,5,1);
        Cat mySecondCat = new Cat("Kis", 1,10,5);

        System.out.println(myFirstCat.name);
        System.out.println(mySecondCat.name);
    }
}
