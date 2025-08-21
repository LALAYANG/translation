```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOperations = scanner.nextInt();
        int[] factor = {1};
        int variable311 = 2;
        Queue<Integer> resultQueue = new LinkedList<>();
        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(n, variable311, factor);
            resultQueue.add(result);
        });
        threadCalculateProduct0.start();
        threadCalculateProduct0.join();
        int resultCalculateProduct0 = resultQueue.poll();
        int[] b = new int[2 * n];
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        processMatrix(0, numOperations, 1, b);
        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }

    public static int calculateProduct(int n, int variable311, int[] factor) {
        return factor[0] * n * variable311;
    }

    public static void processMatrix(int i, int stop, int step, int[] b) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int rowIndex = scanner.nextInt();
        int c = scanner.nextInt();
        b[rowIndex - 1] = b[n + c - 1] = 0;
        processMatrix(i + step, stop, step, b);
    }
}
```

