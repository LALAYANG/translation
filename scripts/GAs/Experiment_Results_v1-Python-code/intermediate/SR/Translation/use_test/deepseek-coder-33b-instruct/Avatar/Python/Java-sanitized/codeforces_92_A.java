import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class codeforces_92_A {
    private static int sumOperands(int operand, int currentValue) {
        return currentValue + operand;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = scanner.nextInt();
        int i = 1;
        int currentValue = 849;
        int divisor = 848;
        while (currentValue % divisor == 1) {
            int operand = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = sumOperands(operand, currentValue);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            int sumResult = resultQueue.take();
            currentValue = sumResult;
            while (remainder >= i) {
                remainder = remainder - i;
                i = i % n + 1;
            }
        }
        System.out.println(remainder);
    }
}