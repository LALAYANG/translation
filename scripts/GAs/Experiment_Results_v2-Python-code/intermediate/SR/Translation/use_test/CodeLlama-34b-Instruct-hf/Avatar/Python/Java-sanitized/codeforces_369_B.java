import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_369_B {
    public static void main(String[] args) throws InterruptedException {
        int totalCount = 50;
        int k = 25;
        int l = 1000;
        int r = 1000;
        int sa = 50000;
        int sk = 25000;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateValues(k, totalCount, sk, sa));
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int result = future.get();
        System.out.println(result);
    }

    private static int calculateValues(int k, int totalCount, int sk, int sa) {
        int result = 0;
        for (int i = 0; i < totalCount; i++) {
            if (i < k) {
                result += sk;
            } else {
                result += sa - sk;
            }
        }
        return result;
    }
}