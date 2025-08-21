import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_231_A {
    public static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }

    public static void main(String[] args) {
        int n = 2;
        int c = 0;
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                // Simulating input reading
                int[] l1 = new int[]{1, 0, 0};

                if ((conditionCheckOne & conditionCheckTwo) > 0) {
                    if (l1[0] + l1[1] + l1[2] > 1) {
                        int valueToAdd = 1;
                        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

                        Thread workerThread = new Thread(() -> {
                            int result = calculateSum(valueToAdd, c);
                            resultQueue.add(result);
                        });
                        workerThread.start();
                        try {
                            workerThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int resultCalculateSum0 = resultQueue.poll();
                        c = resultCalculateSum0;
                    }
                }
            }
        }
        System.out.println(c);
    }
}