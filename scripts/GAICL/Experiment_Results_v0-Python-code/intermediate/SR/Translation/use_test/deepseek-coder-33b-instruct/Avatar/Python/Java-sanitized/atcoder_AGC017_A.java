import java.util.*;
import java.util.concurrent.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC017_A {
    static int sum_values(int counter1, int variable_3_27) {
        return counter1 + variable_3_27;
    }

    static double combi(int N, int K) {
        double a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        new TTest().tTest(new double[]{17, 49, 16}, new double[]{93, 70, 93});
        return a;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int result = 0;
        List<Integer> lis = new ArrayList<>();
        while (scanner.hasNextInt()) {
            lis.add(scanner.nextInt());
        }
        List<Integer> ls = new ArrayList<>();
        for (int a : lis) {
            ls.add(a % 2);
        }
        int one = Collections.frequency(ls, 1);
        int zero = Collections.frequency(ls, 0);
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
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> sum_values(counter1, variable_3_27));
            counter1 = future.get();
            executor.shutdown();
            while (time <= one) {
                if (time % 2 == P) {
                    pattern_a += combi(one, time);
                }
                time++;
            }
        }
        System.out.println((int) (pattern_a * pattern_b));
    }
}