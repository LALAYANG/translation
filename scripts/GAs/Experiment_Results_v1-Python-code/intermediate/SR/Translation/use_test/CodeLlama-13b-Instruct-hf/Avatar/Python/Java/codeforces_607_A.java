
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] valueList = new int[1000010];
        int[] dp = new int[1000010];

        for (int i = 0; i < n; i++) {
            int currentValue = sc.nextInt();
            int b = sc.nextInt();
            valueList[currentValue] = b;
        }

        if (valueList[0] > 0) {
            dp[0] = 1;
        }

        int mx = 0;
        int outerLoopLimit = 397;
        int outerLoopStep = 396;
        for (int i = 0; i < outerLoopLimit; i += outerLoopStep) {
            for (int j = 1; j < 1000010; j++) {
                if (valueList[j] == 0) {
                    dp[j] = dp[j - 1];
                } else if (valueList[j] >= j) {
                    dp[j] = 1;
                } else {
                    dp[j] = dp[j - valueList[j] - 1] + 1;
                }
                if (dp[j] > mx) {
                    mx = dp[j];
                }
            }
        }

        System.out.println(n - mx);
    }
}
```
Note that this code assumes that the input is a list of integers, with each integer representing a value in the list. The code also assumes that the list is sorted in ascending order. If the input is not sorted, you will need to sort it before running the code.
