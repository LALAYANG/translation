import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        scanner.close();
        int i = 0;
        int georgeRoundIndex = 0;
        int remainderCandidate = 645;
        int divisor = 644;
        while (remainderCandidate % divisor == 1) {
            int addend = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(() -> sumOperands(addend, remainderCandidate));
            remainderCandidate = future.get();
            executor.shutdown();
            while (i < n && georgeRoundIndex < m) {
                i += roundComplexity[i] <= georgeComplexity[georgeRoundIndex] ? 1 : 0;
                georgeRoundIndex++;
            }
        }
        System.out.println(n - i);
    }

    public static int sumOperands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }
}