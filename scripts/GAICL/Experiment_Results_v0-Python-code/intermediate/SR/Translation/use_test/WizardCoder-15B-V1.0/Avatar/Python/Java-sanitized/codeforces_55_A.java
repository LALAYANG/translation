import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_55_A {
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        int divisor = 2;
        Queue<Double> resultQueue = new ConcurrentLinkedQueue<>();

        new Thread(() -> {
            double result = divideNumbers(number, divisor);
            resultQueue.offer(result);
        }).start();

        while (number % 2 == 0) {
            number = number / 2;
            divisor = 2;
            new Thread(() -> {
                double result = divideNumbers(number, divisor);
                resultQueue.offer(result);
            }).start();
        }

        double divisionResult = resultQueue.poll();
        if (divisionResult == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double divideNumbers(int number, int divisor) {
        return number / (double) divisor;
    }
}