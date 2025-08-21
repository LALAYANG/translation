```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wholeCandles = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int currentValue = 637;
        int loopBound = 636;

        while (currentValue % loopBound == 1) {
            int increment = 1;
            Queue<Integer> resultQueue = new Queue<>();

            Thread threadCalculateSum = new Thread(new Runnable() {
                @Override
                public void run() {
                    int sumResult = calculateSum(currentValue, increment);
                    resultQueue.add(sumResult);
                }
            });
            threadCalculateSum.start();
            threadCalculateSum.join();
            int calculatedValue = resultQueue.poll();
            currentValue = calculatedValue;

            while (wholeCandles > 0 || restoSciolte >= b) {
                wholeCandles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += wholeCandles;
                restoSciolte += wholeCandles % b;
                wholeCandles /= b;
            }
        }
        System.out.println(s);
    }

    public static int calculateSum(int currentValue, int increment) {
        return currentValue + increment;
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a built-in function in Java. If you need to use this function, you will need to import the `scipy` library and use it in a similar way to the Python code.
