import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_131_B {

    public static void main(String[] args) {
        // Read input from stdin
        String input = System.console().readLine();

        // Split input into a list of integers
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // Shuffle the list of integers
        Collections.shuffle(numbers);

        // Create a map of integer counts
        Map<Integer, Integer> counts = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Initialize the c variable
        int c = 0;

        // Recursively calculate the sum of the counts
        recursiveFunction(0, counts.size() - 1, 1, counts, c);

        // Print the final result
        System.out.println(c);
    }

    private static void recursiveFunction(int index, int stop, int step, Map<Integer, Integer> counts, int c) {
        // Base case: if the index is out of bounds, return
        if (index < 0 || index >= counts.size()) {
            return;
        }

        // Calculate the sum of the counts
        c += counts.get(index) * (counts.get(index) - 1);

        // Recursively call the function with the next index
        recursiveFunction(index + step, stop, step, counts, c);
    }
}