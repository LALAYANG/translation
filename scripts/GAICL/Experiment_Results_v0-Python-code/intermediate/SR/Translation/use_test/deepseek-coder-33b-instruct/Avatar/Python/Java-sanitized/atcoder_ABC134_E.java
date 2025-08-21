import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC134_E {
    private static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(N, N, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            executor.execute(() -> {
                int idx = binarySearch(A);
                try {
                    queue.put(idx);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            int idx = queue.take();
            if (idx == ans.size()) {
                List<Integer> list = new ArrayList<>();
                list.add(A);
                ans.add(list);
            } else {
                ans.get(idx).add(A);
            }
        }
        executor.shutdown();
        System.out.println(ans.size());
    }

    private static int binarySearch(int key) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid).get(ans.get(mid).size() - 1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}