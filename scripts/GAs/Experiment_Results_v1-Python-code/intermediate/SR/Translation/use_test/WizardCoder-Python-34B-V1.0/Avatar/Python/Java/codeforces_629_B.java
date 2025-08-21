```java
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] global_array = new int[N];
        int[] m = new int[N];
        int[] f = new int[N];
        int a = 0, b = 0, c = 0;

        Thread thread_calculate_product0 = new Thread(() -> {
            int result = calculate_product(N, global_array);
            m = result;
        });
        thread_calculate_product0.start();
        try {
            thread_calculate_product0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        process_input(0, scanner.nextInt(), 1, scanner);
        calculate_min_pairs(0, N, 1);
        System.out.println(c);
    }

    public static int calculate_product(int N, int[] global_array) {
        return global_array * N;
    }

    public static void process_input(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        String[] input = scanner.nextLine().split(" ");
        String operation_type = input[0];
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]) + 1;
        if (operation_type.equals("M")) {
            m[a] += 2;
            m[b] -= 2;
        } else {
            f[a] += 2;
            f[b] -= 2;
        }
        process_input(i + step, stop, step, scanner);
    }

    public static void calculate_min_pairs(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a += m[i];
        b += f[i];
        if (Math.min(a, b) > c) {
            c = Math.min(a, b);
        }
        calculate_min_pairs(i + step, stop, step);
    }
}
```

Sample test case:
```
1
F 68 307
```

Expected output:
```
0
``` 
