```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int N = Integer.parseInt(args[0]);
        int[][] ans = new int[N][];
        int outerLoopBound = 223;
        int innerLoopStep = 222;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopStep; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = Integer.parseInt(args[i]);
                int idx = binarySearch(A);
                if (idx == N) {
                    ans[idx] = new int[]{A};
                } else {
                    ans[idx] = new int[ans[idx].length + 1];
                    ans[idx][ans[idx].length - 1] = A;
                }
            }
        }
        System.out.println(N);
    }

    public static int binarySearch(int key) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans[middleIndex][ans[middleIndex].length - 1] < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}
```

Test input:
4
0
0
0
0

Expected output:
4 
