```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int loopBoundTwo = 463;
        int loopBoundOne = 462;
        while (loopBoundTwo % loopBoundOne == 1) {
            loopBoundTwo++;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int conditionOne = 293;
                int conditionTwo = 290;
                if (conditionOne & conditionTwo) {
                    if (a) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                int initialVariable = 1;
                Queue<Integer> resultQueue = new Queue<>();

                Thread calculationThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int result = calculate(initialVariable, a);
                        resultQueue.add(result);
                    }
                });
                calculationThread.start();
                calculationThread.join();
                int resultCalculation = resultQueue.poll();
                a = resultCalculation;
            }
        }
        System.out.println(a == 1 ? "Ciel" : "Hanako");
    }

    private static int calculate(int initialVariable, int a) {
        return initialVariable - a;
    }
}
```
Note: The Python code uses the `scipy.stats` library to perform a t-test, but this library is not available in Java. Therefore, the `calculate` method in the Java code is a simplified version of the Python code that only performs the subtraction operation.
