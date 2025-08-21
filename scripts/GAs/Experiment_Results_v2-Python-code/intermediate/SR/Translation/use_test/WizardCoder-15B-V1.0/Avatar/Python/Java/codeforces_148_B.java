```java
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int princess = Integer.parseInt(args[0]);
        int dragon = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int f = Integer.parseInt(args[3]);
        int c = Integer.parseInt(args[4]);
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        int result = 0;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Future<Integer> future = executor.submit(() -> fight(t, princess));
        try {
            result = future.get(1, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int currentPosition = result;
        currentPosition += princess * currentPosition / (dragon - princess);
        while (currentPosition < c) {
            result++;
            currentPosition += princess * currentPosition / dragon;
            currentPosition += princess * f;
            currentPosition += princess * currentPosition / (dragon - princess);
        }
        System.out.println(result);
    }

    private static int fight(int t, int princess) {
        return t * princess;
    }
}
```
