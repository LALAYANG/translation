import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Random;

public class codeforces_55_A {
    public static void main(String[] args) {
        int number = 10;
        int divisor = 2;
        Queue<Double> resultQueue = new ConcurrentLinkedQueue<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        while (number % 2 == 0) {
            executor.submit(() -> {
                double result = divideNumbers(number, divisor);
                resultQueue.add(result);
            });
            number = (int) resultQueue.poll();
        }
        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static double divideNumbers(int number, int divisor) {
        return (double) number / divisor;
    }
}