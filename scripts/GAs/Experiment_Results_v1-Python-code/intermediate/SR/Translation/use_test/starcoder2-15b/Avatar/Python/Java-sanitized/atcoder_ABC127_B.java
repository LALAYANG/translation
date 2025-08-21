import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int common_ratio = scanner.nextInt();
        int principal = scanner.nextInt();
        int x = scanner.nextInt();
        int outer_loop_limit = 223;
        int divisor = 222;

        for (int LoopIndexOut = 0; LoopIndexOut <= outer_loop_limit / divisor; LoopIndexOut++) {
            for (int i = 2; i <= 12; i++) {
                System.out.println((int) (Math.pow(common_ratio, i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)));
            }
        }
    }
}