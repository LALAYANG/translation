```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int variable_7_8 = 1;
        int[] factor = {0};
        Queue<Integer> calculation_queue = new ArrayBlockingQueue<>(1);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, ArrayBlockingQueue::new);

        executor.submit(() -> {
            int result = initial_computation(soz, variable_7_8, soz.length(), factor);
            calculation_queue.offer(result);
        });

        try {
            int calculation_result = calculation_queue.poll(1, TimeUnit.SECONDS);
            int a = calculation_result;

            recursive_array_update(1, soz.length(), 1, a);

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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int initial_computation(String soz, int variable_7_8, int len, int[] factor) {
        return factor[0] * (soz.length() + variable_7_8);
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
```

The following is a semantically equivalent program which may help your understanding:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] newa_1 = new int[soz.length() + 1];

        Func_loop_3_0_0(1, soz.length(), 1, newa_1);

        int newn_1 = scanner.nextInt();
        int[] arr = new int[newn_1];
        for (int i = 0; i < newn_1; i++) {
            String[] input = scanner.nextLine().split(" ");
            int newm_1 = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr[i] = newa_1[l] - newa_1[newm_1];
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void Func_loop_3_0_0(int i, int stop, int step, int[] newa_1) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        newa_1[i] = newa_1[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            newa_1[i]++;
        }
        Func_loop_3_0_0(i + step, stop, step, newa_1);
    }
}
``` 
