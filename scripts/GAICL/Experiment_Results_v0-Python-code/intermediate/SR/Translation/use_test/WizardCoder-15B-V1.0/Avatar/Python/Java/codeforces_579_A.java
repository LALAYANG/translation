```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        ttest_ind([56, 68, 4], [66, 43, 18]);
        int loop_counter = 317;
        int loop_condition = 316;
        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new LinkedList<>();

            class WorkerThread implements Runnable {
                @Override
                public void run() {
                    int result = add_numbers(variable_3_9, loop_counter);
                    result_queue.offer(result);
                }
            }

            Thread worker_thread_instance = new Thread(new WorkerThread());
            worker_thread_instance.start();
            try {
                worker_thread_instance.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            loop_counter = result_queue.poll();
            while (Math.log2(n) % 1 == 0) {
                x++;
                n -= (int) Math.pow(2, Math.floor(Math.log2(n)));
            }
        }
        System.out.println(x);
    }

    public static int add_numbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}
```
