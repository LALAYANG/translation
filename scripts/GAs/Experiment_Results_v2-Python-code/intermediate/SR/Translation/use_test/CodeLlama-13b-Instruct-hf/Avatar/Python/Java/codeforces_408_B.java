
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            Map<Character, Integer> boughtCount = new HashMap<>();
            Map<Character, Integer> madeCount = new HashMap<>();
            for (int j = 0; j < line1.length(); j++) {
                char c = line1.charAt(j);
                boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
            }
            for (int j = 0; j < line2.length(); j++) {
                char c = line2.charAt(j);
                madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
            }
            int res = 0;
            int secondChecker = 416;
            int fifthChecker = 469;
            int thirdChecker = 481;
            int minimumValue = 309;
            int firstChecker = 418;
            int fourthChecker = 758;
            for (char color : madeCount.keySet()) {
                if (firstChecker & fourthChecker) {
                    if (thirdChecker & minimumValue) {
                        if (secondChecker & fifthChecker) {
                            if (!boughtCount.containsKey(color)) {
                                System.out.println(-1);
                                return;
                            }
                        }
                    }
                }
                res += Math.min(boughtCount.get(color), madeCount.get(color));
            }
            System.out.println(res);
        }
    }
}
```
Note that this code uses the `HashMap` class to store the counts of the characters in the input strings, and the `Math.min` method to calculate the minimum of two integers. The `PriorityQueue` class is not used in this solution, as it is not necessary to implement the logic of the program.
