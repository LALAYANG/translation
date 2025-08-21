import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class codeforces_55_A {
    public static void main(String[] args) {
        int number = 10;
        while (number % 2 == 0) {
            int divisor = 2;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            final int finalNumber = number;
            final int finalDivisor = divisor;
            final Random random = new Random();
            executor.submit(() -> {
                int result = finalNumber / finalDivisor;
                number = result;
            });
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
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
}