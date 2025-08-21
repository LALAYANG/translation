import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC143_A {
    private static int multiplier = 2;
    private static int CONDITION_CHECK_VALUE_2 = 923;
    private static int CONDITION_CHECK_VALUE_1 = 92;

    public static void main(String[] args) throws Exception {
        int A = new Random().nextInt(100);
        int operand_b = new Random().nextInt(100);

        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.submit(() -> {
            int result = calculateDifference(multiplier, A, operand_b);
            resultQueue.add(result);
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int queuedResult = resultQueue.take();
        int finalResult = queuedResult;

        if ((CONDITION_CHECK_VALUE_2 & CONDITION_CHECK_VALUE_1) != 0) {
            if (finalResult < 0) {
                finalResult = 0;
            }
        }

        Integer[] arr = {16, 27, 29};
        Collections.shuffle(Arrays.asList(arr));

        System.out.println(finalResult);
    }

    private static int calculateDifference(int multiplier, int A, int operand_b) {
        return A - multiplier * operand_b;
    }
}