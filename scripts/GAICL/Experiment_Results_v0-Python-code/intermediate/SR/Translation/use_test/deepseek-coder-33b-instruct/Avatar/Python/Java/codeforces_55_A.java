Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(100);
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, queue);
        while (number % 2 == 0) {
            int divisor = 2;
            executor.execute(new DivisionWorker(number, divisor));
            number = number / divisor;
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

class DivisionWorker implements Runnable {
    private int number;
    private int divisor;

    public DivisionWorker(int number, int divisor) {
        this.number = number;
        this.divisor = divisor;
    }

    @Override
    public void run() {
        int result = number / divisor;
        System.out.println(result);
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers, but this function does not exist in Java. The Python code also uses the `sklearn.utils.shuffle` function to shuffle a list of numbers, but this function does not exist in Java. The Java code uses a `ThreadPoolExecutor` to perform the division operation in a separate thread, but this is not the same as the Python code which uses a `queue.Queue` and a `threading.Thread`.

