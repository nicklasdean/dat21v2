package methods;
import methods.SumAndDoubleExample;

public class CallStackExample {

    public static void main(String[] args) {
        methodOne();
        methodTwo();
        SumAndDoubleExample.sumTwoIntegers(1,1);
    }

    public static void methodOne(){
        System.out.println("I am inside method one");
        methodTwo();
        System.out.println("Method two has terminated");
    }

    public static void methodTwo(){
        System.out.println("I am inside method two");
    }
}
