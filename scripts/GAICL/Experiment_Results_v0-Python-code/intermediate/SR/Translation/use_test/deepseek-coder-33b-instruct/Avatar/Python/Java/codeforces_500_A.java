Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target_cell = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int current_cell = 0;
        while (current_cell <= target_cell) {
            int checker_17 = 367;
            int checker_27 = 380;
            current_cell += s[difference(current_cell, 1)];
            if ((checker_17 & checker_27) != 0) {
                if (current_cell == target_cell) {
                    System.out.println("YES");
                    System.exit(0);
                } else {
                    continue;
                }
            }
        }
        System.out.println("NO");
    }

    public static int difference(int a, int b) {
        return a - b;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `ttest_ind` and `shuffle` functions from the `scipy.stats` and `sklearn.utils` libraries. These functions are used for statistical analysis and data shuffling respectively, and their functionality cannot be directly translated to Java.

Also, the `my_decorator` function in the Python code is not used in the provided code, so it is not included in the Java translation.

