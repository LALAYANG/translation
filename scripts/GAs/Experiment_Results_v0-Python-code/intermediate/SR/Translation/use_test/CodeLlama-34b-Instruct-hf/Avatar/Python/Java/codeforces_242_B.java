```java
import java.util.Scanner;

public class IntersectionFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int intersectionId = 0;
        int outerLoopStart = 919;
        int outerLoopEnd = 918;
        for (int loopIndexOut = outerLoopStart / outerLoopEnd; loopIndexOut < outerLoopEnd; loopIndexOut++) {
            recursiveCheck(1, n, 1);
        }
        System.out.println(-1 if intersectionId == n else intersectionId + 1);
    }

    private static void recursiveCheck(int i, int stop, int step) {
        int l = Math.min(l, i);
        int r = Math.max(r, i);
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = scanner.nextInt();
        int ri = scanner.nextInt();
        if (li <= l && r <= ri) {
            intersectionId = i;
        } else if (li < l || r < ri) {
            intersectionId = n;
        }
        recursiveCheck(i + step, stop, step);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
