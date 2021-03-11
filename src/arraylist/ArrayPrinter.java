package arraylist;

public class ArrayPrinter<T>{
    public void printArray(T[] arrayToPrint){
        for(int i = 0 ; i < arrayToPrint.length ; i++){
            System.out.println(arrayToPrint[i]);
        }
    }
}
