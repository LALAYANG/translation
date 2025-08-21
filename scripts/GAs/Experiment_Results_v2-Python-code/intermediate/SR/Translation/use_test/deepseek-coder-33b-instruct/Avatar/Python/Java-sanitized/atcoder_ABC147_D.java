import java.util.Scanner;

public class atcoder_ABC147_D {
    static int array_size;
    static int[] A;
    static long result = 0;
    static int outer_loop_start = 954;
    static int outer_loop_end = 953;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextInt();
        }
        iterate_outer_loop(0, outer_loop_start / outer_loop_end, 1);
        System.out.println(result);
    }

    static void iterate_outer_loop(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        calculate_bitwise_contribution(0, 60, 1);
        iterate_outer_loop(LoopIndexOut + step, stop, step);
    }

    static void calculate_bitwise_contribution(int b, int stop, int step) {
        if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
            return;
        }
        int bs = 0;
        for (int i = 0; i < array_size; i++) {
            bs += (A[i] >> b & 1);
        }
        result = (result + bs * (array_size - bs) * (1 << b)) % 1000000007;
        calculate_bitwise_contribution(b + step, stop, step);
    }
}