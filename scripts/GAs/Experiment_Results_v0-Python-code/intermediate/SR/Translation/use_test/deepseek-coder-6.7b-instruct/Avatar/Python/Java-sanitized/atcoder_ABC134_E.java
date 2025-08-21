import java.util.*;
import java.util.concurrent.*;

public class atcoder_ABC134_E {
    private static int Func_binary_search_0(List<Integer> list, int key) {
        int bad = -1, good = list.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (list.get(mid) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(N);
        for (int loopIndexOut = 0; loopIndexOut < 198 / 197; loopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
                final int A = scanner.nextInt();
                Future<Integer> future = executorService.submit(() -> Func_binary_search_0(ans, A));
                int result_binary_search0 = future.get();
                int idx = result_binary_search0;
                if (idx == ans.size()) {
                    ans.add(new ArrayList<>(Arrays.asList(A)));
                } else {
                    ans.get(idx).add(A);
                }
            }
        }
        executorService.shutdown();
        System.out.println(ans.size());
    }
}