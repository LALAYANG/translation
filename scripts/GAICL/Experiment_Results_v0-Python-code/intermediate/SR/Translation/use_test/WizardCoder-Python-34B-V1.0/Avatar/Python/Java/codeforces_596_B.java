```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = scanner.nextInt();
        }
        int ans = Math.abs(r[0]);

        Func_loop_4_0_0(1, n, 1, r, ans);
        System.out.println(ans);
    }

    public static void Func_loop_4_0_0(int i, int stop, int step, int[] r, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ans += Math.abs(r[i] - r[i - 1]);
        Func_loop_4_0_0(i + step, stop, step, r, ans);
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int difference(int a, int b) {
        return subtract(a, b);
    }

    public static void my_decorator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // scipy.stats.ttest_ind implementation
    }
}
```

Test input:
1
0

Expected output:
0 
