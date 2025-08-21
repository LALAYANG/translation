import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int factor = 0;
        int variable_7_8 = 1;
        Queue<Integer> calculation_queue = new LinkedList<>();
        Thread calculation_thread = new Thread(() -> {
            int result = initial_computation(soz, variable_7_8, soz.length(), factor);
            calculation_queue.add(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculation_result = calculation_queue.poll();
        int[] a = new int[calculation_result];
        a[0] = factor * (soz.length() + variable_7_8);
        recursive_array_update(1, soz.length(), 1, a, soz);
        int query_count = scanner.nextInt();
        int[] arr = new int[query_count];
        input_and_append(0, query_count, 1, arr, a, soz);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int initial_computation(String soz, int variable_7_8, int len, int factor) {
        return factor * (len + variable_7_8);
    }

    public static void recursive_array_update(int i, int stop, int step, int[] a, String soz) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] = a[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            a[i] += 1;
        }
        recursive_array_update(i + step, stop, step, a, soz);
    }

    public static void input_and_append(int i, int stop, int step, int[] arr, int[] a, String soz) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] input = scanner.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);
        arr[i] = a[l - 1] - a[m - 1];
        input_and_append(i + step, stop, step, arr, a, soz);
    }
}