package variables_operators;

public class StringExample {
    public static void main(String[] args) {
        String myName = "Nicklas"; //Storing a String
        String surName = "Frederiksen";
        String fullName = myName + surName; //Concatenating two strings

        //Escaping a " char from a String
        String escapedString = "\"";

        //Making a String all uppercase
        String nameInUpperCase = myName.toUpperCase();
        System.out.println(nameInUpperCase);

        System.out.println(fullName);
        System.out.println(escapedString);
    }
}
