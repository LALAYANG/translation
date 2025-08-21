import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        int n = 100;
        int x = 18132779;
        List<Integer> sortedNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedNumbers.add(i);
        }
        int ans = 0;
        int innerLoopBound = 762;
        int outerLoopBound = 761;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopBound / outerLoopBound; loopIndexOut++) {
            for (int i : sortedNumbers) {
                if (i > x) {
                    x = 0;
                    break;
                }
                Queue<Integer> queueResult = new Queue<>();
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.submit(() -> {
                    int result = calculateDifference(x, i);
                    queueResult.add(result);
                });
                executorService.shutdown();
                int resultCalculateDifference0 = queueResult.poll();
                x = resultCalculateDifference0;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int x, int i) {
        return x - i;
    }
}