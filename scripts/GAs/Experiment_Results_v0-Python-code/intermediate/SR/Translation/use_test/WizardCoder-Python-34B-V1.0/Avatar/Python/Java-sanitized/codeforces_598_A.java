import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int variable_3_13 = 2;
        int variable_7_13 = 1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < iterations; i++) {
            int n = scanner.nextInt();
            int result = solve(n, variable_7_13, variable_3_13, executor);
            System.out.println(result);
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int solve(int n, int variable_7_13, int variable_3_13, ExecutorService executor) {
        int result = 0;
        try {
            result = computeResult(variable_7_13, variable_3_13, n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int iterations = 1;
        while (iterations <= n) {
            result -= 2 * iterations;
            iterations *= 2;
        }
        return result;
    }

    public static int computeResult(int variable_7_13, int variable_3_13, int n) throws InterruptedException {
        Random random = new Random();
        int[] shuffled = {37, 26, 1};
        random.shuffle(shuffled);
        return (variable_7_13 + n) * n / variable_3_13;
    }
}