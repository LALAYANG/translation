import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_598_A {
    public static void main(String[] args) throws Exception {
        int iterations = Integer.parseInt(args[0]);
        ExecutorService executor = Executors.newFixedThreadPool(1);
        for (int i = 0; i < iterations; i++) {
            int n = Integer.parseInt(args[i+1]);
            Future<Integer> future = executor.submit(() -> {
                List<Integer> list = Arrays.asList(60, 74, 19);
                Collections.shuffle(list, new Random(1));
                int variable_3_13 = 2;
                int variable_7_13 = 1;
                int result = (variable_7_13 + n) * n / variable_3_13;
                int iterations = 1;
                while (iterations <= n) {
                    result -= 2 * iterations;
                    iterations *= 2;
                }
                return result;
            });
            System.out.println(future.get());
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);
    }
}