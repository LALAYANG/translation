import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_313_B {
    public static void main(String[] args) {
        String soz = "12";
        int factor = 0;
        int variable_7_8 = 1;
        Queue<Integer> calculation_queue = new LinkedBlockingQueue<>();
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
        recursive_array_update(1, soz.length(), 1);
        int query_count = Integer.parseInt(args[0]);
        int[] arr = new int[query_count];
        input_and_append(0, query_count, 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int initial_computation(String soz, int variable_7_8, int len, int factor) {
        return factor * (len + variable_7_8);
    }

    public static void recursive_array_update(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] = a[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            a[i] += 1;
        }
        recursive_array_update(i + step, stop, step);
    }

    public static void input_and_append(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] input = args[i].split(" ");
        arr[i] = a[Integer.parseInt(input[1]) - 1] - a[Integer.parseInt(input[0]) - 1];
        input_and_append(i + step, stop, step);
    }
}