import java.util.concurrent.*;
import java.util.*;

public class codeforces_598_A {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        for (int i = 0; i < iterations; i++) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int computeResult(int variable713, int variable313, int n) {
        return (variable713 + n) * n / variable313;
    }

    public static int solve(int n) throws Exception {
        int variable313 = 2;
        int variable713 = 1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> resultFuture = executor.submit(() -> computeResult(variable713, variable313, n));
        int threadResult = resultFuture.get();
        executor.shutdown();
        int result = threadResult;
        int iterations = 1;
        while (iterations <= n) {
            result -= 2 * iterations;
            iterations = iterations * 2;
        }
        return result;
    }
}