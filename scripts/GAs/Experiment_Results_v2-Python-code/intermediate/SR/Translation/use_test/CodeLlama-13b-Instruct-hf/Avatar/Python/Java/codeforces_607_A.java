
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] numArray = new int[1000010];
        int[] dp = new int[1000010];

        for (int i = 0; i < arraySize; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            numArray[a] = b;
        }

        if (numArray[0] > 0) {
            dp[0] = 1;
        }

        int mx = 0;
        int outerLoopEnd = 963;
        int outerLoopStep = 962;
        for (int i = 0; i < outerLoopEnd; i += outerLoopStep) {
            for (int j = 1; j < 1000010; j++) {
                if (numArray[j] == 0) {
                    dp[j] = dp[j - 1];
                } else if (numArray[j] >= j) {
                    dp[j] = 1;
                } else {
                    dp[j] = dp[j - numArray[j] - 1] + 1;
                }
                if (dp[j] > mx) {
                    mx = dp[j];
                }
            }
        }

        System.out.println(arraySize - mx);
    }
}
```
Note that this code assumes that the input is a list of integers, with each integer representing the value of the corresponding index in the array. The code also assumes that the array size is less than or equal to 1000010. If the input is a different format, you may need to modify the code accordingly.
