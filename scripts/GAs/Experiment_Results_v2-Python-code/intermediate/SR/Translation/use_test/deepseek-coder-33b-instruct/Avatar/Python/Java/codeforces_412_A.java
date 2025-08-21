```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> instructions = new ArrayList<>();

        recursivePrintDirection(0, m, 1, d, f, instructions);
        for (int i = inputString.length() - 1; i >= 0; i--) {
            instructions.add("PRINT " + inputString.charAt(i));
            instructions.add(d[f ? 0 : 1]);
        }

        for (int i = 0; i < instructions.size() - 1; i++) {
            System.out.println(instructions.get(i));
        }
    }

    private static void recursivePrintDirection(int i, int stop, int step, String[] d, boolean f, List<String> instructions) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        instructions.add(d[f ? 1 : 0]);
        recursivePrintDirection(i + step, stop, step, d, f, instructions);
    }
}
```

Please note that the Java code does not include the t-test function as it is not available in Java's standard library. If you need to use a t-test function, you may need to use a third-party library such as Apache Commons Math or a scientific computing library like JScience.

