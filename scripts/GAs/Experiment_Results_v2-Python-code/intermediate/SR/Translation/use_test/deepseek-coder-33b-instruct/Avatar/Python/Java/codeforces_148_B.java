Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int princess = Integer.parseInt(args[0]);
        int dragon = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int f = Integer.parseInt(args[3]);
        int c = Integer.parseInt(args[4]);

        if (dragon <= princess) {
            System.out.println(0);
            System.exit(0);
        }

        int result = 0;
        BlockingQueue<Integer> queueFight0 = new LinkedBlockingQueue<>();

        Thread threadFight0 = new Thread(() -> {
            int resultFight = fight(t, princess);
            try {
                queueFight0.put(resultFight);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadFight0.start();
        threadFight0.join();
        int resultFight = queueFight0.poll();
        double currentPosition = resultFight;
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

Please note that the `shuffle` function from sklearn.utils is not available in Java. Instead, we use `ThreadLocalRandom.current().nextInt(min, max + 1)` to generate a random number between min and max.

Also, please note that the input is passed as command line arguments in the Java version.

The Java version of the code uses a `BlockingQueue` to pass the result of the fight between threads. The `Thread.join()` method is used to wait for the thread to finish before continuing. The `BlockingQueue.poll()` method is used to retrieve the result from the queue.

The `fight` method is a simple multiplication of two integers.

The rest of the code is a direct translation of the Python code to Java.

