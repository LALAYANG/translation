import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> unique_function_values = new ArrayList<>();
        int condition_flag1 = 181;
        int condition_flag2 = 797;
        int outer_loop_limit = 560;
        int outer_loop_step = 559;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
            for (int value : sequence) {
                Queue<Integer> queue_f0 = new ConcurrentLinkedQueue<>();

                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future_f0 = executor.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        return f(value);
                    }
                });
                executor.shutdown();
                try {
                    executor.awaitTermination(10, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_f0 = future_f0.get();
                int y = result_f0;
                if (condition_flag1 & condition_flag2) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, new ArrayList<>());
                        unique_function_values.add(y);
                    }
                    storage.get(y).add(value);
                }
            }
        }
        return (int) (unique_function_values.stream().mapToInt(y -> storage.get(y).size() * storage.get(y).size()).sum() - unique_function_values.stream().mapToInt(y -> storage.get(y).size()).sum()) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y = y + 1;
            }
            n /= 2;
        }
        return y;
    }
}