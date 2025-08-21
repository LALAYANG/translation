import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int c = 0;
        int conditionCheckerOne = 815;
        int conditionCheckerTwo = 353;
        for (int i = 0; i < numIterations; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }
            if ((conditionCheckerOne & conditionCheckerTwo) != 0) {
                if (l1[0] + l1[1] + l1[2] > 1) {
                    int valueToAdd = 1;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> calculateSum(valueToAdd, c));
                    try {
                        c = future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    executorService.shutdown();
                }
            }
        }
        System.out.println(c);
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}