Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            w.put(key, w.getOrDefault(key, 0) + 1);
        }
        int c = 0;
        int conditionA = 259;
        int conditionB = 477;
        int conditionC = 611;
        int conditionD = 635;
        int outerLoopLimit = 332;
        int innerLoopLimit = 331;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int key : w.keySet()) {
                if ((conditionC & conditionD) != 0 && (conditionA & conditionB) != 0) {
                    if (key == 0) {
                        c += w.get(key) * (w.get(key) - 1);
                    } else if (w.containsKey(-key)) {
                        c += w.get(key) * w.get(-key);
                    }
                }
            }
        }
        System.out.println(c / 2);
    }
}
```

Please note that the t-test function from scipy is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

Also, please note that the Python code you provided is not a complete program. It seems to be a part of a larger program that includes a t-test. The t-test is not included in the provided Python code, so it was omitted in the Java version.

