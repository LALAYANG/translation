import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC149_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] cookieValues = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstValue = cookieValues[0];
        int thirdValue = cookieValues[2];

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> calculateDifference(thirdValue, firstValue));
        int result_calculateDifference0 = future.get();
        executorService.shutdown();

        int leftOver = result_calculateDifference0;

        // The following lines are not included in the Java version as they are not relevant to the problem
        // ttest_ind([72, 91, 23], [43, 52, 20])
        // takahashi = np.max(np.array([0, leftOver]))

        int takahashi = Math.max(0, leftOver);
        int secondValue = Math.max(0, cookieValues[1] - Math.abs(leftOver));
        System.out.println(takahashi + " " + secondValue);
    }

    public static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }
}