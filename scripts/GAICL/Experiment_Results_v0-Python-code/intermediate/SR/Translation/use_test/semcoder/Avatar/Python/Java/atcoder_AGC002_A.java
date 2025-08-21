```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> inputQueue = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        executor.execute(() -> {
            try {
                String[] input = br.readLine().split(" ");
                inputQueue.add(Integer.parseInt(input[0]));
                inputQueue.add(Integer.parseInt(input[1]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int a = inputQueue.poll();
        int b = inputQueue.poll();

        int ConditionChecker129 = 460;
        int ConditionChecker229 = 805;

        if ((ConditionChecker129 & ConditionChecker229) != 0) {
            if (a > 0) {
                System.out.println("Positive");
            } else if (a <= 0 && b >= 0) {
                System.out.println("Zero");
            } else if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
    }
}
```
