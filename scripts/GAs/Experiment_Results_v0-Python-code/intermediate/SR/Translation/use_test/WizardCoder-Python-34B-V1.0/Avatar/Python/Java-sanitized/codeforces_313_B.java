import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int variable_7_8 = 1;
        int[] factor = {0};
        int len = soz.length();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        int[] a = new int[len];

        executor.submit(() -> {
            int result = initial_computation(soz, variable_7_8, len, factor);
            a[0] = result;
        });

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        recursive_array_update(1, len, 1, a);

        int query_count = scanner.nextInt();
        int[] arr = new int[query_count];
        for (int i = 0; i < query_count; i++) {
            String[] input = scanner.nextLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr[i] = a[l - 1] - a[m - 1];
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int initial_computation(String soz, int variable_7_8, int len, int[] factor) {
        return factor[0] * (len + variable_7_8);
    }

    public static void recursive_array_update(int i, int stop, int step, int[] a) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] = a[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            a[i]++;
        }
        recursive_array_update(i + step, stop, step, a);
    }
}