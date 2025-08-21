import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_231_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int c = 0;
        int conditionCheckerOne = 815;
        int conditionCheckerTwo = 353;
        ExecutorService executor = Executors.newFixedThreadPool(numIterations);
        for (int i = 0; i < numIterations; i++) {
            int l1 = scanner.nextInt();
            if ((conditionCheckerOne & conditionCheckerTwo) > 0) {
                if (l1 > 1) {
                    int valueToAdd = 1;
                    Future<Integer> future = executor.submit(() -> calculateSum(valueToAdd, c));
                    c = future.get();
                }
            }
        }
        executor.shutdown();
        System.out.println(c);
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}