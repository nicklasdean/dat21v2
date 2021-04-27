package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        Scanner locationScanner = new Scanner(System.in);
        System.out.println("File location");
        File f = new File(locationScanner.nextLine());
        try {
            Scanner fileScanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
