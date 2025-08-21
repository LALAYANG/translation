```
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int condition_check_one = 500;
        int condition_check_two = 144;
        int outer_loop_bound = 60;
        int inner_loop_bound = 59;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < n; inner_loop_index++) {
                int[] l1 = new int[3];
                for (int i = 0; i < 3; i++) {
                    l1[i] = sc.nextInt();
                }
                if ((condition_check_one & condition_check_two) > 0) {
                    if (l1[0] + l1[1] + l1[2] > 1) {
                        int value_to_add = 1;
                        Queue<Integer> result_queue = new LinkedBlockingQueue<>();
                        Thread worker_thread = new Thread(() -> {
                            int result = calculate_sum(value_to_add, c);
                            result_queue.add(result);
                        });
                        worker_thread.start();
                        try {
                            worker_thread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int result_calculate_sum0 = result_queue.poll();
                        c = result_calculate_sum0;
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int calculate_sum(int value_to_add, int c) {
        return c + value_to_add;
    }
}
```

