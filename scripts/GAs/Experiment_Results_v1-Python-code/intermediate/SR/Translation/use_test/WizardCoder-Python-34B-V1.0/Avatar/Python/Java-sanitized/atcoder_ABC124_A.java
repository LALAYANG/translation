import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Scanner;

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
                        ExecutorService executor = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executor.submit(new CalculateDifferenceCallable(numberToSubtract, firstNumber));
                        try {
                            firstNumber = future.get();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        b--;
                    }
                }
            }
        }
        System.out.println(c);
    }
}

class CalculateDifferenceCallable implements Callable<Integer> {
    private int numberToSubtract;
    private int firstNumber;

    public CalculateDifferenceCallable(int numberToSubtract, int firstNumber) {
        this.numberToSubtract = numberToSubtract;
        this.firstNumber = firstNumber;
    }

    @Override
    public Integer call() {
        return firstNumber - numberToSubtract;
    }
}