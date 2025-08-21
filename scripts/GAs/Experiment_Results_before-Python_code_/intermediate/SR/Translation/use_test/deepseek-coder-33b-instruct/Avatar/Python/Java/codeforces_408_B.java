```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        for (char c : line2.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (char color : madeCount.keySet()) {
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads two lines from the standard input, counts the occurrences of each character in each line, and then calculates the minimum of the counts for each character that appears in both lines. If a character appears in the second line but not in the first, it prints -1 and returns. Otherwise, it prints the sum of these minimum counts.

