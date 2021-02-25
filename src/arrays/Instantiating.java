package arrays;

public class Instantiating {
    public static void main(String[] args) {
        String[] stringArray = {"Hello World","Lorem ipsum", "En til"};
        System.out.println(stringArray.length);

    }
    //I can assume that the array holds 3 integers
    public static int sumThreeNumbers(int[] numbers){
        return numbers[0] + numbers[1] + numbers[2];
    }

    public static int sumNumbersFromArray(int[] numbers){
        //An array has a length numbers.length
        return 0;
    }
}
