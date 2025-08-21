Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        long result = 0;
        int outerLoopBound = 255;
        int innerLoopBound = 254;
        for (int outerLoopIndex = 0; outerLoopIndex <= outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int b = 0; b <= innerLoopBound; b++) {
                int bs = 0;
                for (int i = 0; i < N; i++) {
                    bs += (inputArray[i] >> b & 1);
                }
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            }
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `N` and `N` integers from the input, then it calculates the sum of the bitwise XOR of all pairs of integers in the input array, and prints the result modulo 1000000007.

