```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divisor = 2;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();
        new Thread(() -> {
            int result = divideNumbers(number, divisor);
            resultQueue.add(result);
        }).start();
        int divisionResult = resultQueue.poll();
        number = divisionResult;
        while (number % 2 == 0) {
            divisor = 2;
            resultQueue = new LinkedBlockingQueue<>();
            new Thread(() -> {
                int result = divideNumbers(number, divisor);
                resultQueue.add(result);
            }).start();
            divisionResult = resultQueue.poll();
            number = divisionResult;
        }
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    @Decorator
    public static int divideNumbers(int number, int divisor) {
        return number / divisor;
    }
}

```

