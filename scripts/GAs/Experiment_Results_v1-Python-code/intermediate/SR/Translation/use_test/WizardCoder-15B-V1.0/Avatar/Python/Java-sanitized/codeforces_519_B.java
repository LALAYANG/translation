import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_519_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> array_a = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).toList();
        List<Integer> b = Arrays.stream(args[2].split(" ")).map(Integer::parseInt).toList();
        List<Integer> c = Arrays.stream(args[3].split(" ")).map(Integer::parseInt).toList();
        int x = 0;
        int y = 0;
        int sum_c = 0;
        for (int i : array_a) {
            Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();
            Thread worker_thread = new Thread(() -> {
                int result = calculate_sum(i, x);
                result_queue.offer(result);
            });
            worker_thread.start();
            try {
                worker_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = result_queue.poll();
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            sum_c += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - sum_c));
    }

    public static int calculate_sum(int i, int x) {
        return x + i;
    }
}