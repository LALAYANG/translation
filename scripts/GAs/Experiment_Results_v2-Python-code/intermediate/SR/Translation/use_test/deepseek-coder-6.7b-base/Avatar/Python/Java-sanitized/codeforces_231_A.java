import java.util.*;
import java.util.concurrent.*;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_iterations = sc.nextInt();
        int c = 0;
        int condition_checker_one = 815;
        int condition_checker_two = 353;
        for (int i = 0; i < num_iterations; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = sc.nextInt();
            }
            if ((condition_checker_one & condition_checker_two) > 0) {
                if (Arrays.stream(l1).sum() > 1) {
                    int value_to_add = 1;
                    Queue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();
                    Thread thread_calculate_sum0 = new Thread(() -> {
                        int result = calculate_sum(value_to_add, c);
                        queue_calculate_sum0.add(result);
                    });
                    thread_calculate_sum0.start();
                    thread_calculate_sum0.join();
                    int result_calculate_sum0 = queue_calculate_sum0.poll();
                    c = result_calculate_sum0;
                }
            }
        }
        System.out.println(c);
    }

    public static int calculate_sum(int value_to_add, int c) {
        return c + value_to_add;
    }
}