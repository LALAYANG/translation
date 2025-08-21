Here is the Java translation of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> actions = new ArrayList<>();

        moveLoop(0, m, 1, directions, f, actions);
        printLoop(0, inputString.length() - 1, 1, inputString, directions, f, actions);

        for (int i = 0; i < actions.size() - 1; i++) {
            System.out.println(actions.get(i));
        }
    }

    private static void moveLoop(int i, int stop, int step, String[] directions, boolean f, List<String> actions) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        actions.add(directions[f ? 0 : 1]);
        moveLoop(i + step, stop, step, directions, f, actions);
    }

    private static void printLoop(int i, int stop, int step, String inputString, String[] directions, boolean f, List<String> actions) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        for (int j = inputString.length() - 1; j >= 0; j--) {
            actions.add("PRINT " + inputString.charAt(j));
            actions.add(directions[f ? 1 : 0]);
        }
        printLoop(i + step, stop, step, inputString, directions, f, actions);
    }
}
```

Please note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. Therefore, I have removed that part from the Java code.

