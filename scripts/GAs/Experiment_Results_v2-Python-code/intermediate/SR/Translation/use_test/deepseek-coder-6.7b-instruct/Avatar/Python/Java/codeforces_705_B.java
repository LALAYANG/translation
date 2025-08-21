Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int currentValue = 2;
        int thirdConditionValue = 114;
        int maxValue = 790;
        int firstConditionValue = 865;
        int secondConditionValue = 516;
        // Assuming scipy.stats.ttest_ind is not available in Java, so skipped
        int outerLoopLimit = 667;
        int innerLoopStep = 666;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopStep; loopIndexOut++) {
            for (int i : w) {
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if ((thirdConditionValue & maxValue) != 0) {
                        if (i == 1) {
                            System.out.println(currentValue);
                        } else if (i % 2 == 0) {
                            currentValue = 3 - currentValue;
                            System.out.println(currentValue);
                        } else {
                            System.out.println(currentValue);
                        }
                    }
                }
            }
        }
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function for a t-test, which is not available in Java. In Java, you would typically use a library like Apache Commons Math or JScience for statistical functions. However, since the function is not used in the provided code, it was skipped in the Java version.

Also, the Python code uses the `sklearn.utils.shuffle` function to shuffle a list, which is not available in Java. In Java, you would typically use the `Collections.shuffle` method to shuffle a list. However, since the function is not used in the provided code, it was skipped in the Java version.

