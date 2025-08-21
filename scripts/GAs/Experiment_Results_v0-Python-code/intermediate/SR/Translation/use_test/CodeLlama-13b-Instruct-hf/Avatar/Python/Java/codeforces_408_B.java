
Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (boughtCount.containsKey(c)) {
                boughtCount.put(c, boughtCount.get(c) + 1);
            } else {
                boughtCount.put(c, 1);
            }
        }

        line = scanner.nextLine();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (madeCount.containsKey(c)) {
                madeCount.put(c, madeCount.get(c) + 1);
            } else {
                madeCount.put(c, 1);
            }
        }

        int res = 0;
        for (char c : madeCount.keySet()) {
            if (boughtCount.containsKey(c)) {
                res += Math.min(boughtCount.get(c), madeCount.get(c));
            } else {
                return -1;
            }
        }

        System.out.println(res);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `HashMap` class to store the counts of the characters in the input strings. The `Math.min` method is used to find the minimum of the two counts for each character. Finally, the result is printed to the console.

Note that this code assumes that the input strings are non-empty and contain only lowercase letters. If the input strings can be empty or contain other characters, additional checks and error handling may be needed.
