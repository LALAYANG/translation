import java.util.*;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextInt();
        }
        long result = 0;
        int outer_loop_start = 954;
        int outer_loop_end = 953;

        for (int LoopIndexOut = 0; (LoopIndexOut < outer_loop_start / outer_loop_end) || (LoopIndexOut > outer_loop_start / outer_loop_end); LoopIndexOut++) {
            for (int b = 0; b < 60; b++) {
                int bs = 0;
                for (int i = 0; i < array_size; i++) {
                    if ((A[i] >> b & 1) == 1) {
                        bs++;
                    }
                }
                result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
            }
        }
        System.out.println(result);
    }
}