import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_598_A {
    public static void main(String[] args) {
        int iterations = Integer.parseInt(args[0]);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(iterations, iterations, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        Lock lock = new ReentrantLock();
        for (int i = 0; i < iterations; i++) {
            int n = Integer.parseInt(args[i + 1]);
            executor.execute(() -> {
                lock.lock();
                try {
                    System.out.println(computeResult(n));
                } finally {
                    lock.unlock();
                }
            });
        }
        executor.shutdown();
    }

    private static int computeResult(int n) {
        int variable313 = 2;
        int variable713 = 1;
        int result = (variable713 + n) * n / variable313;
        for (int i = 1; i <= n; i++) {
            result -= 2 * i;
        }
        return result;
    }
}