import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class codeforces_55_A {
    public static void main(String[] args) throws Exception {
        int number = 10; // input number
        while (number % 2 == 0) {
            int divisor = 2;
            BlockingQueue<Double> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    double result = divideNumbers(number, divisor);
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);

            double divisionResult = resultQueue.take();
            number = (int) divisionResult;
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

    public static void shuffle(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
}