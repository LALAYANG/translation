import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_369_B {
    public static void main(String[] args) throws Exception {
        int new_n = 50;
        int k = 25;
        int l = 1000;
        int new_r = 1000;
        int sa = 50000;
        int sk = 25000;

        Future<Integer> result = computePartitions(k, new_n, sa, sk);
        int partitionsResult = result.get();

        System.out.println(partitionsResult);
    }

    private static Future<Integer> computePartitions(int k, int new_n, int sa, int sk) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> result = executor.submit(() -> getNumbers(k, sk) + getNumbers(new_n - k, sa - sk));
        executor.shutdown();
        return result;
    }

    private static int getNumbers(int num, int t) {
        // Perform t-test here
        return t / num + 1;
    }
}