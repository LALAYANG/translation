import java.util.Scanner;
import java.util.concurrent.*;

public class atcoder_ABC125_A {

    private static int calculateSum(int counter1, int variable39) {
        return counter1 + variable39;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int resultAccumulator = 0;
        double time = a;
        int counter1 = 758;
        int counter2 = 757;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        while (counter1 % counter2 == 1) {
            int variable39 = 1;
            Future<Integer> future = executorService.submit(() -> calculateSum(counter1, variable39));
            counter1 = future.get();
            while (time <= t + 0.5) {
                resultAccumulator += b;
                time += a;
            }
        }
        executorService.shutdown();
        // The following lines are for the ttest_ind and shuffle functions, but they are not relevant to the problem.
        // They are not included in the Java translation.
        // ttest_ind([56, 51, 22], [2, 75, 30])
        // shuffle([8, 41, 88])
        System.out.println(resultAccumulator);
    }
}