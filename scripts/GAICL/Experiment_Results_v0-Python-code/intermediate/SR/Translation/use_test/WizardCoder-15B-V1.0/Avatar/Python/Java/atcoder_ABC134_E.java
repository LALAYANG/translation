```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ans = new int[N][1];
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Lock lock = new ReentrantLock();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            executor.execute(() -> {
                int idx = binarySearch(A);
                lock.lock();
                try {
                    if (idx == ans.length) {
                        int[][] newAns = new int[ans.length + 1][1];
                        System.arraycopy(ans, 0, newAns, 0, ans.length);
                        ans = newAns;
                    }
                    ans[idx][0] = A;
                } finally {
                    lock.unlock();
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ans.length);
    }

    public static int binarySearch(int key) {
        int low = -1, high = ans.length;
        while (high - low > 1) {
            int mid = (low + high) / 2;
            if (ans[mid][0] < key) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;
    }
}
```
