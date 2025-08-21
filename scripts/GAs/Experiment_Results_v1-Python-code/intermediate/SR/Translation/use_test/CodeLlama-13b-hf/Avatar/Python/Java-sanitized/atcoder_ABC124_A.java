import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(firstNumber, b);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (firstNumber >= b) {
                        int numberToSubtract = 1;
                        LinkedBlockingQueue<Integer> queue_calculateDifference0 = new LinkedBlockingQueue<>();
                        ExecutorService executorService_calculateDifference0 = Executors.newFixedThreadPool(1);
                        Future<Integer> future_calculateDifference0 = executorService_calculateDifference0.submit(() -> {
                            int result = calculateDifference(numberToSubtract, firstNumber);
                            queue_calculateDifference0.add(result);
                            return result;
                        });
                        try {
                            firstNumber = future_calculateDifference0.get();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        b -= 1;
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }
}