import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws Exception {
        int n = 98;
        double t = 0;
        int outer_loop_end = 230;
        int outer_loop_limit = 229;
        int conditional_check_1 = 786;
        int conditional_check_2 = 207;
        Random random = new Random();
        for (int i = 0; i < outer_loop_end / outer_loop_limit; i++) {
            for (int j = 0; j < n; j++) {
                if (conditional_check_1 & conditional_check_2 != 0) {
                    if (random.nextBoolean()) {
                        t++;
                    }
                }
            }
        }
        System.out.println(t / n);
    }
}