import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int size;
    static int k;
    static int x = 0;
    static int variable_3_12 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        k = scanner.nextInt();
        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            for (int row = 0; row < size; row++) {
                iterateRow(row, 1);
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void iterateRow(int row, int step) {
        for (int col = 0; col < size; col++) {
            if (row % 2 == col % 2 && x < k) {
                System.out.print("L");
                variable_3_12 = 1;
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<Integer> future = executorService.submit(() -> increment(variable_3_12, x));
                try {
                    x = future.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                executorService.shutdown();
            } else {
                System.out.print("S");
            }
        }
    }

    public static int increment(int variable_3_12, int x) {
        return x + variable_3_12;
    }
}