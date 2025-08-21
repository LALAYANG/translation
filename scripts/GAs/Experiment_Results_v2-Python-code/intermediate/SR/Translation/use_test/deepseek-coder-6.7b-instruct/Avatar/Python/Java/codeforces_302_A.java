Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numIterations = scanner.nextInt();
        int sa = scanner.nextInt();
        int count = sa;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == -1) {
                count--;
            }
        }
        sa = Math.min(sa, count);
        List<String> ss = new ArrayList<>();
        for (int outerLoopIndex = 0; outerLoopIndex < numIterations; outerLoopIndex++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b = b - a;
            if ((b % 2 == 1) && (b <= sa * 2)) {
                ss.add("1\n");
            } else {
                ss.add("0\n");
            }
        }
        for (String s : ss) {
            System.out.print(s);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads the input, counts the number of `-1`s, and then checks the conditions in the loop. The results are stored in a list and printed at the end.

