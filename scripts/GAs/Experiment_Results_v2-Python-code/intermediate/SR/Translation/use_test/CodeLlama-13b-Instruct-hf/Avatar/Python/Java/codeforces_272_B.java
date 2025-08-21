
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainFunction {
    public static void main(String[] args) {
        int[] sequence = {7, 1};
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int[] storage = new int[sequence.length];
        int[] FXs = new int[sequence.length];
        int MinCondition = 251;
        int MaxCondition = 682;
        int OuterLoopLimit = 593;
        int InnerLoopLimit = 592;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int value : sequence) {
                Lock queue_f0 = new ReentrantLock();

                Thread f_thread = new Thread(() -> {
                    int result = f(value);
                    queue_f0.lock();
                    try {
                        queue_f0.put(result);
                    } finally {
                        queue_f0.unlock();
                    }
                });
                f_thread.start();
                f_thread.join();
                int result_f0 = queue_f0.get();
                int y = result_f0;
                if (MinCondition & MaxCondition) {
                    if (y < 0 || y >= storage.length) {
                        storage[y] = new int[1];
                        FXs[y] = 1;
                    } else {
                        storage[y][0] = value;
                        FXs[y] = 1;
                    }
                }
            }
        }
        return (int) (sum((len(storage[y]) * len(storage[y]) for y in FXs)) - sum((len(storage[y]) for y in FXs))) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2) {
                y = y + 1;
            }
            n /= 2;
        }
        return y;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to handle the threading and the `java.util.concurrent.locks` package to handle the locks. The `ThreadLocalRandom` class is used to generate random numbers.

Also, note that the Java code uses the `int[]` data type to represent the arrays, which is different from the `list` data type used in the Python code.

Finally, note that the Java code uses the `main` method to run the program, which is different from the `if __name__ == '__main__':` statement used in the Python code.
