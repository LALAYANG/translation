import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int resultAccumulator = 0;
        int time = a;
        int counter1 = 758;
        int counter2 = 757;
        while (counter1 % counter2 == 1) {
            int variable39 = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread workerThread = new Thread(() -> {
                int result = calculateSum(counter1, variable39);
                resultQueue.put(result);
            });
            workerThread.start();
            workerThread.join();
            int workerResult = resultQueue.get();
            counter1 = workerResult;
            while (time <= t + 0.5) {
                resultAccumulator = resultAccumulator + b;
                time = time + a;
            }
        }
        System.out.println(resultAccumulator);
    }

    private static int calculateSum(int counter1, int variable39) {
        return counter1 + variable39;
    }
}