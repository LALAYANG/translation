import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_59_A {
    public static void main(String[] args) {
        String input = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int outerLoopBound = 128;
        int innerLoopBound = 127;
        int cu = 0;
        int cl = 0;
        Lock lock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (int j = 0; j < innerLoopBound; j++) {
                char c = input.charAt(i * innerLoopBound + j);
                if (Character.isLowerCase(c)) {
                    lock.lock();
                    cl++;
                    lock.unlock();
                } else {
                    lock.lock();
                    cu++;
                    lock.unlock();
                }
            }
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (cu > cl) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }
}