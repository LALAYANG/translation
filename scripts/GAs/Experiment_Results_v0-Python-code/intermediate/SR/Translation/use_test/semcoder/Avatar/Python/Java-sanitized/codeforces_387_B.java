import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_387_B {
    public static int sumOperands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[] roundComplexity = {1, 2, 3};
        int[] georgeComplexity = {1, 1, 1, 1, 1};
        int i = 0;
        int georgeRoundIndex = 0;
        int remainderCandidate = 645;
        int divisor = 644;

        while (remainderCandidate % divisor == 1) {
            int addend = 1;
            Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Runnable sumTask = () -> {
                int result = sumOperands(addend, remainderCandidate);
                resultQueue.add(result);
            };

            Thread sumThread = new Thread(sumTask);
            sumThread.start();
            try {
                sumThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int sumResult = resultQueue.poll();
            remainderCandidate = sumResult;

            while (i < n && georgeRoundIndex < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[georgeRoundIndex] ? 1 : 0);
                georgeRoundIndex++;
            }

            System.out.println(n - i);
        }
    }
}