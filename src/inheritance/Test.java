package inheritance;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Square s = new Square("red",0,2,2);
        Square s1 = new Square("red",0,4,2);
        Square s2 = new Square("red",0,3,1);

        ArrayList<GeometricFigure> squareList = new ArrayList<GeometricFigure>();
        squareList.add(s);
        squareList.add(s1);
        squareList.add(s2);

        for(GeometricFigure square : squareList){
            System.out.println(square.calculateArea());
        }

    }
}
