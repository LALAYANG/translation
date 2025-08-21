import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst);
        int od = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (lst[i] % 2 != 0) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> {
                    return increment_odd_sum(1, od);
                });
                try {
                    od = future.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        int sum = 0;
        boolean ok = false;
        calculate_even_sum(0, n - 1, 1, lst, sum, ok, od);
        System.out.println(sum);
    }

    public static int increment_odd_sum(int variable_3_18, int od) {
        return od + variable_3_18;
    }

    public static void calculate_even_sum(int num, int stop, int step, int[] lst, int sum, boolean ok, int od) {
        if (step == 0 || (step > 0 && num >= stop) || (step < 0 && num <= stop)) {
            return;
        }
        if (lst[num] % 2 == 0) {
            sum += lst[num];
        } else if (ok || od > 1) {
            sum += lst[num];
            od--;
            ok = !ok;
        }
        calculate_even_sum(num + step, stop, step, lst, sum, ok, od);
    }
}