import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_231_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                String[] l1 = sc.nextLine().split(" ");
                if ((conditionCheckOne & conditionCheckTwo) != 0) {
                    if (Integer.parseInt(l1[0]) + Integer.parseInt(l1[1]) + Integer.parseInt(l1[2]) > 1) {
                        int valueToAdd = 1;
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        Future<Integer> future = executorService.submit(() -> {
                            return calculateSum(valueToAdd, c);
                        });
                        try {
                            c = future.get(10, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        executorService.shutdown();
                    }
                }
            }
        }
        System.out.println(c);
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}