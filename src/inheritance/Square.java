package inheritance;

public class Square extends GeometricFigure{
    private int width;
    private int length;

    public Square(String color, int nrOfAngles,int width, int length){
        super(color,nrOfAngles);
        this.width = width;
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return this.width * length;
    }
}
