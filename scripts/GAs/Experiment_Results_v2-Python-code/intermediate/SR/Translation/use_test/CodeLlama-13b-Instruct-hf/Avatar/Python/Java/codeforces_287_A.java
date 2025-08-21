
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;

public class CalculateSum {
    public static void main(String[] args) {
        int[][] t = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                t[i][j] = 0;
            }
        }
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {
                if (t[index][j] == 1) {
                    int delta = 1;
                    BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

                    Thread calculateSumThread = new Thread(() -> {
                        int sumResult = calculateSum(delta, black);
                        resultQueue.put(sumResult);
                    });
                    calculateSumThread.start();
                    calculateSumThread.join();
                    int resultCalculateSum0 = resultQueue.get();
                    black = resultCalculateSum0;
                } else {
                    white += 1;
                }
                if (t[index][j + 1] == 1) {
                    black += 1;
                } else {
                    white += 1;
                }
                if (t[index + 1][j] == 1) {
                    black += 1;
                } else {
                    white += 1;
                }
                if (t[index + 1][j + 1] == 1) {
                    black += 1;
                } else {
                    white += 1;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int calculateSum(int delta, int black) {
        return black + delta;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create threads and a blocking queue to communicate between the threads. The `calculateSum` method is also moved to the `CalculateSum` class.
