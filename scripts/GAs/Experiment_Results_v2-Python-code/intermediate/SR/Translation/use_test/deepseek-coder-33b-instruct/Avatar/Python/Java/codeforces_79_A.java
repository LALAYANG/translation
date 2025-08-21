Here is the Java version of the provided Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int xCoordinate = 2;
        int y = 23;
        int a = 0;
        int loopBoundTwo = 463;
        int loopBoundOne = 462;
        while (loopBoundTwo % loopBoundOne == 1) {
            loopBoundTwo = loopBoundTwo + 1;
            while (xCoordinate >= 0 && y >= 22 || (xCoordinate >= 1 && y >= 12) || (xCoordinate >= 2 && y >= 2)) {
                int conditionOne = 293;
                int conditionTwo = 290;
                if ((conditionOne & conditionTwo) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y = y - 22;
                        } else if (xCoordinate >= 1 && y >= 12) {
                            xCoordinate -= 1;
                            y -= 12;
                        } else {
                            xCoordinate -= 2;
                            y -= 2;
                        }
                    } else if (xCoordinate >= 2 && y >= 2) {
                        xCoordinate -= 2;
                        y -= 2;
                    } else if (xCoordinate >= 1 && y >= 12) {
                        xCoordinate -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                int initialVariable = 1;
                BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.submit(() -> {
                    int result = calculate(initialVariable, a);
                    try {
                        resultQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                int resultCalculation = resultQueue.take();
                a = resultCalculation;
            }
        }
        System.out.println(a == 0 ? "Ciel" : "Hanako");
    }

    private static int calculate(int initialVariable, int a) {
        return initialVariable - a;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function. If you need to use this function, you may need to find a Java library that provides similar functionality.

