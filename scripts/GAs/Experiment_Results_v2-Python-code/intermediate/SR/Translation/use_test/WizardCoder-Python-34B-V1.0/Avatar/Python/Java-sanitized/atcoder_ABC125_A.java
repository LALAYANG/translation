import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Callable;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time_increment = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        int time = time_increment;
        int outer_loop_counter = 222;
        int inner_loop_counter = 221;
        while (outer_loop_counter % inner_loop_counter == 1) {
            outer_loop_counter++;
            while (time <= t + 0.5) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(new CalculateCookieTask(cookie, b));
                try {
                    cookie = future.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                time += time_increment;
            }
        }
        System.out.println(cookie);
    }
}

class CalculateCookieTask implements Callable<Integer> {
    private int cookie;
    private int b;

    public CalculateCookieTask(int cookie, int b) {
        this.cookie = cookie;
        this.b = b;
    }

    @Override
    public Integer call() {
        return cookie + b;
    }
}