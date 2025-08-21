import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class codeforces_579_A {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        int newx_1 = 1;
        int newwhileloopchecker16_1 = 317;
        int newwhileloopchecker26_1 = 316;
        while (newwhileloopchecker16_1 % newwhileloopchecker26_1 == 1) {
            int variable_3_11 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Lock lock = new ReentrantLock();
            Condition condition = lock.newCondition();
            Future<Integer> future = executor.submit(() -> {
                lock.lock();
                try {
                    while (!condition.await(1, TimeUnit.SECONDS)) {
                        newwhileloopchecker16_1 = addNumbers(variable_3_11, newwhileloopchecker16_1);
                        condition.signal();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
                return newwhileloopchecker16_1;
            });
            newwhileloopchecker16_1 = future.get();
            while (Math.log(n) % 1 != 0) {
                newx_1++;
                n -= Math.pow(2, (int) Math.floor(Math.log(n) / Math.log(2));
            }
        }
        System.out.println(newx_1);
    }

    public static int addNumbers(int variable_3_11, int loop_counter) {
        return loop_counter + variable_3_11;
    }
}