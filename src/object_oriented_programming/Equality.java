package object_oriented_programming;

public class Equality {
    public static void main(String[] args) {
        System.out.println("Strings");
        String str = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str == str2); // false
        System.out.println(str.equals(str2)); // true

        Cat c = new Cat("Klaus",1,2,3);
        Cat c2 = new Cat("Klaus",1,2,3);

        System.out.println("Cats");

        System.out.println(c == c2); //false
        System.out.println(c.equals(c2)); //true

        System.out.println("Persons");
        Person p1 = new Person(1111,"Nicklas");
        Person p2 = new Person(1111,"Nicklas F");

        System.out.println(p1.equals(p2));
    }
}
