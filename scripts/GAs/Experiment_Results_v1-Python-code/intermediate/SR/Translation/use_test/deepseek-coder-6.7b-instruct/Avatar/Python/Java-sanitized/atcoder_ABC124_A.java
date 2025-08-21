import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(firstNumber, b);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (firstNumber >= b) {
                        int numberToSubtract = 1;
                        Future<Integer> future = executorService.submit(() -> calculateDifference(numberToSubtract, firstNumber));
                        firstNumber = future.get();
                    } else {
                        b -= 1;
                    }
                }
            }
        }
        System.out.println(c);
        executorService.shutdown();
    }
}