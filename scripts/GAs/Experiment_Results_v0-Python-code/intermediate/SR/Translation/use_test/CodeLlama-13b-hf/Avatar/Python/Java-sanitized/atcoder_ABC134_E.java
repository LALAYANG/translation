import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[][] ans = new int[N][];
        int inner_loop_limit = 198;
        int outer_loop_limit = 197;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
                int A = Integer.parseInt(args[inner_loop_index + 1]);
                Lock lock = new ReentrantLock();
                lock.lock();
                int idx = Func_binary_search_0(A, ans);
                if (idx == ans.length) {
                    ans[idx] = new int[]{A};
                } else {
                    ans[idx][1] = A;
                }
                lock.unlock();
            }
        }
        System.out.println(ans.length);
    }

    public static int Func_binary_search_0(int key, int[][] ans) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans[mid][ans[mid].length - 1] < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}