
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine().replaceAll("\\s+", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    indices.add(i);
                }
            }
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                for (int i = 0; i < indices.size() - 1; i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        int diff = Math.abs(indices.get(i) - indices.get(j));
                        maximum = Math.max(maximum, 2 + 2 * (diff - 1) - (indices.get(j) - indices.get(i) - 1));
                    }
                }
                System.out.println(s.chars().filter(c -> c == '1').count() + maximum);
            }
        }
    }
}
```
Note that the `replaceAll` method is used to remove any whitespace characters from the input string, and the `chars` method is used to get a stream of characters from the string. The `filter` method is used to filter out any characters that are not '1', and the `count` method is used to count the number of characters in the stream.
