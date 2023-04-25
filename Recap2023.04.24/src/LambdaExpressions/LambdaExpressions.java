package LambdaExpressions;

import java.util.Arrays;

public class LambdaExpressions {
    int[] numbers = {1, 2, 3, 4, 5, 6};
    public void printSumOfEvenNumbers(){

        int sumOfEvenNumbers = Arrays.stream(numbers)
                .filter(value -> value % 2 == 0)
                .sum();
        System.out.println(sumOfEvenNumbers);
    }
}
