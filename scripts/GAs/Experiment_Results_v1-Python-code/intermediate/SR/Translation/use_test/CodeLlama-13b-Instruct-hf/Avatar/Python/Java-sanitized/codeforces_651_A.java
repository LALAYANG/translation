import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_651_A {

    public static void main(String[] args) {
        // Define the decorator function
        Function<Function<Integer, Integer>, Function<Integer, Integer>> myDecorator = (func) -> {
            return (a, b) -> {
                int res = func.apply(a, b);
                return res;
            };
        };

        // Define the calculate_sum function
        Function<Integer, Integer> calculateSum = (a, b) -> {
            // Calculate the sum
            int sum = a + b;

            // Return the sum
            return sum;
        };

        // Apply the decorator to the calculate_sum function
        Function<Integer, Integer> decoratedCalculateSum = myDecorator.apply(calculateSum);

        // Define the input and output variables
        int firstNumber = 24;
        int secondNumber = 15;
        int result = 0;

        // Calculate the result
        result = decoratedCalculateSum.apply(firstNumber, secondNumber);

        // Print the result
        System.out.println(result);
    }
}