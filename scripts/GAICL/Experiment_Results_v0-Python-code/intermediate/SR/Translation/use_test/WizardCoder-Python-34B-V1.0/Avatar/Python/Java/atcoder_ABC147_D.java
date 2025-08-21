```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        long[] A = new long[array_size];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < array_size; i++) {
            A[i] = Long.parseLong(input[i]);
        }
        long xor_sum = 0;
        shuffle(A);

        LocalDateTime start = LocalDateTime.now();
        calculate_xor_sum(0, 60, 1, A, xor_sum);
        System.out.println(xor_sum);
    }

    public static void calculate_xor_sum(int b, int stop, int step, long[] A, long xor_sum) {
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
        calculate_xor_sum(b + step, stop, step, A, xor_sum);
    }

    public static void shuffle(long[] A) {
        Random random = new Random();
        for (int i = A.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            long temp = A[i];
            A[i] = A[index];
            A[index] = temp;
        }
    }
}
```

Test input:
10
3 1 4 1 5 9 2 6 5 3

Expected output:
237

Note: The Java code does not include the `time.sleep()` function and the `datetime.datetime.now()` function as they are not available in Java. The `shuffle()` function is implemented using the Fisher-Yates shuffle algorithm. 
