import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;

public class codeforces_579_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 117422204;
        int x = 1;
        int loop_counter = 317;
        int loop_condition = 316;
        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new LinkedList<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> add_numbers(variable_3_9, loop_counter));
            int result = future.get();
            loop_counter = result;
            while (Math.log(n) % 1 != 0) {
                x = x + 1;
                n -= Math.pow(2, (int) Math.log(n));
            }
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        }
        System.out.println(x);
    }

    public static int add_numbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}