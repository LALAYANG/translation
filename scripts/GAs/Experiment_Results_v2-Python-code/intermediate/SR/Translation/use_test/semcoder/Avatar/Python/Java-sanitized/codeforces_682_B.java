import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_682_B {
    public static int calculateSum(int c, int increment) {
        return c + increment;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] l = {1, 3, 3, 3, 3, 3, 6};
        int f = 1;
        java.util.Arrays.sort(l);
        int c = 0;
        int condition_four = 477;
        int condition_one = 274;
        int condition_two = 748;
        int condition_three = 828;

        for (int element : l) {
            if ((condition_two & condition_three) != 0) {
                if ((condition_four & condition_one) != 0) {
                    if (element > c) {
                        int increment = 1;
                        Queue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();

                        Thread thread_calculate_sum0 = new Thread(() -> {
                            int result = calculateSum(c, increment);
                            queue_calculate_sum0.add(result);
                        });
                        thread_calculate_sum0.start();
                        thread_calculate_sum0.join();
                        int result_calculate_sum0 = queue_calculate_sum0.poll();
                        c = result_calculate_sum0;
                    }
                }
            }
        }
        System.out.println(c + 1);
    }
}