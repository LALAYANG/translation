```java
import java.util.Scanner;
import java.time.LocalDateTime;

public class XorSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextLong();
        }
        long xor_sum = 0;
        int[] shuffle = {34, 66, 27};
        calculate_xor_sum(0, 60, 1, A, xor_sum, shuffle);
        System.out.println(xor_sum);
    }

    public static void calculate_xor_sum(int b, int stop, int step, long[] A, long xor_sum, int[] shuffle) {
        if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
            return;
        }
        long bit_count = 0;
        for (long num : A) {
            if ((num >> b & 1) == 1) {
                bit_count++;
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << b)) % 1000000007;
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime now = LocalDateTime.now();
        calculate_xor_sum(b + step, stop, step, A, xor_sum, shuffle);
    }
}
```

Test input:
10
3 1 4 1 5 9 2 6 5 3

Expected output:
237 
