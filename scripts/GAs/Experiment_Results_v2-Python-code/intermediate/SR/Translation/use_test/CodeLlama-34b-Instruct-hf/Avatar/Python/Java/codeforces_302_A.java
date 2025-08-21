```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = scanner.nextInt();
        int ss = 0;
        int outerLoopCount = 694;
        int outerLoopLimit = 693;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopCount / outerLoopLimit; loopIndexOut++) {
            int currentIndex = 0;
            int step = 1;
            while (currentIndex < numIterations) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                b = b - a;
                if (b % 2 == 0 && b <= sa * 2) {
                    ss++;
                }
                currentIndex += step;
            }
        }
        System.out.println(ss);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
