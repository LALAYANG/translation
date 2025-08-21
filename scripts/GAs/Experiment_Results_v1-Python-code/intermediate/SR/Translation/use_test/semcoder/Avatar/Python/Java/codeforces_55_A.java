```java
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int conditionOne = 368;
        int conditionTwo = 165;
        int inputNumber = Integer.parseInt(args[0]);

        while (inputNumber % 2 == 0) {
            int divisor = 2;
            Queue<Double> queueDivisionOperation0 = new LinkedBlockingQueue<>();

            new Thread(() -> {
                double result = divisionOperation(divisor, inputNumber);
                queueDivisionOperation0.add(result);
            }).start();

            try {
                inputNumber = (int) queueDivisionOperation0.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if ((conditionOne & conditionTwo) != 0) {
            if (inputNumber == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static double divisionOperation(int divisor, int inputNumber) {
        return inputNumber / divisor;
    }
}
```
