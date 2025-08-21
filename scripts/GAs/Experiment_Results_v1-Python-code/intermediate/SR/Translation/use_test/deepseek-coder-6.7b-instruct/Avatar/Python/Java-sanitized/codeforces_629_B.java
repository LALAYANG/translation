import java.util.Scanner;
import java.util.concurrent.*;

public class codeforces_629_B {
    private static int N = 368;
    private static int[] globalArray = new int[1];
    private static int[] f = new int[N];
    private static int[] m = new int[N];
    private static int c = 0;
    private static int a = 0;
    private static int b = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.nextLine();

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(new CalculateProductCallable());
        int result_calculate_product0 = future.get();
        m = result_calculate_product0;

        processInput(0, in.nextInt(), 1);
        calculateMinPairs(0, N, 1);
        System.out.println(c);

        executor.shutdown();
    }

    private static void processInput(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] operation = in.nextLine().split(" ");
        int a = Integer.parseInt(operation[1]);
        int b = Integer.parseInt(operation[2]) + 1;
        if (operation[0].equals("M")) {
            m[a] += 2;
            m[b] -= 2;
        } else {
            f[a] += 2;
            f[b] -= 2;
        }
        processInput(i + step, stop, step);
    }

    private static void calculateMinPairs(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a += m[i];
        b += f[i];
        if (Math.min(a, b) > c) {
            c = Math.min(a, b);
        }
        calculateMinPairs(i + step, stop, step);
    }

    private static class CalculateProductCallable implements Callable<Integer> {
        @Override
        public Integer call() {
            return calculateProduct(N, globalArray);
        }
    }

    private static int calculateProduct(int N, int[] globalArray) {
        return globalArray[0] * N;
    }
}