```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CalculateScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            if (boughtCount.containsKey(c)) {
                boughtCount.put(c, boughtCount.get(c) + 1);
            } else {
                boughtCount.put(c, 1);
            }
        }

        line = sc.nextLine();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            if (madeCount.containsKey(c)) {
                madeCount.put(c, madeCount.get(c) + 1);
            } else {
                madeCount.put(c, 1);
            }
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
            res += Math.min(boughtCount.getOrDefault(color, 0), madeCount.get(color));
        }

        System.out.println(res);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
