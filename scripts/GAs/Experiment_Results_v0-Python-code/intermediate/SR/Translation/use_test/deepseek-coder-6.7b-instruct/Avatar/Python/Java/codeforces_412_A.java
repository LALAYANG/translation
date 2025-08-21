Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[n * n];
        int actionsCount = 0;

        for (int i = 0; i < m; i++) {
            actions[actionsCount++] = directions[f ? 1 : 0];
        }

        int innerLoopBound = 302;
        int outerLoopBound = 301;

        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
            for (int i = inputString.length() - 1 - 2 * (f ? 1 : 0); i >= 0; i -= 2) {
                actions[actionsCount++] = "PRINT " + inputString.charAt(i);
                actions[actionsCount++] = directions[f ? 0 : 1];
            }
        }

        for (int i = 0; i < actionsCount - 1; i++) {
            System.out.println(actions[i]);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers and a string from the input, then it performs some operations and prints the result. The operations are similar to the ones in your Python code. The main difference is that Java uses a different syntax and built-in functions for array manipulation and input/output.

