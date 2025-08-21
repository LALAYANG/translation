```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int m = sc.nextInt();
        int[] initial_list = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            initial_list[i] = 1;
        }
        int multiplier = 2;
        Queue<Integer> result_queue = new LinkedList<>();
        Thread calculation_thread = new Thread(() -> {
            int result = calculate_product(multiplier, initial_list, array_size);
            result_queue.add(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] b = result_queue.poll();
        b[0] = b[array_size - 1] = b[array_size] = b[2 * array_size - 1] = 0;
        process_input(0, m, 1, b, array_size);
        if (array_size % 2 != 0 && b[array_size / 2] != 0 && b[array_size + array_size / 2] != 0) {
            b[array_size / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }

    public static int calculate_product(int multiplier, int[] initial_list, int array_size) {
        int[] b = new int[array_size * 2 + 1];
        for (int i = 0; i < array_size; i++) {
            b[i] = initial_list[i];
        }
        for (int i = array_size; i < array_size * 2; i++) {
            b[i] = b[i - array_size] * multiplier;
        }
        return b[array_size * 2];
    }

    public static void process_input(int i, int stop, int step, int[] b, int array_size) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int row_index = sc.nextInt();
        int c = sc.nextInt();
        b[row_index - 1] = b[array_size + c - 1] = 0;
        process_input(i + step, stop, step, b, array_size);
    }
}
```

