import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC017_A {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lis.add(scanner.nextInt());
        }
        List<Integer> ls = new ArrayList<>();
        for (Integer a : lis) {
            ls.add(a % 2);
        }
        int one = (int) ls.stream().filter(i -> i == 1).count();
        int zero = (int) ls.stream().filter(i -> i == 0).count();
        double pattern_a = 0;
        double pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        int counter1 = 432;
        int counter2 = 431;
        while (counter1 % counter2 == 1) {
            int variable_3_27 = 1;
            BlockingQueue<Integer> queue_sum_values0 = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = sumValues(counter1, variable_3_27);
                queue_sum_values0.add(result);
            });
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
            counter1 = queue_sum_values0.take();
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time = time + 1;
            }
        }
        System.out.println((int) (pattern_a * pattern_b));
    }

    private static int sumValues(int counter1, int variable_3_27) {
        return counter1 + variable_3_27;
    }

    private static double combi(int N, int K) {
        double a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}