package inheritance;

public class Circle extends GeometricFigure{
    private int radius;

    public Circle(String color, int radius){
        super(color,0);
        this.radius = radius;
    }

    @Override
    public int calculateArea(){
        return (int) Math.PI * (2 * (radius*radius));
    }
}
