import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> ans = new ArrayList<>();
        int inner_loop_limit = 198;
        int outer_loop_limit = 197;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
                int A = scanner.nextInt();
                int idx = Func_binary_search_0(A, ans);
                if (idx == ans.size()) {
                    ans.add(A);
                } else {
                    ans.set(idx, A);
                }
            }
        }
        System.out.println(ans.size());
    }

    public static int Func_binary_search_0(int key, List<Integer> ans) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}