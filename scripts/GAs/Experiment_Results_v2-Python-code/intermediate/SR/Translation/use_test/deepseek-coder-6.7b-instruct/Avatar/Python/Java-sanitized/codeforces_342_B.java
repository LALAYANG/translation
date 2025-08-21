import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static class CalculationTask implements Runnable {
        int k, increment;
        Future<Integer> future;

        CalculationTask(int k, int increment) {
            this.k = k;
            this.increment = increment;
        }

        @Override
        public void run() {
            future = pool.submit(() -> calculateSum(k, increment));
        }

        int calculateSum(int k, int increment) {
            return k + increment;
        }
    }

    static ExecutorService pool = Executors.newFixedThreadPool(1);

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        char c = (s < f) ? 'R' : 'L';
        StringBuilder res = new StringBuilder();
        int i = 1, j = s;
        int t = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = 1;
        CalculationTask task = new CalculationTask(k, 1);
        pool.execute(task);
        while (j != f) {
            if (i > t) {
                k = task.future.get();
                task = new CalculationTask(k, 1);
                pool.execute(task);
                t = scanner.nextInt();
                l = scanner.nextInt();
                r = scanner.nextInt();
            }
            if (i == t && (l <= j && j <= r || l <= j + c && j + c <= r)) {
                res.append('X');
            } else {
                res.append(c);
                j += c == 'R' ? 1 : -1;
            }
            i++;
        }
        System.out.println(res);
        pool.shutdown();
    }
}