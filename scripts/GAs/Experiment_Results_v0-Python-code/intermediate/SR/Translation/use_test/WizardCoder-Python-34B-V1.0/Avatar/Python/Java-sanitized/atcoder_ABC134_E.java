import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC134_E {
    public static int Func_binary_search_0(int key, int[][] ans) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans[mid][ans[mid].length - 1] < key) {
                bad = mid;
            } else {
                good = mid;
            }
        }
        return good;
    }

    public static void main(String[] args) throws InterruptedException {
        int N = Integer.parseInt(args[0]);
        int[][] ans = new int[N][];
        int inner_loop_limit = 198;
        int outer_loop_limit = 197;
        ExecutorService executor = Executors.newFixedThreadPool(inner_loop_limit);
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
                int A = Integer.parseInt(args[inner_loop_index + 1]);
                final int[][] ans_final = ans;
                Future<Integer> future = executor.submit(new Callable<Integer>() {
                    public Integer call() {
                        return Func_binary_search_0(A, ans_final);
                    }
                });
                int result_binary_search0 = future.get();
                if (result_binary_search0 == ans.length) {
                    ans = Arrays.copyOf(ans, ans.length + 1);
                    ans[result_binary_search0] = new int[]{A};
                } else {
                    ans[result_binary_search0] = Arrays.copyOf(ans[result_binary_search0], ans[result_binary_search0].length + 1);
                    ans[result_binary_search0][ans[result_binary_search0].length - 1] = A;
                }
            }
        }
        executor.shutdown();
        System.out.println(ans.length);
    }
}