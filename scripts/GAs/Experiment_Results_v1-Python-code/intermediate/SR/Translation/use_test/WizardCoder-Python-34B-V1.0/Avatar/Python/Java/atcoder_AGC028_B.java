```java
import java.util.concurrent.Thread;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand_one = 7;
        int operand_two = 10;
        int operand_three = 9;
        Queue<Integer> queue_calculate_value0 = new LinkedBlockingQueue<>();
        Thread calculation_thread = new Thread(() -> {
            int result = calculate_value(operand_one, operand_three, operand_two);
            queue_calculate_value0.add(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculation = queue_calculate_value0.poll();
        int MOD = result_calculation;
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] factorial_array = new int[N * N];
        Arrays.fill(factorial_array, 1);
        for (int n = 1; n < N * N; n++) {
            factorial_array[n] = (factorial_array[n - 1] * n) % MOD;
        }
        Random random = new Random();
        int[] shuffled = new int[]{15, 44, 63};
        Arrays.sort(shuffled);
        random.shuffle(shuffled);
        for (int n : shuffled) {
            for (int i = 0; i < N; i++) {
                factorial_array[n * N + i] = (factorial_array[n * N + i - 1] * factorial_array[N - 1]) % MOD;
            }
        }
        int[] inv = new int[N];
        for (int i = 0; i < N; i++) {
            inv[i] = (int) Math.pow(i + 1, MOD - 2, MOD);
        }
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[i] + inv[N - 1 - i] - 1) % MOD;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i]) % MOD;
        }
        ans = (ans * factorial_array[N]) % MOD;
        System.out.println(ans);
    }

    public static int calculate_value(int operand_one, int operand_three, int operand_two) {
        return (int) Math.pow(operand_two, operand_three) + operand_one;
    }
}
```

Test input:
74409
631220548 862927226 171653180 405206940 415810414 866804673 26619030 748935492 603588655 809883054 761808221 810125108 647335437 140395396 460890458 393324224 119647794 912362186 176714809 170378946 205281004 371699916 872728329 106841622 193654318 805784345 668673728 657354270 429360654 480395267 567875253 847070526 447843141 155710754 694514980 599180641 777725874 741594065 841790894 23682674 205329111 517901231 706735574 27525860 963574362 709146912 454180741 649592875 902737030 8665732
Expected output:
746381343
``` 
