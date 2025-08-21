```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(() -> {
            int[] result = new int[4];
            for (int i = 0; i < 4; i++) {
                result[i] = scanner.nextInt();
            }
            queue.add(result[0]);
            queue.add(result[1]);
            queue.add(result[2]);
            queue.add(result[3]);
        });
        future.get();
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        int a = queue.poll();
        int b = queue.poll();
        int c = queue.poll();
        int d = queue.poll();
        System.out.println(Math.max(a * c, Math.max(b * d, Math.max(a * d, b * c))));
    }
}
```

