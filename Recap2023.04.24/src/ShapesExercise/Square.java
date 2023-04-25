package ShapesExercise;

public class Square extends Shape {

    private double squareSide;

    public Square(double squareSide){
        this.squareSide = squareSide;
    }
    @Override
    double getArea() {
        return squareSide*squareSide;
    }
}
