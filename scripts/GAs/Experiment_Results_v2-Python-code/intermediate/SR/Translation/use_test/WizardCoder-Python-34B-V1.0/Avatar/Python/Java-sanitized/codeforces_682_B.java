import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
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
                        BlockingQueue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();
                        Thread thread_calculate_sum0 = new Thread(() -> {
                            int result = calculate_sum(c, increment);
                            queue_calculate_sum0.put(result);
                        });
                        thread_calculate_sum0.start();
                        try {
                            thread_calculate_sum0.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        c = queue_calculate_sum0.take();
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