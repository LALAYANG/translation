import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double common_ratio = Double.parseDouble(input[0]);
        double principal = Double.parseDouble(input[1]);
        double x = Double.parseDouble(input[2]);
        int outer_loop_limit = 223;
        int divisor = 222;

        for (int LoopIndexOut = 0; LoopIndexOut * divisor <= outer_loop_limit; LoopIndexOut++) {
            for (int i = 2; i < 12; i++) {
                System.out.println((int) (Math.pow(common_ratio, i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio));
            }
        }
    }
}