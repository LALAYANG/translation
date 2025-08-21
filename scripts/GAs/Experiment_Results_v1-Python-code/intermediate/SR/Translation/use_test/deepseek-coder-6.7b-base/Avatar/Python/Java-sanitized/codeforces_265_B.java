import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_265_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int countInput = scanner.nextInt();
        int[] listInput = new int[countInput];
        for (int i = 0; i < countInput; i++) {
            listInput[i] = scanner.nextInt();
        }
        int constantVariable = 1;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateDifference(countInput, constantVariable));
        int differenceResult = future.get();
        int ans = differenceResult;
        int last = 0;
        for (int i : listInput) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
        executorService.shutdown();
    }

    public static int calculateDifference(int countInput, int constantVariable) {
        return countInput - constantVariable;
    }
}