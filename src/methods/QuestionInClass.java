package methods;

public class QuestionInClass {

    public static void main(String[] args) {
        method();
    }

    public static String method(){
        //We cannot use this variable in the main method directly
        String name = "Something Else";
        return name;
    }
}
