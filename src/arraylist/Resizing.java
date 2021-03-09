package arraylist;

import object_oriented_programming.Cat;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Resizing {
    //How does resizing work
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>(3);
        for (int i = 0; i < 20; i++) {
            list.add(i);
            System.out.format("Size: %2d, Capacity: %2d%n",
                    //Printing size & Capacity (from method)
                    list.size(), getCapacity(list));
        }
    }

    //Method for finding arraylist capacity https://stackoverflow.com/questions/3564837/capacity-of-arraylist
    public static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}
