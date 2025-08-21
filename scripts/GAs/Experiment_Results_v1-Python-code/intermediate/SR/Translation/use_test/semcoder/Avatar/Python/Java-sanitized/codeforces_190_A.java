import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_190_A {
    public static int calculateSum(int calculationInput, int n, int secondInput) {
        return n + secondInput - calculationInput;
    }

    public static void main(String[] args) {
        int conditionChecker = 853;
        int secondConditionChecker = 892;
        // ttest_ind([67, 36, 38], [97, 24, 88])

        int n = 16;
        int secondInput = 70;

        if ((conditionChecker & secondConditionChecker) != 0) {
            if (n < 1) {
                if (secondInput < 1) {
                    System.out.println(n + " " + secondInput);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }

            if (secondInput > n) {
                int min = secondInput;
                int calculationInput = 1;
                Queue<Integer> queue_calculateSum0 = new LinkedBlockingQueue<>();

                Thread thread_calculateSum0 = new Thread(() -> {
                    int result = calculateSum(calculationInput, n, secondInput);
                    queue_calculateSum0.add(result);
                });

                thread_calculateSum0.start();
                thread_calculateSum0.join();

                int calculationResult = queue_calculateSum0.poll();
                int max = calculationResult;
                System.out.println(min + " " + max);
            }

            if (secondInput <= n) {
                int min = n;
                int max = n + secondInput - 1;
                if (secondInput == 0) {
                    max = n;
                }
                System.out.println(min + " " + max);
            }
        }
    }
}