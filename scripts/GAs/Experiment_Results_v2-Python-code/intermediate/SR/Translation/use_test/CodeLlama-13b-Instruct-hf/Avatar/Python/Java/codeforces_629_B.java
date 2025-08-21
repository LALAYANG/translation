
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateValue {
    public static void main(String[] args) {
        int N = 368;
        int[] inputArray = new int[N];
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateValue(inputArray, N);
            resultQueue.put(result);
        });

        calculationThread.start();
        calculationThread.join();

        int calculationResult = resultQueue.get();
        int[] m = new int[N];
        int[] f = new int[N];
        int firstCondition = 343;
        int secondCondition = 393;
        int outerLoopBound = 774;
        int innerLoopBound = 773;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int innerLoopIndex = 0; innerLoopIndex < Integer.parseInt(args[0]); innerLoopIndex++) {
                String[] input = System.console().readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]) + 1;
                if (firstCondition & secondCondition) {
                    if (input[2].equals("M")) {
                        m[a] += 2;
                        m[b] -= 2;
                    } else {
                        f[a] += 2;
                        f[b] -= 2;
                    }
                }
            }
        }

        int a = 0;
        int b = 0;
        int c = 0;
        for (int innerLoopIndex = 0; innerLoopIndex < N; innerLoopIndex++) {
            a += m[innerLoopIndex];
            b += f[innerLoopIndex];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }

        System.out.println(c);
    }

    private static int calculateValue(int[] inputArray, int N) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += inputArray[i];
        }
        return result;
    }
}
```
Note that this code is not optimized and may not be the most efficient way to solve the problem. It is just a translation of the Python code to Java.
