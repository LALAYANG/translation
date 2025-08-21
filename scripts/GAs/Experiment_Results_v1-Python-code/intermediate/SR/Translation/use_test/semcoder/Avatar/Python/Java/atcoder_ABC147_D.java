Thought process:
1. Understand the purpose of the code snippet.
2. Translate the code snippet into Java.
3. Implement the solution in Java.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int result = 0;
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

This solution translates the provided Python code snippet into Java and calculates the result based on the input array.
