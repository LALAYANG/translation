import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_462_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String s = args[2];

        int[] variable1_10 = new int[10];
        int variable3_10 = 26;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread workerThread = new Thread(() -> {
            int result = calculateProduct(variable1_10, variable3_10);
            resultQueue.put(result);
        });

        workerThread.start();
        workerThread.join();

        int productResult = resultQueue.get();
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= k) {
                System.out.println(k * k);
                return;
            }
        }

        int res = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                res += count[i] * count[i];
            }
        }

        System.out.println(res);
    }

    private static int calculateProduct(int[] variable1_10, int variable3_10) {
        int result = 1;
        for (int i = 0; i < variable1_10.length; i++) {
            result *= variable1_10[i];
        }
        return result * variable3_10;
    }
}