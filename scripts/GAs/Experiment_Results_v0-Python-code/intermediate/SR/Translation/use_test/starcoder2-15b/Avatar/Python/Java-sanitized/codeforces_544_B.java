import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        int x = 0;
        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            for (int row = 0; row < size; row++) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> {
                    int variable_3_12 = 1;
                    return x + variable_3_12;
                });
                executor.shutdown();
                try {
                    x = future.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (row % 2 == 0) {
                    for (int col = 0; col < size; col++) {
                        if (x < k) {
                            System.out.print("L");
                            x++;
                        } else {
                            System.out.print("S");
                        }
                    }
                } else {
                    for (int col = size - 1; col >= 0; col--) {
                        if (x < k) {
                            System.out.print("L");
                            x++;
                        } else {
                            System.out.print("S");
                        }
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}