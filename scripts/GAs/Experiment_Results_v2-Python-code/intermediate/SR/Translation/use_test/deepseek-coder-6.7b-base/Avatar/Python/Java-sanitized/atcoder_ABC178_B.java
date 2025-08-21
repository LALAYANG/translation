import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC178_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(() -> {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            queue.add(a);
            queue.add(b);
            queue.add(c);
            queue.add(d);
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