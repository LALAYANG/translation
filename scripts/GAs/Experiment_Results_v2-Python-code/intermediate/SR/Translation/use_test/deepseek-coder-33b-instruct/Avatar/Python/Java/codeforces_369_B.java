Here is the Java version of your Python code. Note that Java does not have built-in support for threads and queues, so I used the ExecutorService and BlockingQueue classes from the java.util.concurrent package instead. Also, Java does not have a direct equivalent to Python's decorator syntax, so I used a simple method call instead.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int total_count = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        BlockingQueue<List<Integer>> queue = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                List<Integer> result = calculateValues(Main::getNumbers, k, total_count, sk, sa);
                queue.put(result);
                return null;
            }
        });
        future.get();
        executor.shutdown();

        List<Integer> result = queue.take();
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result.get(i));
        }
        System.out.println();
    }

    public static List<Integer> calculateValues(GetNumbers getNumbers, int k, int total_count, int sk, int sa) {
        List<Integer> list1 = getNumbers.getNumbers(k, sk);
        List<Integer> list2 = getNumbers.getNumbers(total_count - k, sa - sk);
        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static List<Integer> getNumbers(int num, int t) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(i < t % num ? t / num + 1 : t / num);
        }
        return result;
    }

    @FunctionalInterface
    public interface GetNumbers {
        List<Integer> getNumbers(int num, int t);
    }
}
```

This Java code reads the same input as the Python code, but it does not use the scipy.stats.ttest_ind function, because there is no equivalent in Java.

