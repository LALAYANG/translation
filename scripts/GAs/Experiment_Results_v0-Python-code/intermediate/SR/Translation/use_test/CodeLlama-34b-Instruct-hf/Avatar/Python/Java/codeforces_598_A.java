```java
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        for (int i = 0; i < iterations; i++) {
            int n = Integer.parseInt(args[i + 1]);
            int result = solve(n);
            System.out.println(result);
        }
    }

    public static int solve(int n) {
        int variable_7_13 = 1;
        int variable_3_13 = 2;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += (variable_7_13 + i) * i / variable_3_13;
        }
        return result;
    }
}
```
Note: The Python code you provided is using the `scipy.stats` library, which is not available in Java. Therefore, I have removed the `ttest_ind` function call from the Java code.
