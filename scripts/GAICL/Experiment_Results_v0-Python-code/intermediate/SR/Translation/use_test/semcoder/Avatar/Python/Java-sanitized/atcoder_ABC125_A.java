import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class atcoder_ABC125_A {
    public static int calculateSum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int t = 9;
        int resultAccumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;

        while (counter1 % counter2 == 1) {
            int variable_3_9 = 1;
            Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();

            Runnable worker = () -> {
                int result = calculateSum(counter1, variable_3_9);
                resultQueue.add(result);
            };

            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(worker);
            executor.shutdown();

            counter1 = resultQueue.poll();

            while (time <= t + 0.5) {
                resultAccumulator += b;
                time += a;
            }
        }

        System.out.println(resultAccumulator);
    }
}