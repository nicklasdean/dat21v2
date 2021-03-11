package arraylist;

import java.util.Scanner;

public class ArrayPrinterTest {
    public static void main(String[] args) {
        //New ArrayPrinter
        ArrayPrinter<Integer> testPrinter = new ArrayPrinter<Integer>();
        //New Integer Array
        Integer[] integerArray = new Integer[]{1,2,3};
        //Invoke printArray method
        testPrinter.printArray(integerArray);

        ArrayPrinter<String> testPrinter2 = new ArrayPrinter<String>();
        String[] stringArray = new String[]{"Hej","med","dig"};
        testPrinter2.printArray(stringArray);
    }
}
