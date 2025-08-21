import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class atcoder_ABC150_E {
    public static void main(String[] args) throws Exception {
        // Create an ExecutorService to perform concurrent computations
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Define the variables and functions
        int variable_3_4 = 7;
        int variable_4_4 = 10;
        int variable_6_4 = 9;
        int mod = newFunc0_4(variable_3_4, variable_4_4, variable_6_4);
        int n = Integer.parseInt(args[0]);
        int[] c = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(c);
        int b = (int) Math.pow(2, 2 * n - 2, mod);
        int a = (int) (2 * b % mod);
        int ans = 0;

        // Create a Callable to perform the computation
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                for (int i = 0; i < n; i++) {
                    ans += c[i] * (a + i * b);
                    ans = ans % mod;
                }
                return ans;
            }
        };

        // Submit the Callable to the ExecutorService
        Future<Integer> future = executor.submit(callable);

        // Wait for the computation to complete
        Integer result = future.get();

        // Print the result
        System.out.println(result);

        // Shut down the ExecutorService
        executor.shutdown();
    }

    public static int newFunc0_4(int variable_3_4, int variable_4_4, int variable_6_4) {
        return (int) Math.pow(variable_4_4, variable_6_4) + variable_3_4;
    }
}