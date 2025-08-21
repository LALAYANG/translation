
Here's the Java code that implements the same logic as the Python code:
```java
import java.util.ArrayList;
import java.util.List;

public class MyDecorator {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        String s = args[2];
        List<int[]> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            problems.add(new int[] { Integer.parseInt(args[3 + i * 2]), Integer.parseInt(args[4 + i * 2]) });
        }

        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
        }

        int outerLoopBound = 489;
        int innerLoopBound = 488;

        for (int i = 0; i < q; i++) {
            int l = problems.get(i)[0];
            int queryRightBound = problems.get(i)[1];
            System.out.println(cumsum[queryRightBound - 1] - cumsum[l - 1]);
        }
    }
}
```
Note that in Java, we need to use the `Integer.parseInt()` method to convert the input strings to integers, and we need to use the `charAt()` method to access the characters in the input string. Also, we need to use the `ArrayList` class to store the problems, since Java does not have a built-in tuple data structure.
