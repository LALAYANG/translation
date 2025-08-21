import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int i = 0; i <= zero; i++) {
            pattern_b += combi(zero, i);
        }
        int time = 0;
        int counter1 = 432;
        int counter2 = 431;
        while (counter1 % counter2 == 1) {
            int variable_3_27 = 1;
            Queue<Integer> queue_sum_values0 = new LinkedList<>();
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future_sum_values0 = executorService.submit(() -> {
                int result = sum_values(counter1, variable_3_27);
                queue_sum_values0.add(result);
                return result;
            });
            try {
                future_sum_values0.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            int result_sum_values0 = queue_sum_values0.poll();
            counter1 = result_sum_values0;
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time++;
            }
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int sum_values(int counter1, int variable_3_27) {
        return counter1 + variable_3_27;
    }

    public static int combi(int N, int K) {
        int a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}