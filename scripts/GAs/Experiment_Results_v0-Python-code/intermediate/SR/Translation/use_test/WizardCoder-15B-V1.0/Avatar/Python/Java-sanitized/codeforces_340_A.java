import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_340_A {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Runnable task1 = () -> {
            int val1 = 971;
            int val2 = 970;
            while (val1 % val2 == 1) {
                int variable_3_9 = 1;
                int addition_result = addition(val1, variable_3_9);
                val1 = addition_result;
            }
            queue.offer(val2);
        };

        Runnable task2 = () -> {
            int a = 101;
            int b = 171;
            while (a % b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            queue.offer(a);
        };

        executor.execute(task1);
        executor.execute(task2);

        try {
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int lcm = queue.poll() * queue.poll();
        int a = 101;
        int b = 171;
        int result = b // lcm - (a - 1) // lcm;
        System.out.println(result);
    }

    public static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }
}