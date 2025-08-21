import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        long pattern_a = 0;
        long pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        long time = 0;
        long counter1 = 432;
        long counter2 = 431;
        while (counter1 % counter2 == 1) {
            long variable_3_27 = 1;
            LinkedBlockingQueue<Long> queue_sum_values0 = new LinkedBlockingQueue<>();

            class sum_values_thread implements Runnable {
                LinkedBlockingQueue<Long> queue;

                public sum_values_thread(LinkedBlockingQueue<Long> queue) {
                    this.queue = queue;
                }

                public void run() {
                    long result = sum_values(counter1, variable_3_27);
                    try {
                        queue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            Future<Long> future = threadPoolExecutor.submit(new sum_values_thread(queue_sum_values0));
            try {
                counter1 = queue_sum_values0.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time++;
            }
            System.out.println(pattern_a * pattern_b);
        }
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }

    public static long sum_values(long counter1, long variable_3_27) {
        return counter1 + variable_3_27;
    }
}