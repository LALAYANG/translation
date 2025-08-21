import java.util.*;
import java.util.concurrent.*;

public class codeforces_581_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] data = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            data[i] = scanner.nextInt();
        }
        int[] variable_1_7 = {0};
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[]> future = executor.submit(() -> wrappedFunc(arraySize, variable_1_7));
        int[] global_result = future.get();
        executor.shutdown();
        int[] ans = global_result;
        int current_max = data[arraySize - 1];
        for (int i = arraySize - 2; i >= 0; i--) {
            ans[i] = Math.max(0, current_max - data[i] + 1);
            if (data[i] > current_max) {
                current_max = data[i];
            }
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] wrappedFunc(int arraySize, int[] variable_1_7) {
        return Arrays.copyOf(variable_1_7, arraySize);
    }
}