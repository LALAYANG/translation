import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_617_B {

    public static void main(String[] args) {
        // Read the input
        int n = Integer.parseInt(System.console().readLine());
        String inputString = System.console().readLine();

        // Split the input string into substrings separated by '1'
        List<String> substrings = Arrays.asList(inputString.split("1"));

        // Count the number of '0's in each substring
        List<Integer> counts = substrings.stream()
                .map(s -> (int) s.chars().filter(ch -> ch == '0').count())
                .collect(Collectors.toList());

        // Compute the value for each count
        List<Integer> values = counts.stream()
                .map(count -> computeValue(count, 1))
                .collect(Collectors.toList());

        // Calculate the product of the values
        int result = values.stream()
                .reduce(1, (a, b) -> a * b);

        // Print the result
        System.out.println(result == 0 ? 0 : result);
    }

    private static int sumTwoValues(int arg0, int arg1) {
        return arg0 + arg1;
    }

    private static int composedAdd(int arg0, int arg1) {
        return sumTwoValues(arg0, arg1);
    }

    private static int computeValue(int input, int b) {
        return composedAdd(input, b);
    }
}