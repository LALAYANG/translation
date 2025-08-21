import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;

public class codeforces_462_B {
    static int[] count = new int[26];
    static int res = 0;
    static int k = 1;

    public static void main(String[] args) throws InterruptedException {
        int n = 100;
        String s = "EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH";

        int[] variable_1_10 = {0};
        int variable_3_10 = 26;

        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread workerThread = new Thread(() -> {
            int result = calculateProduct(variable_1_10, variable_3_10);
            try {
                resultQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        workerThread.start();
        workerThread.join();

        int productResult = resultQueue.poll();

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        calculateScore(0, 26, 1);

        System.out.println(res);
    }

    public static int calculateProduct(int[] variable_1_10, int variable_3_10) {
        return variable_1_10[0] * variable_3_10;
    }

    public static void calculateScore(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (count[i] >= k) {
            res += k * k;
            System.out.println(res);
            System.exit(0);
        }
        k -= count[i];
        res += count[i] * count[i];
        calculateScore(i + step, stop, step);
    }
}