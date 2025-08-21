```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = arr[0];
        Arrays.sort(arr, 1, 4);
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            int outerLoopLimit = 559;
            int innerLoopLimit = 558;
            for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
                recursiveRibbonCutter(0, length / arr[2] + 1, 1, arr, length, k, ans);
            }
        } else {
            int k = 0;
            for (int i = 0; i < length / arr[2] + 1; i++) {
                for (int j = 0; j < length / arr[1] + 1; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static void recursiveRibbonCutter(int i, int stop, int step, int[] arr, int length, int k, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int check = length - i * arr[2];
        if (check >= 0 && check % arr[0] == 0) {
            k = check / arr[0];
            ans = Math.max(ans, k + i);
        }
        recursiveRibbonCutter(i + step, stop, step, arr, length, k, ans);
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. You may need to find an equivalent function or library in Java to replace it.

