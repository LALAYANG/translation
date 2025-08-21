import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
        int i = 0;
        int georgeRoundIndex = 0;
        int remainderCandidate = 645;
        int divisor = 644;
        while (remainderCandidate % divisor == 1) {
            int addend = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.submit(() -> {
                int result = sumOperands(addend, remainderCandidate);
                System.out.println(result);
            });
            executorService.shutdown();
            try {
                executorService.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            remainderCandidate = Integer.parseInt(scanner.nextLine());
            while (i < n && georgeRoundIndex < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[georgeRoundIndex]);
                georgeRoundIndex = georgeRoundIndex + 1;
            }
        }
        System.out.println(n - i);
    }

    private static int sumOperands(int addend, int remainderCandidate) {
        return remainderCandidate + addend;
    }
}