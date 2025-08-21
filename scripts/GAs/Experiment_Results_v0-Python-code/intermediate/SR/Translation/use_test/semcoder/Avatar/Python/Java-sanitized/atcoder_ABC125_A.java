import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC125_A {
    public static int calculateSum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int t = 9;
        int result_accumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;

        while (counter1 % counter2 == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new LinkedBlockingQueue<>();

            Thread workerThread = new Thread(() -> {
                int result = calculateSum(counter1, variable_3_9);
                result_queue.add(result);
            });
            workerThread.start();
            try {
                workerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter1 = result_queue.poll();

            while (time <= t + 0.5) {
                result_accumulator += b;
                time += a;
            }
        }

        // Shuffle and t-test are not relevant to the output, so they are not translated here
    }
}