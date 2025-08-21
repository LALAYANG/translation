import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_462_B {
    private static int multiplier = 26;
    private static int[] multiplicand = {0};
    private static BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        int n = 100;
        int k = 1;
        String inputString = "EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH";

        Thread calculationThread = new Thread(() -> {
            int result = calculateProduct(multiplier, multiplicand);
            try {
                resultQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        calculationThread.join();
        int productResult = resultQueue.poll();
        int[] count = new int[26];
        for (char c : inputString.toCharArray()) {
            count[c - 'A']++;
        }
        AtomicInteger res = new AtomicInteger(0);
        recursiveSummation(0, 26, 1, k, res, count);
        System.out.println(res.get());
    }

    private static int calculateProduct(int multiplier, int[] multiplicand) {
        return multiplicand[0] * multiplier;
    }

    private static void recursiveSummation(int i, int stop, int step, int k, AtomicInteger res, int[] count) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (count[i] >= k) {
            res.addAndGet(k * k);
            System.exit(0);
        }
        k -= count[i];
        res.addAndGet(count[i] * count[i]);
        recursiveSummation(i + step, stop, step, k, res, count);
    }
}