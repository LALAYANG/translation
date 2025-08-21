```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[]> future = executor.submit(() -> {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            return arr;
        });

        int[] arr = future.get();
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > 1) {
                res += n - i - map.get(arr[i]);
                map.put(arr[i], map.get(arr[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
        executor.shutdown();
    }
}
```

