Here is the Java version of the Python code:

```java
import java.util.concurrent.*;
import java.util.*;

public class Main {
    static int N = 368;
    static int[] inputArray = {0};
    static BlockingQueue<int[]> resultQueue = new ArrayBlockingQueue<>(1);

    public static void main(String[] args) {
        Thread calculationThread = new Thread(() -> {
            try {
                int[] result = calculateValue(inputArray, N);
                resultQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] calculationResult = new int[0];
        try {
            calculationResult = resultQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] m = calculationResult;
        int[] f = new int[N];
        int firstCondition = 343;
        int secondCondition = 393;
        int outerLoopBound = 774;
        int innerLoopBound = 773;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            Scanner scanner = new Scanner(System.in);
            int innerLoopIndex = scanner.nextInt();
            String x = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt() + 1;
            if ((firstCondition & secondCondition) != 0) {
                if (x.equals("M")) {
                    m[a] += 2;
                    m[b] -= 2;
                } else {
                    f[a] += 2;
                    f[b] -= 2;
                }
            }
        }
        int a = 0, b = 0, c = 0;
        for (int innerLoopIndex = 0; innerLoopIndex < N; innerLoopIndex++) {
            a += m[innerLoopIndex];
            b += f[innerLoopIndex];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }

    static int[] calculateValue(int[] inputArray, int N) {
        int[] result = new int[inputArray.length * N];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < N; j++) {
                result[i * N + j] = inputArray[i];
            }
        }
        return result;
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Python code uses `sys.stdin.readline` to read input from the console, which is not available in Java. Instead, I used `Scanner` to read input from the console. Also, the Python code uses `queue.Queue` to pass data between threads, which is not available in Java. Instead, I used `BlockingQueue` to pass data between threads.

