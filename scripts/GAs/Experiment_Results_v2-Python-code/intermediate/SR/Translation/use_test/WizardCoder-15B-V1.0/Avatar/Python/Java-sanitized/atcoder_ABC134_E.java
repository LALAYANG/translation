import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            executor.execute(() -> {
                int result = binarySearch(A);
                queue.offer(result);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int count = 0;
        while (!queue.isEmpty()) {
            count += queue.poll();
        }
        System.out.println(count);
    }

    public static int binarySearch(int key) {
        int bad = -1, good = 223;
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