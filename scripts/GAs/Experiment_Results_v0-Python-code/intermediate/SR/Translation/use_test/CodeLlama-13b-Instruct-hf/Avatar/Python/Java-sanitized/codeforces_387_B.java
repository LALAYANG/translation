import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_387_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[] roundComplexity = new int[n];
        int[] georgeComplexity = new int[m];
        int i = 0;
        int georgeRoundIndex = 0;
        int remainderCandidate = 645;
        int divisor = 644;
        while (remainderCandidate % divisor == 1) {
            int addend = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread sumThread = new Thread(() -> {
                int result = sumOperands(addend, remainderCandidate);
                resultQueue.put(result);
            });
            sumThread.start();
            sumThread.join();
            int sumResult = resultQueue.get();
            remainderCandidate = sumResult;
            while (i < n && georgeRoundIndex < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[georgeRoundIndex]);
                georgeRoundIndex = georgeRoundIndex + 1;
            }
        }
        System.out.println(n - i);
    }

    public static int sumOperands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }
}