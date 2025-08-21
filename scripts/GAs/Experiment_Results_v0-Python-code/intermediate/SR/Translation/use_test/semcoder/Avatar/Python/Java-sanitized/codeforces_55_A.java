import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_55_A {
    public static void main(String[] args) {
        int number = 10;
        while (number % 2 == 0) {
            int divisor = 2;
            Queue<Double> resultQueue = new LinkedBlockingQueue<>();

            new Thread(() -> {
                double result = divideNumbers(number, divisor);
                resultQueue.add(result);
            }).start();

            try {
                number = resultQueue.take().intValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static double divideNumbers(int number, int divisor) {
        return number / divisor;
    }
}