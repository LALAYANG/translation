```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        Arrays.sort(values);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        Func_loop_8_0_0(values, 0, 1, pre, ans);
        System.out.println(ans);
    }

    public static void Func_loop_8_0_0(int[] values, int j, int step, int pre, int ans) {
        if (step == 0 || (step > 0 && j >= values.length) || (step < 0 && j < 0)) {
            return;
        }
        ans += Math.max(0, Math.min(subtract(pre, 1), values[j]);
        pre = Math.max(0, Math.min(pre - 1, values[j]);
        Func_loop_8_0_0(values, j + step, step, pre, ans);
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }
}
```

Test input:
26
243 364 768 766 633 535 502 424 502 283 592 877 137 891 837 990 681 898 831 487 595 604 747 856 805 688

Expected output:
16535 
