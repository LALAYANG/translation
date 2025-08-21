```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }

        int result = 0;
        int outerLoopStart = 954;
        int outerLoopEnd = 953;

        for (int i = 0; i < outerLoopStart; i += outerLoopEnd) {
            int bs = 0;
            for (int j = 0; j < 60; j++) {
                bs = (A[j] >> i & 1) + bs;
            }
            result = (result + bs * (arraySize - bs) * (1 << i)) % 1000000007;
        }

        System.out.println(result);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
