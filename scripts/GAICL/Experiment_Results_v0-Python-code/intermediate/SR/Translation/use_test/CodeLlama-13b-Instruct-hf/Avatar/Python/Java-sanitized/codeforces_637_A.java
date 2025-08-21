import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new HashMap<>();
        for (String element : input) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }
        List<String> sortedInput = Arrays.asList(input);
        Collections.sort(sortedInput);
        String maxElement = sortedInput.get(sortedInput.size() - 1);
        System.out.println(maxElement);
    }
}