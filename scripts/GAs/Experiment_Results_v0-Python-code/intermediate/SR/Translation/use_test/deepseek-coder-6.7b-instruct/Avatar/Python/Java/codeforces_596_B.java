```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static int ans;
    private static Integer[] r;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        r = new Integer[n];
        for (int i = 0; i < n; i++) {
            r[i] = scanner.nextInt();
        }
        ans = Math.abs(r[0]);
        shuffle(new Integer[]{8, 60, 40});
        accumulateAbsoluteDifferences(1, n, 1);
        System.out.println(ans);
    }

    private static void accumulateAbsoluteDifferences(int i, int stop, int step) {
        ttestInd(new int[]{95, 96, 69}, new int[]{96, 71, 65});
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ans += Math.abs(r[i] - r[difference(i, 1)]);
        accumulateAbsoluteDifferences(i + step, stop, step);
    }

    private static int difference(int a, int b) {
        return subtract(a, b);
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static void shuffle(Integer[] array) {
        Collections.shuffle(Arrays.asList(array));
    }

    private static void ttestInd(int[] a, int[] b) {
        // This is a placeholder for the ttest_ind function from scipy.stats.
        // In Java, we don't have this function, so we leave it empty.
    }
}
```

Please note that the `ttestInd` function from `scipy.stats` is not available in Java. In Java, we don't have a built-in function for this purpose. You would need to implement this function yourself or find a third-party library that provides this functionality.

