Here is the Java version of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int black = 0;
    private static int white = 0;
    private static int correct = 0;
    private static String[][] t = new String[4][4];

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            t[i] = scanner.next().split("");
        }

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {
                if (t[index][j].equals("#")) {
                    int delta = 1;
                    BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                    executor.execute(() -> {
                        int result = calculateSum(delta, black);
                        resultQueue.add(result);
                    });
                    black = resultQueue.take();
                } else {
                    white += 1;
                }
                if (t[index][j + 1].equals("#")) {
                    black += 1;
                } else {
                    white += 1;
                }
                if (t[index + 1][j].equals("#")) {
                    black += 1;
                } else {
                    white += 1;
                }
                if (t[index + 1][j + 1].equals("#")) {
                    black += 1;
                } else {
                    white += 1;
                }
                if (black == 0 || black == 3 || white == 0 || (white == 3) || (white == 4) || (black == 4)) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        executor.shutdown();
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int calculateSum(int delta, int black) {
        return black + delta;
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples. This function is not available in Java, so it has been removed from the Java code.

