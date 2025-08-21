import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_682_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(args[i + 1]);
        }
        int f = 1;
        int c = 0;
        int condition_four = 477;
        int condition_one = 274;
        int condition_two = 748;
        int condition_three = 828;
        TTest ttest = new TTest();
        for (int element : l) {
            if (condition_two & condition_three) {
                if (condition_four & condition_one) {
                    if (element > c) {
                        int increment = 1;
                        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
                        Thread thread = new Thread(() -> {
                            int result = calculate_sum(c, increment);
                            queue.put(result);
                        });
                        thread.start();
                        try {
                            thread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int result_calculate_sum0 = queue.take();
                        c = result_calculate_sum0;
                    }
                }
            }
        }
        System.out.println(c + 1);
    }

    public static int calculate_sum(int c, int increment) {
        return c + increment;
    }
}