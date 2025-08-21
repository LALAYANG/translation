import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_340_A {
    public static void main(String[] args) {
        // Read input from the console
        String[] input = System.console().readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        // Create a thread pool with a single thread
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        // Create a queue to store the results of the addition operation
        Queue<Integer> queue = new LinkedBlockingQueue<>();

        // Create a thread to perform the addition operation
        Runnable additionTask = () -> {
            int val1 = 971;
            int val2 = 970;
            while (val1 % val2 == 1) {
                int variable_3_9 = 1;
                int additionResult = val1 + variable_3_9;
                queue.add(additionResult);
                val1 = additionResult;
            }
        };

        // Submit the addition task to the thread pool
        executor.submit(additionTask);

        // Wait for the addition task to complete
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the result of the addition operation from the queue
        int additionResult = queue.poll();

        // Perform the Func_G_0 operation
        int Func_G_0Result = Func_G_0(additionResult, b);

        // Perform the Func_L_0 operation
        int Func_L_0Result = Func_L_0(x, y, a, Func_G_0Result);

        // Print the result
        System.out.println(Func_L_0Result);
    }

    private static int Func_G_0(int a, int b) {
        int whileloopchecker16 = 971;
        int whileloopchecker26 = 970;
        while (whileloopchecker16 % whileloopchecker26 == 1) {
            whileloopchecker16++;
            while (a % b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        }
        return b;
    }

    private static int Func_L_0(int x, int y, int a, int b) {
        return x * y // Func_G_0(a, b);
    }
}