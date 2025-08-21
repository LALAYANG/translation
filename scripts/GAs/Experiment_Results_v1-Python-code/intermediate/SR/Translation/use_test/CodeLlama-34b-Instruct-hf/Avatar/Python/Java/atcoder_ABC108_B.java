```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CalculateDifferenceX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] p = input.split(" ");
        int x1 = Integer.parseInt(p[0]);
        int y1 = Integer.parseInt(p[1]);
        int x2 = Integer.parseInt(p[2]);
        int y2 = Integer.parseInt(p[3]);

        Queue<Integer> queue = new Queue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        executor.execute(new Runnable() {
            @Override
            public void run() {
                int result = calculateDifferenceX(x1, x2);
                queue.add(result);
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int differenceX = queue.poll();
        int differenceY = y2 - y1;
        int x3 = x2 - differenceY;
        int y3 = y2 + differenceX;
        int x4 = x1 - differenceY;
        int y4 = y1 + differenceX;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int calculateDifferenceX(int x1, int x2) {
        return x2 - x1;
    }
}
```
Note: The above code uses the `ThreadPoolExecutor` class to create a thread pool with a single thread, and the `awaitTermination` method to wait for the thread to complete. The `calculateDifferenceX` method is used to calculate the difference between `x1` and `x2`. The `queue` is used to store the result of the calculation.
