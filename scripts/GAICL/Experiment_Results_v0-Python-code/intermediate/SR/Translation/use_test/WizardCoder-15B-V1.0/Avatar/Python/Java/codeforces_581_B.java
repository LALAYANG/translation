```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        int[] variable_1_7 = {0};
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<int[]> future = executor.submit(() -> {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = variable_1_7[0] * n;
            }
            return res;
        });
        try {
            int[] global_result = future.get();
            for (int i = 0; i < n; i++) {
                ans[i] = global_result[i];
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        sc.close();
        System.out.println(Arrays.toString(ans));
    }
}
```
