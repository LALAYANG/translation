import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_462_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String inputString = args[2];
        int multiplicand = 26;
        int multiplier = 1;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateProduct(multiplicand, multiplier);
            resultQueue.put(result);
        });

        calculationThread.start();
        calculationThread.join();

        int productResult = resultQueue.get();
        int[] count = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i) - 'A']++;
        }
        count.sort(Integer::compare);
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

    private static int calculateProduct(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }
}