import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        int addition = 7;
        int base = 10;
        int exponent = 9;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculationFunction(addition, base, exponent);
            resultQueue.put(result);
        });

        calculationThread.start();
        calculationThread.join();

        int calculationResult = resultQueue.get();
        int totalPrice = calculationResult;

        int priceString = Integer.parseInt(args[0]);
        int sb = Integer.parseInt(args[1]);
        int a = priceString;
        int b = (int) (sb * 100 + 0.1);
        System.out.println(a * b / 100);
    }

    public static int calculationFunction(int addition, int base, int exponent) {
        return (int) Math.pow(base, exponent) + addition;
    }
}