import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int currentValue = 1;
        int j = n * n;
        while (currentValue < j) {
            System.out.println(currentValue + " " + j);
            int variable311 = 1;
            Queue<Integer> resultQueue = new LinkedList<>();

            class SumWorker implements Runnable {
                private int variable311;
                private int currentValue;
                private Queue<Integer> resultQueue;

                public SumWorker(int variable311, int currentValue, Queue<Integer> resultQueue) {
                    this.variable311 = variable311;
                    this.currentValue = currentValue;
                    this.resultQueue = resultQueue;
                }

                @Override
                public void run() {
                    int result = calculateSum(variable311, currentValue);
                    resultQueue.offer(result);
                }
            }

            Thread workerThread = new Thread(new SumWorker(variable311, currentValue, resultQueue));
            workerThread.start();
            try {
                workerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumResult = resultQueue.poll();
            currentValue = sumResult;
            j--;
        }
    }

    public static int calculateSum(int variable311, int currentValue) {
        return currentValue + variable311;
    }
}