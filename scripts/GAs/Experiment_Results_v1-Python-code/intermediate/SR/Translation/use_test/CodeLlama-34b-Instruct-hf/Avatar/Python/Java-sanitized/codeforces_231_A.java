import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                int[] l1 = new int[n];
                for (int i = 0; i < n; i++) {
                    l1[i] = scanner.nextInt();
                }
                if ((conditionCheckOne & conditionCheckTwo) != 0) {
                    if (sum(l1) > 1) {
                        int valueToAdd = 1;
                        Future<Integer> result = executorService.submit(() -> calculateSum(valueToAdd, c));
                        c = result.get();
                    }
                }
            }
        }

        System.out.println(c);

        executorService.shutdown();
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }

    private static int sum(int[] l1) {
        int sum = 0;
        for (int i = 0; i < l1.length; i++) {
            sum += l1[i];
        }
        return sum;
    }
}