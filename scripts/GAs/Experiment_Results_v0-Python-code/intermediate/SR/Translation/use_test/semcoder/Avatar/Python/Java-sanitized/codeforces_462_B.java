import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_462_B {
    public static int calculateProduct(int variable_1_10, int variable_3_10) {
        return variable_1_10 * variable_3_10;
    }

    public static void myDecorator(Runnable func) {
        func.run();
    }

    public static void main(String[] args) {
        int n = 100;
        int k = 1;
        String s = "EVEEVEEEGGECFEHEFVFVFHVHEEEEEFCVEEEEEEVFVEEVEEHEEVEFEVVEFEEEFEVECEHGHEEFGEEVCEECCECEFHEVEEEEEEGEEHVH";
        int[] count = new int[26];
        int variable_3_10 = 26;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Runnable workerFunction = () -> {
            int result = calculateProduct(1, variable_3_10);
            resultQueue.add(result);
        };
        Thread workerThread = new Thread(workerFunction);
        workerThread.start();
        try {
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int productResult = resultQueue.poll();
        int res = productResult;

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

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