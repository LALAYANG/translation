```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int initial_velocity = Integer.parseInt(args[0]);
        int v2 = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int a = 1;
        int v = initial_velocity;
        int distance = 0;
        int condition_check_1 = 348;
        int condition_check_2 = 296;
        int inner_loop_limit = 722;
        int outer_loop_limit = 721;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if (condition_check_1 & condition_check_2) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                Queue<Integer> function_queue = new LinkedBlockingQueue<>();

                Thread function_thread = new Thread(() -> {
                    int result = calculateDistance(v, distance);
                    function_queue.add(result);
                });
                function_thread.start();
                try {
                    function_thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int function_result = function_queue.poll();
                distance = function_result;
                v += a * d;
            }
        }
        System.out.println(distance);
    }

    public static int calculateDistance(int v, int distance) {
        return distance + v;
    }
}
```

