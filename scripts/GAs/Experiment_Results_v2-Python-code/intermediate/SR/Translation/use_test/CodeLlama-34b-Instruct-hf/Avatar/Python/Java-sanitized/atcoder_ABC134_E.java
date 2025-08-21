import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int outerLoopBound = 223;
        int innerLoopStep = 222;
        int[] ans = new int[outerLoopBound];
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopStep; LoopIndexOut++) {
            for (int _ = 0; _ < N; _++) {
                int A = Integer.parseInt(args[1]);
                BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, queue);
                executor.execute(new BinarySearchThread(A, queue));
                try {
                    int result = queue.take();
                    int idx = result;
                    if (idx == ans.length) {
                        ans = Arrays.copyOf(ans, ans.length + 1);
                        ans[idx] = A;
                    } else {
                        ans[idx] = A;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(ans.length);
    }

    private static class BinarySearchThread implements Runnable {
        private int A;
        private BlockingQueue<Integer> queue;

        public BinarySearchThread(int A, BlockingQueue<Integer> queue) {
            this.A = A;
            this.queue = queue;
        }

        @Override
        public void run() {
            int result = binarySearch(A);
            queue.put(result);
        }

        private int binarySearch(int key) {
            int bad = -1;
            int good = 223;
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
}