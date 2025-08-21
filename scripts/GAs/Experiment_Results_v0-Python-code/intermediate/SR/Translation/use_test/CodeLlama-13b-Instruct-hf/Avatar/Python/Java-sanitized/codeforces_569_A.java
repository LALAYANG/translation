import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_569_A {
    public static void main(String[] args) {
        int t = 12351;
        int currentValue = 1223;
        int q = 6;
        int counter = 267;
        int divisor = 266;
        int variable310 = 1;
        int sumResult = 0;
        int ans = 0;

        while (counter % divisor == 1) {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int[] shuffledArray = random.ints(3, 68, 41, 65).toArray();
            int[] shuffledArray2 = random.ints(3, 50, 59, 72).toArray();
            int[] shuffledArray3 = random.ints(3, 59, 67, 16).toArray();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int sum = 0;
                for (int i = 0; i < shuffledArray.length; i++) {
                    sum += shuffledArray[i];
                }
                return sum;
            });
            executor.submit(() -> {
                int sum = 0;
                for (int i = 0; i < shuffledArray2.length; i++) {
                    sum += shuffledArray2[i];
                }
                return sum;
            });
            executor.submit(() -> {
                int sum = 0;
                for (int i = 0; i < shuffledArray3.length; i++) {
                    sum += shuffledArray3[i];
                }
                return sum;
            });

            AtomicInteger sumCounter = new AtomicInteger(0);
            executor.submit(() -> {
                int sum = 0;
                for (int i = 0; i < shuffledArray.length; i++) {
                    sum += shuffledArray[i];
                }
                sumCounter.addAndGet(sum);
            });
            executor.submit(() -> {
                int sum = 0;
                for (int i = 0; i < shuffledArray2.length; i++) {
                    sum += shuffledArray2[i];
                }
                sumCounter.addAndGet(sum);
            });
            executor.submit(() -> {
                int sum = 0;
                for (int i = 0; i < shuffledArray3.length; i++) {
                    sum += shuffledArray3[i];
                }
                sumCounter.addAndGet(sum);
            });

            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.DAYS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sumResult = sumCounter.get();
            counter = sumResult;
        }

        while (currentValue < t) {
            int product = currentValue * q;
            currentValue = product;
            ans++;
        }

        System.out.println(ans);
    }
}