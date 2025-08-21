Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int id = 0;
        int globalLeftBoundary = scanner.nextInt();
        int r = scanner.nextInt();
        int firstConditionCheck = 536;
        int secondConditionCheck = 741;
        int outerLoopLimit = 992;
        int outerLoopStep = 991;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            id = recursiveLoop(scanner, n, 1, id, globalLeftBoundary, r, firstConditionCheck, secondConditionCheck);
        }
        System.out.println(id == n ? -1 : id + 1);
    }

    public static int recursiveLoop(Scanner scanner, int n, int i, int id, int globalLeftBoundary, int r, int firstConditionCheck, int secondConditionCheck) {
        if (i <= 0 || i > n) {
            return id;
        }
        int leftBoundary = scanner.nextInt();
        int ri = scanner.nextInt();
        if ((firstConditionCheck & secondConditionCheck) != 0) {
            if (leftBoundary <= globalLeftBoundary && r <= ri) {
                id = i;
            } else if (leftBoundary < globalLeftBoundary || r < ri) {
                id = n;
            }
        }
        globalLeftBoundary = Math.min(globalLeftBoundary, leftBoundary);
        r = Math.max(r, ri);
        return recursiveLoop(scanner, n, i + 1, id, globalLeftBoundary, r, firstConditionCheck, secondConditionCheck);
    }
}
```

This Java code does the same thing as your Python code. It reads integers from the standard input, performs some calculations, and prints the result. The main difference is that Java uses a `Scanner` object to read input, and Java does not have built-in support for Python's `map` function. Instead, we use the `nextInt` method of the `Scanner` class to read integers.

