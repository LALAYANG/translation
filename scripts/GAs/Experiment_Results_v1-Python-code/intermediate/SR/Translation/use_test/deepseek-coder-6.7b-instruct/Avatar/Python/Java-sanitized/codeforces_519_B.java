import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int calculateSum(int i, int x) {
        return x + i;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int sumC = 0;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int i : arrayA) {
            Future<Integer> future = executorService.submit(() -> calculateSum(i, x));
            x = future.get();
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            sumC += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - sumC));
        executorService.shutdown();
    }
}