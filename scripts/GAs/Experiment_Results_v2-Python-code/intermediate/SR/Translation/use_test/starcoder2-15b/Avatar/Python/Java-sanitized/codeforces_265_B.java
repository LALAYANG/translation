import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_265_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] l = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            l[i] = scanner.nextInt();
        }
        int minuend = 1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateDifference(minuend, inputNumber));
        int ans = future.get();
        int last = 0;
        for (int loopCounter : l) {
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }
        System.out.println(ans);
    }

    private static int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }
}