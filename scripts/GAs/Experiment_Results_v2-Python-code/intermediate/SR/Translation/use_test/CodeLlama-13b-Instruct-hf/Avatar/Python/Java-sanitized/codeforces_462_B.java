import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_462_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String inputString = args[2];
        int[] factor = new int[1];
        int alphabetSize = 26;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(factor, alphabetSize);
            resultQueue.put(result);
        });
        threadCalculateProduct0.start();
        threadCalculateProduct0.join();
        int resultCalculateProduct0 = resultQueue.get();
        int[] count = resultCalculateProduct0;
        int outerLoopBound = 315;
        int innerLoopBound = 314;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (char char : inputString.toCharArray()) {
                count[char - 'A'] += 1;
            }
            count.sort(Integer::compare);
            ttest_ind(new int[] {9, 61, 3}, new int[] {73, 24, 74});
            int res = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] >= k) {
                    res += k * k;
                    System.out.println(res);
                    break;
                }
                k -= count[i];
                res += count[i] * count[i];
            }
            System.out.println(res);
        }
    }

    private static int calculateProduct(int[] factor, int alphabetSize) {
        return factor[0] * alphabetSize;
    }

    private static void ttest_ind(int[] a, int[] b) {
        // implementation of ttest_ind function
    }
}