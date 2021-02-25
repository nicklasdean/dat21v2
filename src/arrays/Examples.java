package arrays;

public class Examples {
    public static void main(String[] args) {
        String[] stringArray = {"Hello World","Lorem ipsum", "En til"};
        System.out.println(stringArray.length);
    }
    //I can assume that the array holds 3 integers
    public static int sumThreeNumbers(int[] numbers){
        return numbers[0] + numbers[1] + numbers[2];
    }

    public static int sumNumbersFromArray(int[] numbers){
        int sum = 0;
        for(int i = 0 ; i<numbers.length ; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static int howManyAbove5(int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 5){
                counter++;
            }
        }
        return counter;
    }
}
