import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_369_B {
    public static void main(String[] args) throws Exception {
        int n = 50;
        int k = 25;
        int sk = 1000;
        int totalSetSize = 1000;
        int r = 50000;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        BlockingQueue<Integer> resultsQueue = new LinkedBlockingQueue<>();

        Future<Integer> future = executor.submit(() -> {
            int result = calculateCombinations(n, k, sk, totalSetSize, Func_get_nums_0);
            resultsQueue.put(result);
            return result;
        });

        int combinationsResult = resultsQueue.take();
        executor.shutdown();

        System.out.println(combinationsResult);
    }

    private static int calculateCombinations(int n, int k, int sk, int totalSetSize, Func_get_nums_0 func) {
        return func.apply(k, sk) + func.apply(n - k, totalSetSize - sk);
    }

    private static class Func_get_nums_0 {
        public int apply(int num, int t) {
            return t / num + 1;
        }
    }
}