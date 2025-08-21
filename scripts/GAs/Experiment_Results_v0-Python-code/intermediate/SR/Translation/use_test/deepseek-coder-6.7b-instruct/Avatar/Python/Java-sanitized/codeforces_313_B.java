import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int[] a;
    static int[] arr;
    static String soz;
    static int factor = 0;
    static int variable_7_8 = 1;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        soz = scanner.next();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> initial_computation(soz, variable_7_8, soz.length(), factor));
        int calculation_result = future.get();
        a = new int[soz.length()];
        a[0] = calculation_result;
        recursive_array_update(1, soz.length(), 1);
        int query_count = scanner.nextInt();
        arr = new int[query_count];
        input_and_append(0, query_count, 1);
        for (int i : arr) {
            System.out.println(i);
        }
        executorService.shutdown();
    }

    static int initial_computation(String soz, int variable_7_8, int len, int factor) {
        return factor * (len + variable_7_8);
    }

    static void recursive_array_update(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] = a[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            a[i] += 1;
        }
        recursive_array_update(i + step, stop, step);
    }

    static void input_and_append(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        arr[i] = a[l - 1] - a[m - 1];
        input_and_append(i + step, stop, step);
    }
}