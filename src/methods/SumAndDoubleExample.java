package methods;

public class SumAndDoubleExample {
    public static void main(String[] args) {
        //Problem: sum two integers - and double that amount
        int four = sumTwoIntegers(2,2);
        int eight = doubleInt(four);
        int alsoEight = doubleInt(sumTwoIntegers(4,4));
    }

    //Sum two integers
    public static int sumTwoIntegers(int first, int second){
        return first + second;
    }

    //Double that amount
    public static int doubleInt(int integerToDouble){
        return integerToDouble*2;
    }
}
