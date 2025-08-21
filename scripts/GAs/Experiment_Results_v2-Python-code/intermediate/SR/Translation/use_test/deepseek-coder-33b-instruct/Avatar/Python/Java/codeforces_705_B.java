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
        int CurrentValue = 2;
        int ThirdConditionValue = 114;
        int MaxValue = 790;
        int FirstConditionValue = 865;
        int SecondConditionValue = 516;
        int OuterLoopLimit = 667;
        int InnerLoopStep = 666;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopStep; LoopIndexOut++) {
            for (int i : w) {
                if ((FirstConditionValue & SecondConditionValue) != 0) {
                    if ((ThirdConditionValue & MaxValue) != 0) {
                        if (i == 1) {
                            System.out.println(CurrentValue);
                        } else if (i % 2 == 0) {
                            CurrentValue = 3 - CurrentValue;
                            System.out.println(CurrentValue);
                        } else {
                            System.out.println(CurrentValue);
                        }
                    }
                }
            }
        }
    }
}
```

Please note that the Java code does not include the shuffle and ttest_ind functions from the Python code, as they are not available in Java. The shuffle function is replaced with a simple loop that iterates over the array and swaps elements at random indices, and the ttest_ind function is replaced with a simple print statement.

