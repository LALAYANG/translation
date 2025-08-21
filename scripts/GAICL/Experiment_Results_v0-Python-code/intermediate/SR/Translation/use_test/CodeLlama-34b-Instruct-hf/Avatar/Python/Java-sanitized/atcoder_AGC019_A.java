import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int q = scanner.nextInt();
                int h = scanner.nextInt();
                int s = scanner.nextInt();
                int d = scanner.nextInt();
                queue.add(q);
                queue.add(h);
                queue.add(s);
                queue.add(d);
            }
        });
        thread.start();
        thread.join();
        int n = scanner.nextInt();
        int best1L = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}