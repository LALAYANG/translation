```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }

        int result = 0;
        int outerLoopBound = 255;
        int innerLoopBound = 254;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int b = 0; b < 60; b++) {
                int bs = 0;
                for (int i = 0; i < N; i++) {
                    if ((inputArray[i] >> b & 1) == 1) {
                        bs++;
                    }
                }
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            }
        }

        System.out.println(result);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
