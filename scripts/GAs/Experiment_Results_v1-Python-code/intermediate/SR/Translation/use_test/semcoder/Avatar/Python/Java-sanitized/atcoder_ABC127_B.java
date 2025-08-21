import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int common_ratio, principal, x;
        common_ratio = 5;
        principal = 1;
        x = 200;
        outer_loop(0, 223, 1);
    }

    private static void outer_loop(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        inner_loop(2, 12, 1);
        outer_loop(LoopIndexOut + step, stop, step);
    }

    private static void inner_loop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        System.out.println(int common_ratio ** (i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio));
        inner_loop(i + step, stop, step);
    }
}