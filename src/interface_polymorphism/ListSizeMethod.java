package interface_polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSizeMethod {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Vector vectorList = new Vector();

        ListSizeMethod testObject = new ListSizeMethod();

        //Testing with arraylist
        testObject.returnHowManyElementsInAnArrayList(arrayList);

        //Testing with all types of lists
        testObject.returnHowManyElementsInAnyList(arrayList);
        testObject.returnHowManyElementsInAnyList(linkedList);
        testObject.returnHowManyElementsInAnyList(vectorList);
    }

    //Write a method that returns how many elements a list contains
    public int returnHowManyElementsInAnArrayList(ArrayList list){
        int howManyElementsInList = list.size();
        return howManyElementsInList;
    }

    //More general method
    public int returnHowManyElementsInAnyList(List list){
        int howManyElementsInList = list.size();
        return howManyElementsInList;
    }
}
