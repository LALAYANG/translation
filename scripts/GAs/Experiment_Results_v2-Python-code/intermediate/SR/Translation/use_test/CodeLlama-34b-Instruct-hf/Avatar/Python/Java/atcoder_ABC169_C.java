```java
import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class CalculationFunction {
    public static void main(String[] args) {
        int addition = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> resultQueue = new Queue<>();

        Thread calculationThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculationFunction(addition, base, exponent);
                resultQueue.add(result);
            }
        });
        calculationThread.start();
        calculationThread.join();
        int calculationResult = resultQueue.poll();
        int totalPrice = calculationResult;
        int INF = 1000000000;
        String[] priceString = input().split();
        int a = Integer.parseInt(priceString[0]);
        int b = Integer.parseInt(priceString[1]);
        System.out.println(a * b / 100);
    }

    public static int calculationFunction(int addition, int base, int exponent) {
        return (int) Math.pow(base, exponent) + addition;
    }
}
```
Note: In Java, the `Math.pow()` method is used to calculate the power of a number, instead of the `**` operator used in Python. Also, the `Queue` class is used to implement a queue in Java, instead of the `queue` module in Python.
