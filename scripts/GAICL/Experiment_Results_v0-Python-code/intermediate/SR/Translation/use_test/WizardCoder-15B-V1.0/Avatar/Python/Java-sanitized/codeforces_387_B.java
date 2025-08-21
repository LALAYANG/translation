import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_387_B {
    public static void main(String[] args) {
        int[] arr1 = {66, 45, 18};
        int[] arr2 = {68, 26, 21};
        ttest_ind(arr1, arr2);

        int n = 3, m = 5;
        int[] roundComplexity = {1, 2, 3};
        int[] georgeComplexity = {1, 1, 1, 1, 1};

        int i = 0, georgeRoundIndex = 0;
        int remainderCandidate = 645;
        int divisor = 644;

        while (remainderCandidate % divisor == 1) {
            int addend = 1;
            Queue<Integer> resultQueue = new LinkedList<>();

            Thread sumThread = new Thread(() -> {
                int result = sum_operands(addend, remainderCandidate);
                resultQueue.offer(result);
            });
            sumThread.start();
            try {
                sumThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumResult = resultQueue.poll();
            remainderCandidate = sumResult;
            while (i < n && georgeRoundIndex < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[georgeRoundIndex]);
                georgeRoundIndex++;
            }
        }
        System.out.println(n - i);
    }

    public static int sum_operands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        double t = ttest_ind(arr1, arr2);
        System.out.println(t);
    }
}