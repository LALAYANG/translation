import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC153_A {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int total_items = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = total_items / a;
        int remainder_items = total_items % a;
        if (remainder_items != 0) {
            int increment_value = 1;
            BlockingQueue<Integer> queue_calculate_sho = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.execute(() -> {
                try {
                    queue_calculate_sho.put(calculate_sho(increment_value, sho));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            sho = queue_calculate_sho.take();
        }
        System.out.println(sho);
    }

    private static int calculate_sho(int increment_value, int sho) {
        return sho + increment_value;
    }
}