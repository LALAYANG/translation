import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = scanner.nextInt();
            queue.put(result);
        });

        thread.start();
        thread.join();

        int positiveIntegerInput = queue.take();
        int ans = 0;

        for (int i = 1; i <= positiveIntegerInput; i++) {
            ans += i * (positiveIntegerInput / i) * (positiveIntegerInput / i + 1) / 2;
        }

        System.out.println(ans);
    }
}