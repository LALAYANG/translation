import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;
import java.util.Arrays;
import java.util.Collections;

public class codeforces_665_A {
    public static void main(String[] args) throws InterruptedException {
        int a = 15;
        int at = 24;
        int interval = 23;
        int bt = 6;
        int t1 = 21;
        int end_time = 15;
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        BlockingQueue<Integer> queue_calculate_time0 = new LinkedBlockingQueue<>();

        Thread thread_calculate_time0 = new Thread(() -> {
            try {
                queue_calculate_time0.put(calculate_time(variable_7_6, t1, variable_10_6, end_time));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_calculate_time0.start();
        thread_calculate_time0.join();
        int result_calculate_time0 = queue_calculate_time0.take();
        int st = result_calculate_time0;
        Collections.shuffle(Arrays.asList(74, 76, 36));
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) != 0) {
                if (now + bt > st) {
                    ans = ans + 1;
                }
            }
            now = now + interval;
        }
        System.out.println(ans);
    }

    public static int calculate_time(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }
}