package inheritance;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Square s = new Square("red",0,2,2);
        Circle c = new Circle("red",5);

        ArrayList<GeometricFigure> squareList = new ArrayList<GeometricFigure>();
        squareList.add(s);
        squareList.add(c);

        for(GeometricFigure figure : squareList){
            figure.calculateArea();
        }
    }
}
