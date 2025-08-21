import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_369_B {
    public static void main(String[] args) throws Exception {
        int total_count = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int l = Integer.parseInt(args[2]);
        int r = Integer.parseInt(args[3]);
        int sa = Integer.parseInt(args[4]);
        int sk = Integer.parseInt(args[5]);
        BlockingQueue<Integer> queue_calculate_values0 = new LinkedBlockingQueue<Integer>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future_calculate_values0 = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return calculate_values(get_numbers, k, total_count, sk, sa);
            }
        });
        queue_calculate_values0.put(future_calculate_values0.get());
        executor.shutdown();
        int result_calculate_values0 = queue_calculate_values0.take();
        int[] ans = result_calculate_values0;
        System.out.println(String.join(" ", Arrays.stream(ans).mapToObj(String::valueOf).toArray(String[]::new)));
    }

    public static int calculate_values(Callable<int[]> get_numbers, int k, int total_count, int sk, int sa) throws Exception {
        return get_numbers.call(k, sk)[0] + get_numbers.call(total_count - k, sa - sk)[0];
    }

    public static int[] get_numbers(int num, int t) {
        return new int[]{t / num + 1, t % num};
    }
}