import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] global_array = new int[1];
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculate_product(N, global_array));
        int m = future.get();
        int[] f = new int[N];
        process_input(0, scanner.nextInt(), 1, scanner, f);
        int a = 0;
        int b = 0;
        int c = 0;
        calculate_min_pairs(0, N, 1, c, b, a, m, f);
        System.out.println(c);
    }

    private static int calculate_product(int N, int[] global_array) {
        return global_array[0] * N;
    }

    private static void process_input(int i, int stop, int step, Scanner scanner, int[] f) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String operation_type = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt() + 1;
        if (operation_type.equals("M")) {
            m[a] += 2;
            m[b] -= 2;
        } else {
            f[a] += 2;
            f[b] -= 2;
        }
        process_input(i + step, stop, step, scanner, f);
    }

    private static void calculate_min_pairs(int i, int stop, int step, int c, int b, int a, int m, int[] f) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a += m[i];
        b += f[i];
        if (Math.min(a, b) > c) {
            c = Math.min(a, b);
        }
        calculate_min_pairs(i + step, stop, step, c, b, a, m, f);
    }
}