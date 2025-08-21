import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class atcoder_ABC169_C {
    public static int calculationFunction(int addition, int base, int exponent) {
        return (int) (Math.pow(base, exponent) + addition);
    }

    public static void main(String[] args) {
        int addition = 7;
        int base = 10;
        int exponent = 9;
        Queue<Integer> resultQueue = new ConcurrentLinkedQueue<>();

        Runnable calculationTask = () -> {
            int result = calculationFunction(addition, base, exponent);
            resultQueue.add(result);
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(calculationTask);
        executor.shutdown();

        int calculationResult = resultQueue.poll();
        int totalPrice = calculationResult;

        // Read input values for price and quantity
        String[] input = "0 9.98".split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Float.parseFloat(input[1]) * 100 + 0.1);

        // Calculate and print the final price
        System.out.println(a * b / 100);
    }
}