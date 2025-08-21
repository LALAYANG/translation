
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DragonFight {
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

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = fight(t, princess);
            queue.put(result);
        });

        thread.start();
        thread.join();

        int resultFight = queue.take();
        int currentPosition = resultFight;
        currentPosition += princess * currentPosition / (dragon - princess);

        while (currentPosition < c) {
            result += 1;
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
Note that the Java code uses the `java.util.concurrent` package to create a thread and a blocking queue, and the `LinkedBlockingQueue` class to create a blocking queue. The `Thread` class is used to create a new thread, and the `start()` method is used to start the thread. The `join()` method is used to wait for the thread to finish. The `take()` method is used to retrieve the result from the blocking queue.

Also, note that the Java code uses the `Integer.parseInt()` method to parse the input arguments as integers.
