package inheritance;

public abstract class GeometricFigure {
    private String color;
    private int numberOfAngles;

    public GeometricFigure(String color, int numberOfAngles){
        this.color = color;
        this.numberOfAngles = numberOfAngles;
    }

    public abstract int calculateArea();
}
