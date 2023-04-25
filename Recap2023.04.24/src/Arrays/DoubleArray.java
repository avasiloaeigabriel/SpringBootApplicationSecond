package Arrays;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        double[] myArray = {1.2, 1.45, 2.56, 4.5};

        squareOfNumbers(myArray);

    }

    private static void squareOfNumbers(double[]myArray2) {
        Arrays.stream(myArray2)
                .map(value -> value*value)
                .forEach(System.out::println);
    }
}
