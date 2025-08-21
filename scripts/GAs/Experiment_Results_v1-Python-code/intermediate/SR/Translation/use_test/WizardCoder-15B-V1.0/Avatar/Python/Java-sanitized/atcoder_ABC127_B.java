import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int common_ratio = sc.nextInt();
        int principal = sc.nextInt();
        int x = sc.nextInt();
        int outer_loop_limit = 223;
        int divisor = 222;

        for (int i = 0; i < outer_loop_limit / divisor; i++) {
            for (int j = 2; j <= 12; j++) {
                System.out.println(Math.round(Math.pow(common_ratio, j - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)));
            }
        }
    }
}