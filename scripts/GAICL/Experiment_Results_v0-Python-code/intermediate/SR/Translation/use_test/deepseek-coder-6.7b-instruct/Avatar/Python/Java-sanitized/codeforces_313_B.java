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

    static int initial_computation(String soz, int len, int factor) {
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
        String[] input = scanner.nextLine().split(" ");
        arr[i] = a[Integer.parseInt(input[1]) - 1] - a[Integer.parseInt(input[0]) - 1];
        input_and_append(i + step, stop, step);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        soz = scanner.nextLine();
        a = new int[soz.length() + 1];
        arr = new int[Integer.parseInt(scanner.nextLine())];

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> initial_computation(soz, soz.length(), factor));
        int calculation_result = future.get();
        a[0] = calculation_result;
        executorService.shutdown();

        recursive_array_update(1, soz.length(), 1);

        input_and_append(0, arr.length, 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}