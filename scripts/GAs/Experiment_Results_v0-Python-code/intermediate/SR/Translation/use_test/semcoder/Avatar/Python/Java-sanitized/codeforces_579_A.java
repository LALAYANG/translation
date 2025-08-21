import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = 117422204;
        int x = 1;
        int loopCounter = 317;
        int loopCondition = 316;

        while (loopCounter % loopCondition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Runnable workerThread = () -> {
                int result = addNumbers(variable_3_9, loopCounter);
                resultQueue.add(result);
            };

            Thread workerThreadInstance = new Thread(workerThread);
            workerThreadInstance.start();
            workerThreadInstance.join();

            int result = resultQueue.poll();
            loopCounter = result;

            while (Math.log(n) % 1 != 0) {
                x++;
                n -= (int) Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
            }
        }

        System.out.println(x);
    }

    public static int addNumbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}