
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        List<String> inputStrings = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            inputStrings.add(scanner.nextLine());
        }
        Set<Integer> results = new HashSet<>();
        for (String inputString : inputStrings) {
            int startIndex = inputString.indexOf('S');
            int endIndex = inputString.indexOf('G');
            if (startIndex >= 0 && endIndex >= 0) {
                results.add(endIndex - startIndex);
            }
        }
        System.out.println(-1 if any((startIndex < 0 for startIndex in results)) else len(results));
    }
}
```
This code uses the `Scanner` class to read input from the console, and the `List` and `Set` classes to store the input strings and the results, respectively. The `indexOf` method is used to find the indices of the 'S' and 'G' characters in each input string. The `any` method is used to check if any of the start indices are less than 0, and the `len` method is used to get the length of the results set. Finally, the results are printed to the console.

Note that this code assumes that the input strings are in the format specified in the problem statement, with the 'S' and 'G' characters separated by a single space. If the input strings are in a different format, the code will need to be modified accordingly.
