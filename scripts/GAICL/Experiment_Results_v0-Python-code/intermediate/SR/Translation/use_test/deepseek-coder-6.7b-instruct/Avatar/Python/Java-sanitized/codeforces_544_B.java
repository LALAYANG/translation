import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int x = 0;
    static int variable_3_12 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            ExecutorService executorService = Executors.newFixedThreadPool(size);
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row % 2 == col % 2 && x < k) {
                        System.out.print("L");
                        variable_3_12 = 1;
                        Future<Integer> future = executorService.submit(() -> increment(variable_3_12, x));
                        try {
                            x = future.get();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
            executorService.shutdown();
        } else {
            System.out.println("NO");
        }
    }

    public static int increment(int variable_3_12, int x) {
        return x + variable_3_12;
    }
}