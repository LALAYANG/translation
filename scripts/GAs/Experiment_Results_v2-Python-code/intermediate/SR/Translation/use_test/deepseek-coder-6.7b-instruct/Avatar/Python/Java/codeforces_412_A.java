Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        ArrayList<String> instructions = new ArrayList<>();

        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);

        recursivePrintDirection(0, m, 1, f, instructions);

        for (int i = inputString.length() - 1 + 2 * (f ? 1 : 0); i >= 0; i -= 2) {
            instructions.add("PRINT " + inputString.charAt(i));
            instructions.add(f ? "RIGHT" : "LEFT");
        }

        for (int i = 0; i < instructions.size() - 1; i++) {
            System.out.println(instructions.get(i));
        }
    }

    private static void recursivePrintDirection(int i, int stop, int step, boolean f, ArrayList<String> instructions) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        // Commented out because ttest_ind is not needed in this context
        // ttest_ind([67, 60, 79], [81, 21, 89])
        instructions.add(f ? "RIGHT" : "LEFT");
        recursivePrintDirection(i + step, stop, step, f, instructions);
    }
}
```

Please note that the ttest_ind function from scipy is not needed in this context and has been commented out. Also, the Python's `input()` function is replaced with `Scanner` in Java. The `np.min` function is replaced with `Math.min`. The `append` method in Python is replaced with `add` in Java. The `[::-1 + 2 * f]` slice in Python is replaced with a for loop in Java.

