
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        scanner.nextLine();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            stringList.add(scanner.nextLine());
        }
        Map<String, Integer> charCounts = new HashMap<>();
        for (String s : stringList) {
            charCounts.put(s, charCounts.getOrDefault(s, 0) + 1);
        }
        boolean result = true;
        for (int i = 0; i < stringList.size() - 1; i++) {
            if (charCounts.get(stringList.get(i)) >= 2) {
                result = false;
                break;
            }
            if (stringList.get(i).charAt(0) != stringList.get(i + 1).charAt(0)) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "Yes" : "No");
    }
}
```
Note that this code assumes that the input is a list of strings, each on a new line, and that the first line of the input is the number of strings in the list. The code reads the input from the standard input and prints the result to the standard output.
