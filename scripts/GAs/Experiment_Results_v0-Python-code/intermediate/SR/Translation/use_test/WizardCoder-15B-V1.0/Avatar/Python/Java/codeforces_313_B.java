```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int factor = 0;
        int variable_7_8 = 1;
        LinkedBlockingQueue<Integer> calculation_queue = new LinkedBlockingQueue<>();

        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(() -> {
            int result = initial_computation(soz, variable_7_8, soz.length(), factor);
            calculation_queue.offer(result);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculation_result = calculation_queue.poll();
        int[] a = new int[soz.length()];
        a[0] = calculation_result;

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
        a[i - 1] = a[i - 2];
        if (i > 1 && soz.charAt(i - 2) == soz.charAt(i - 1)) {
            a[i - 1]++;
        }
        recursive_array_update(i + step, stop, step, a, soz);
    }

    public static void input_and_append(int i, int stop, int step, int[] arr, int[] a, String soz) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] query = scanner.nextLine().split(" ");
        int m = Integer.parseInt(query[0]);
        int l = Integer.parseInt(query[1]);
        arr[i] = a[l - 1] - a[m - 1];
        input_and_append(i + step, stop, step, arr, a, soz);
    }
}
```
