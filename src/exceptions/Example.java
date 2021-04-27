package exceptions;

public class Example {
    public static void main(String[] args) throws Exception {
        firstMethod();
    }
    public static void firstMethod() throws Exception {
        secondMethod();
    }
    public static void secondMethod() throws Exception {
        throw new Exception();
    }
}
