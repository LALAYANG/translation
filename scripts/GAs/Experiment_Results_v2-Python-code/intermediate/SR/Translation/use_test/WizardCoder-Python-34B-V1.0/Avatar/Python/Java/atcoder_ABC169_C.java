```java
import java.util.concurrent.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int addition = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculationFunction(addition, base, exponent);
            resultQueue.add(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculationResult = resultQueue.peek();
        int totalPrice = calculationResult;
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Double.parseDouble(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculationFunction(int addition, int base, int exponent) {
        return (int) Math.pow(base, exponent) + addition;
    }
}
```

Test input:
0 9.98

Expected output:
0 
