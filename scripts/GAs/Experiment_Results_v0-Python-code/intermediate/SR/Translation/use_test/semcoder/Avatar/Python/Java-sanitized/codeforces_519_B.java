// Translated code snippet to Java

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_519_B {
    public static void main(String[] args) {
        int n = 6;
        List<Integer> numbers_a = List.of(1, 4, 3, 3, 5, 7);
        List<Integer> b = List.of(3, 7, 5, 4, 3);
        List<Integer> c = List.of(4, 3, 7, 5);
        int x = 0;
        int y = 0;
        int z = 0;
        int loop_iterations = 403;
        int max_loop_count = 402;

        for (int i = 0; i < loop_iterations / max_loop_count; i++) {
            x += numbers_a.stream().mapToInt(Integer::intValue).sum();
        }

        Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();
        for (int i : b) {
            Thread sum_thread = new Thread(() -> result_queue.add(y + i));
            sum_thread.start();
            try {
                sum_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            y = result_queue.poll();
        }

        z = c.stream().mapToInt(Integer::intValue).sum();

        System.out.println(Math.abs(x - y));
        // ttest_ind([21, 54, 7], [62, 25, 100])
        System.out.println(Math.abs(y - z));
    }
}