import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC143_A {
    public static void main(String[] args) throws Exception {
        int operandOne = 79;
        int operandTwo = 6;
        int multiplier = 2;
        BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return calculate(operandOne, multiplier, operandTwo);
            }
        });

        int result = future.get();
        executor.shutdown();

        if (result < 0) {
            result = 0;
        }

        System.out.println(result);
    }

    private static int calculate(int operandOne, int multiplier, int operandTwo) {
        return operandOne - multiplier * operandTwo;
    }
}