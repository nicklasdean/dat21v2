package genopfriskning;

public class Genopfriskning_3 {
    public static void main(String[] args) {
        System.out.println(howOften(2, 4.5));
    }

    public static int howOften(double currentHeight, double limit){
        final double GROWTH_RATE;
        //Solution 1
        return (int) Math.ceil(limit/currentHeight);
        //Solution 2
        //return (int) Math.floor(limit/currentHeight);
    }
}
