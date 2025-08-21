import java.util.*;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long xor_sum = 0;
        Arrays.shuffle(A);

        for (int b = 0; b < 60; b++) {
            int bit_count = 0;
            for (int i = 0; i < array_size; i++) {
                if ((A[i] >> b & 1) != 0) {
                    bit_count++;
                }
            }
            xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << b)) % 1000000007;
        }
        System.out.println(xor_sum);
    }
}