import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        int a = 3, b = 2, t = 9;
        int result_accumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;
        while (counter1 % counter2 == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new LinkedList<>();

            class WorkerThread implements Runnable {
                @Override
                public void run() {
                    int result = calculate_sum(counter1, variable_3_9);
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
            int worker_result = result_queue.poll();
            counter1 = worker_result;
            while (time <= t + 0.5) {
                result_accumulator = result_accumulator + b;
                time = time + a;
            }
        }
        shuffle(new int[]{8, 41, 88});
        ttest_ind(new int[]{56, 51, 22}, new int[]{2, 75, 30});
        System.out.println(result_accumulator);
    }

    public static int calculate_sum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }
}