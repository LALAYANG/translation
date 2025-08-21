import java.util.*;

public class atcoder_ABC147_D {
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