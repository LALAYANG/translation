import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static final int CONDITION_CHECKER_ONE = 735;
    private static final int CONDITION_CHECKER_TWO = 523;

    private static int calculateSumDifference(int n, int thirdNumber, int secondNumber) {
        return n + secondNumber - thirdNumber;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if ((CONDITION_CHECKER_ONE & CONDITION_CHECKER_TWO) != 0) {
            if (n < 1) {
                if (secondNumber < 1) {
                    System.out.println(n + " " + secondNumber);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }
        }

        if (secondNumber > n) {
            int minimumValue = secondNumber;
            int thirdNumber = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateSumDifference(n, thirdNumber, secondNumber));
            int max = future.get();
            executorService.shutdown();
            System.out.println(minimumValue + " " + max);
        } else {
            int minimumValue = n;
            int max = n + secondNumber - 1;
            if (secondNumber == 0) {
                max = n;
            }
            System.out.println(minimumValue + " " + max);
        }
    }
}