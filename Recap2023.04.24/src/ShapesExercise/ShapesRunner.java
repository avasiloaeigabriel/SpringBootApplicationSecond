package ShapesExercise;

import java.util.ArrayList;
import java.util.List;

public class ShapesRunner {

    public static void main(String[] args) {
        List<Shape> myShapesList = new ArrayList<>();
        myShapesList.add(new Circle(5));
        myShapesList.add(new Square(15));
        myShapesList.add(new Triangle(13, 5));
        for (Shape shape : myShapesList) {
            System.out.println("The area is: " + shape.getArea());
        }
        //        myShapesList.forEach(Shape -> System.out.println(Shape.getArea()));//sau asa se mai poate face, ambele solutii sunt bune;

    }

}
