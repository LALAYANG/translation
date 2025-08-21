```java
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        List<String> inputStrings = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            inputStrings.add(scanner.next());
        }

        Set<Integer> results = inputStrings.stream()
                .map(s -> calculateDifference(s.indexOf('S'), s.indexOf('G')))
                .collect(Collectors.toSet());

        if (results.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(results.size());
        }
    }

    private static int calculateDifference(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex < 0) {
            return -1;
        }
        return endIndex - startIndex;
    }
}
```

The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Stream` API to process the input strings. The `calculateDifference` method is a direct translation of the Python function with the same name.

Note that the `calculateDifference` method returns -1 if either of the input indices is negative, which is consistent with the behavior of the Python function.

Also, the `main` method uses a `Set` to store the results of the `calculateDifference` method, which is more efficient than using a `List` in this case.
