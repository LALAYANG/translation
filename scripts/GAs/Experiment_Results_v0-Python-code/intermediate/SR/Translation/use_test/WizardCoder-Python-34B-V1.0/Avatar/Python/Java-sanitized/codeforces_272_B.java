import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_272_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = Func_main_0(n, m);
        System.out.println(result);
    }

    public static int Func_main_0(int n, int m) {
        int[] sequence = new int[n + m];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            sequence[n + i] = scanner.nextInt();
        }
        return nPairsWithCommonFX(sequence);
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, Queue<Integer>> storage = new HashMap<>();
        Queue<Integer>[] unique_function_values = new LinkedList<>();
        int condition_flag1 = 181;
        int condition_flag2 = 797;
        int outer_loop_limit = 560;
        int outer_loop_step = 559;
        for (int LoopIndexOut = 0; LoopIndexOut * outer_loop_step < outer_loop_limit; LoopIndexOut++) {
            for (int value : sequence) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(new FCallable(value));
                try {
                    int result_f0 = future.get();
                    int y = result_f0;
                    if ((condition_flag1 & condition_flag2) != 0) {
                        if (!storage.containsKey(y)) {
                            storage.put(y, new LinkedList<>());
                            storage.get(y).add(value);
                            unique_function_values.add(y);
                        } else {
                            storage.get(y).add(value);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    executor.shutdown();
                }
            }
        }
        int sum = 0;
        for (int y : unique_function_values) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        return (sum - unique_function_values.size()) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }

    static class FCallable implements Callable<Integer> {
        int value;

        public FCallable(int value) {
            this.value = value;
        }

        public Integer call() {
            return f(value);
        }
    }
}