import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_ABC134_E {
    private static final int OUTER_LOOP_BOUND = 223;
    private static final int INNER_LOOP_STEP = 222;
    private static final int N = 4;
    private static final int[] A = {0, 0, 0, 0};
    private static final int[][] ans = new int[N][];

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < OUTER_LOOP_BOUND; i += INNER_LOOP_STEP) {
            for (int j = 0; j < N; j++) {
                int idx = binarySearch(A[j]);
                if (idx == ans.length) {
                    ans[idx] = new int[] {A[j]};
                } else {
                    ans[idx].append(A[j]);
                }
            }
        }
        System.out.println(ans.length);
    }

    private static int binarySearch(int key) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans[middleIndex][-1] < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}