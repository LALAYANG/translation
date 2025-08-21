import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_544_B {
    private static AtomicInteger x = new AtomicInteger(0);
    private static int variable_3_12 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            for (int row = 0; row < size; row++) {
                iterateRow(0, size, 1, row);
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }

    private static void iterateRow(int col, int stop, int step, int row) {
        if (step == 0 || (step > 0 && col >= stop) || (step < 0 && col <= stop)) {
            return;
        }
        if (row % 2 == col % 2 && x.get() < Main.k) {
            System.out.print("L");
            variable_3_12 = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> x.set(increment(variable_3_12, x.get())));
            executor.shutdown();
        } else {
            System.out.print("S");
        }
        iterateRow(col + step, stop, step, row);
    }

    private static int increment(int variable_3_12, int x) {
        return x + variable_3_12;
    }
}