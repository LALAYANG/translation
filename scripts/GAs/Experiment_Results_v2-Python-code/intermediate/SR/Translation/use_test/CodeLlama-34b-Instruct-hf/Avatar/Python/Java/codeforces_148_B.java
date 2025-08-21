```java
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;

public class Fight {
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
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        executor.execute(new FightThread(t, princess));
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
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

    private static class FightThread implements Runnable {
        private int t;
        private int princess;

        public FightThread(int t, int princess) {
            this.t = t;
            this.princess = princess;
        }

        @Override
        public void run() {
            int result = fight(t, princess);
            System.out.println(result);
        }

        private int fight(int t, int princess) {
            return t * princess;
        }
    }
}
```
Note: The above code uses Java 8's `Thread` and `ThreadPoolExecutor` classes to create a thread pool and execute the `FightThread` class. The `FightThread` class implements the `Runnable` interface and overrides the `run()` method to call the `fight()` method and print the result. The `fight()` method is a simple multiplication of the `t` and `princess` variables.
