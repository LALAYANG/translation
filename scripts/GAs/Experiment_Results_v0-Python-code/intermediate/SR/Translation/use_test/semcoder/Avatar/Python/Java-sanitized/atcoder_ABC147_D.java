import java.util.Scanner;

public class atcoder_ABC147_D {
    static int array_size;
    static long[] A;
    static long xor_sum = 0;

    public static void calculate_xor_sum(int b, int stop, int step) {
        if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
            return;
        }
        long bit_count = countBits(A, b);
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1L << b)) % 1000000007;
        calculate_xor_sum(b + step, stop, step);
    }

    private static long countBits(long[] arr, int bitIndex) {
        long count = 0;
        for (long num : arr) {
            count += (num >> bitIndex & 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextLong();
        }
        calculate_xor_sum(0, 60, 1);
        System.out.println(xor_sum);
    }
}