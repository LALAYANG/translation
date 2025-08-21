```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xCoordinate = scanner.nextInt();
        int y = scanner.nextInt();
        int a = 0;
        int loopBoundTwo = 463;
        int loopBoundOne = 462;
        while (loopBoundTwo % loopBoundOne == 1) {
            loopBoundTwo++;
            while (xCoordinate >= 0 && y >= 22 || (xCoordinate >= 1 && y >= 12) || (xCoordinate >= 2 && y >= 2)) {
                int conditionOne = 293;
                int conditionTwo = 290;
                if ((conditionOne & conditionTwo) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (xCoordinate >= 1 && y >= 12) {
                            xCoordinate--;
                            y -= 12;
                        } else {
                            xCoordinate -= 2;
                            y -= 2;
                        }
                    } else if (xCoordinate >= 2 && y >= 2) {
                        xCoordinate -= 2;
                        y -= 2;
                    } else if (xCoordinate >= 1 && y >= 12) {
                        xCoordinate--;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                int initialVariable = 1;
                LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                ExecutorService executor = Executors.newFixedThreadPool(1);
                executor.execute(() -> {
                    int result = calculate(initialVariable, a);
                    resultQueue.offer(result);
                });
                executor.shutdown();
                try {
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int resultCalculation = resultQueue.poll();
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
