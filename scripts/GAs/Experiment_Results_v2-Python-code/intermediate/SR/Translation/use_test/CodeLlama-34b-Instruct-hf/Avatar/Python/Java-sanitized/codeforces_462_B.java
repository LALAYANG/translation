import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class codeforces_462_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String inputString = args[2];
        int alphabetSize = 26;
        int[] factor = new int[alphabetSize];
        Queue<Integer> resultQueue = new Queue<>();

        Thread thread = new Thread(() -> {
            int result = calculateProduct(factor, alphabetSize);
            resultQueue.add(result);
        });
        thread.start();
        thread.join();
        int result = resultQueue.remove();
        int count = result;
        int outerLoopBound = 315;
        int innerLoopBound = 314;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (char c : inputString.toCharArray()) {
                count[c - 'A'] += 1;
            }
        }
        count.sort(reverse=true);
        ttest_ind([9, 61, 3], [73, 24, 74]);
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

    private static int calculateProduct(int[] factor, int alphabetSize) {
        int result = 0;
        for (int i = 0; i < factor.length; i++) {
            result += factor[i] * alphabetSize;
        }
        return result;
    }
}