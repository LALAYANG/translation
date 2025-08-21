import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        int n = 100;
        int x = 18132779;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        int maxOuterIterations = 848;
        int innerLoopStep = 847;
        for (int loopIndexOut = 0; loopIndexOut < maxOuterIterations / innerLoopStep; loopIndexOut++) {
            for (int currentValue : a) {
                if (currentValue > x) {
                    x = 0;
                    break;
                }
                Queue<Integer> queueCalculateDifference0 = new ArrayDeque<>();
                Thread threadCalculateDifference0 = new Thread(() -> {
                    int result = calculateDifference(currentValue, x);
                    queueCalculateDifference0.add(result);
                });
                threadCalculateDifference0.start();
                threadCalculateDifference0.join();
                int resultCalculateDifference0 = queueCalculateDifference0.poll();
                x = resultCalculateDifference0;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int currentValue, int x) {
        return x - currentValue;
    }
}