```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            w.put(key, value);
        }

        int count = 0;
        int outerCheck = 572;
        int innerCheck = 86;
        int conditionCheckTwo = 505;
        int conditionCheckOne = 683;
        int outerLoopBound = 395;
        int innerLoopBound = 394;

        for (int i = 0; i < outerLoopBound; i += innerLoopBound) {
            for (Map.Entry<Integer, Integer> entry : w.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (conditionCheckTwo & conditionCheckOne) {
                    if (outerCheck & innerCheck) {
                        if (key == 0) {
                            count += value * (value - 1);
                        } else if (-key in w) {
                            count += value * w.get(-key);
                        }
                    }
                }
            }
        }

        System.out.println(count / 2);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
