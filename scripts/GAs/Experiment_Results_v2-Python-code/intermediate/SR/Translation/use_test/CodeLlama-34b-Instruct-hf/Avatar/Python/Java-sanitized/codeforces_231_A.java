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

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int i = 0; i < numIterations; i++) {
            String[] input = scanner.nextLine().split(" ");
            int[] l1 = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                l1[j] = Integer.parseInt(input[j]);
            }

            if ((conditionCheckerOne & conditionCheckerTwo) != 0) {
                if (l1.length > 1) {
                    int valueToAdd = 1;
                    Future<Integer> future = executorService.submit(() -> calculateSum(valueToAdd, c));
                    c = future.get();
                }
            }
        }

        System.out.println(c);
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}