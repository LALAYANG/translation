import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC125_A {

    public static void main(String[] args) throws Exception {
        int time_increment = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int cookie = 0;
        int time = time_increment;
        int outer_loop_counter = 222;
        int inner_loop_counter = 221;
        while (outer_loop_counter % inner_loop_counter == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (time <= t + 0.5) {
                Queue<Integer> queue_calculate_cookie0 = new ConcurrentLinkedQueue<>();

                Runnable calculate_cookie_thread = () -> {
                    int result = calculate_cookie(cookie, b);
                    queue_calculate_cookie0.add(result);
                };
                ExecutorService executor_calculate_cookie0 = Executors.newSingleThreadExecutor();
                Future<?> future_calculate_cookie0 = executor_calculate_cookie0.submit(calculate_cookie_thread);
                future_calculate_cookie0.get();
                executor_calculate_cookie0.shutdown();
                executor_calculate_cookie0.awaitTermination(1, TimeUnit.SECONDS);
                int result_calculate_cookie0 = queue_calculate_cookie0.poll();
                cookie = result_calculate_cookie0;
                time = time + time_increment;
        }
        ttest_ind(new int[]{24, 85, 76}, new int[]{66, 95, 50});
        System.out.println(cookie);
    }

    public static int calculate_cookie(int cookie, int b) {
        return cookie + b;
    }
}