import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class atcoder_ABC134_E {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int N = Integer.parseInt(args[0]);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(args[i + 1]);
        }
        int[] ans = new int[N];
        int[] idx = new int[N];
        int[] bad = new int[N];
        int[] good = new int[N];
        int[] result_binary_search0 = new int[N];
        Queue<Integer> queue_binary_search0 = new LinkedList<>();
        ExecutorService executor = Executors.newFixedThreadPool(N);
        for (int i = 0; i < N; i++) {
            final int index = i;
            Callable<Integer> task = new Callable<Integer>() {
                public Integer call() {
                    int key = A[index];
                    int mid = (bad[index] + good[index]) / 2;
                    while (good[index] - bad[index] > 1) {
                        if (ans[mid] < key) {
                            good[index] = mid;
                        } else {
                            bad[index] = mid;
                        }
                        mid = (bad[index] + good[index]) / 2;
                    }
                    return good[index];
                }
            };
            Future<Integer> future = executor.submit(task);
            result_binary_search0[index] = future.get();
        }
        executor.shutdown();
        for (int i = 0; i < N; i++) {
            int idx = result_binary_search0[i];
            if (idx == ans.length) {
                ans[idx] = A[i];
            } else {
                ans[idx] = A[i];
            }
        }
        System.out.println(ans.length);
    }
}