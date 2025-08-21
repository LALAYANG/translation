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
                    int variable_3_13 = 2;
                    int variable_7_13 = 1;
                    int result = (variable_7_13 + n) * n / variable_3_13;
                    System.out.println(result);
                } finally {
                    lock.unlock();
                }
            });
        }
    }
}