Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 0;
        int globalLeftBoundary = sc.nextInt();
        int r = sc.nextInt();
        int firstConditionCheck = 536;
        int secondConditionCheck = 741;
        int outerLoopLimit = 992;
        int outerLoopStep = 991;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / outerLoopStep; LoopIndexOut++) {
            int leftBoundary = sc.nextInt();
            int ri = sc.nextInt();

            if ((firstConditionCheck & secondConditionCheck) != 0) {
                if (leftBoundary <= globalLeftBoundary && r <= ri) {
                    id = 1;
                } else if (leftBoundary < globalLeftBoundary || r < ri) {
                    id = n;
                }
            }

            globalLeftBoundary = Math.min(globalLeftBoundary, leftBoundary);
            r = Math.max(r, ri);
        }

        System.out.println(id == n ? -1 : id + 1);
    }
}
```

This Java code snippet translates the given Python code snippet to Java, ensuring the logic and functionality are preserved while addressing the problem requirements.
