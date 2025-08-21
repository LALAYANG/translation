import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        long[] A = new long[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextLong();
        }
        long result = 0;
        int outer_loop_start = 954;
        int outer_loop_end = 953;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_start / outer_loop_end; LoopIndexOut++) {
            for (int b = 0; b < 60; b++) {
                long bs = 0;
                for (int i = 0; i < array_size; i++) {
                    bs += (A[i] >> b & 1);
                }
                result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
            }
        }
        System.out.println(result);
    }
}