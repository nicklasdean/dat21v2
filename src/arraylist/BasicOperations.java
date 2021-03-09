package arraylist;

import java.util.ArrayList;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayList<String> listOfInts = new ArrayList<String>();

        //Add integers
        listOfInts.add("Two");      //0
        listOfInts.add("Three");    //1
        listOfInts.add("Four");     //2
        listOfInts.add("One");      //3

        //Printing the full list
        System.out.println(listOfInts);

        //Getting a single element
        System.out.println(listOfInts.get(0));

        //Removing a single element
        listOfInts.remove(2);
        System.out.println(listOfInts);

        //Printing the size (amount of elements in the list)
        System.out.println("Size of list: " + listOfInts.size());
    }
}
