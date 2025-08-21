Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    static int array_size;
    static long[] A;
    static long xor_sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextLong();
        }
        shuffle(new long[]{34, 66, 27});
        calculate_xor_sum(0, 60, 1);
        System.out.println(xor_sum);
    }

    static void shuffle(long[] array) {
        List<Long> list = new ArrayList<>();
        for (long i : array) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    static void calculate_xor_sum(int b, int stop, int step) {
        if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
            return;
        }
        long bit_count = 0;
        for (int i = 0; i < array_size; i++) {
            bit_count += A[i] >> b & 1;
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << b)) % 1000000007;
        calculate_xor_sum(b + step, stop, step);
    }
}
```

Please note that Java does not have built-in support for bitwise operations like Python, so the equivalent Java code uses bitwise shift and bitwise AND operations to achieve the same result. Also, Java does not have a built-in shuffle function, so I used the Collections.shuffle method to shuffle an ArrayList of Longs.

