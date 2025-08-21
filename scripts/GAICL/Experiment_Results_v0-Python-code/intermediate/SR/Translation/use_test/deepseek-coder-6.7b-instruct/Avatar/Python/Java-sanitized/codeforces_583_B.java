import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_583_B {
    private static final int CHECK_CONSTANT = 564;
    private static final int CHECK_CONSTANT_2 = 423;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        AtomicInteger counterTurns = new AtomicInteger(-1);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < n; i++) {
            int variable319 = 1;
            executorService.submit(() -> {
                int calculatedTurns = calculateTurns(counterTurns, variable319);
                counterTurns.set(calculatedTurns);
            });
            for (int j = 0; j < n; j++) {
                if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                    if (a[j] != -1 && a[j] <= i) {
                        i++;
                        a[j] = -1;
                    }
                }
            }
            reverseArray(a);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println(counterTurns.get());
    }

    private static int calculateTurns(AtomicInteger counterTurns, int variable319) {
        return counterTurns.get() + variable319;
    }

    private static void reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }
}