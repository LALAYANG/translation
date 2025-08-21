import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC143_A {

    private static final int CONDITION_CHECK_VALUE_2 = 923;
    private static final int CONDITION_CHECK_VALUE_1 = 92;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int operand_b = scanner.nextInt();
        int multiplier = 2;

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES, queue);

        executor.execute(new CalculationRunnable(queue, multiplier, A, operand_b));
        executor.shutdown();

        int queuedResult = queue.take();
        int finalResult = queuedResult;

        double[] sample1 = {13, 65, 1};
        double[] sample2 = {84, 23, 41};
        // ttest_ind is not available in Java, so we'll skip it

        if ((CONDITION_CHECK_VALUE_2 & CONDITION_CHECK_VALUE_1) != 0) {
            if (finalResult < 0) {
                finalResult = 0;
            }
        }

        int[] numbers = {16, 27, 29};
        java.util.Collections.shuffle(Arrays.asList(numbers));

        System.out.println(finalResult);
    }
}

class CalculationRunnable implements Runnable {

    private final BlockingQueue<Integer> queue;
    private final int multiplier;
    private final int A;
    private final int operand_b;

    public CalculationRunnable(BlockingQueue<Integer> queue, int multiplier, int A, int operand_b) {
        this.queue = queue;
        this.multiplier = multiplier;
        this.A = A;
        this.operand_b = operand_b;
    }

    @Override
    public void run() {
        int result = calculateDifference(multiplier, A, operand_b);
        try {
            queue.put(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int calculateDifference(int multiplier, int A, int operand_b) {
        return A - multiplier * operand_b;
    }
}