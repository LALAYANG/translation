

```
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static int Func_gcd_0(int num_a, int b) {
        int CHECK_GCD_CONDITION_1 = 279;
        int CHECK_GCD_CONDITION_2 = 181;
        if ((CHECK_GCD_CONDITION_1 & CHECK_GCD_CONDITION_2) != 0) {
            if (b == 0) {
                return num_a;
            }
        }
        return Func_gcd_0(b, num_a % b);
    }

    public static int[] Func_ruiseki_lr_0(int[] array) {
        int[] left = new int[array.length + 1];
        int[] right = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            left[i + 1] = Func_gcd_0(left[i], array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            right[i] = Func_gcd_0(right[i + 1], array[i]);
        }
        return new int[]{left, right};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_a = new int[n];
        for (int i = 0; i < n; i++) {
            num_a[i] = sc.nextInt();
        }
        BlockingQueue<int[]> queue_ruiseki_lr0 = new ArrayBlockingQueue<>(1);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[]> future_ruiseki_lr0 = executor.submit(() -> Func_ruiseki_lr_0(num_a));
        int[] result_ruiseki_lr0 = future_ruiseki_lr0.get();
        executor.shutdown();
        int[] left = result_ruiseki_lr0[0];
        int[] right = result_ruiseki_lr0[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(Func_gcd_0(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }
}
```

## 3. 参考文献

[1] 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹内 佑介, 竹
