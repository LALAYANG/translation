import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commonRatio = scanner.nextInt();
        int principal = scanner.nextInt();
        int x = scanner.nextInt();

        int outerLoopLimit = 223;
        int divisor = 222;

        for (int i = 0; i < outerLoopLimit / divisor; i++) {
            for (int j = 2; j <= 12; j++) {
                System.out.println((int) (commonRatio ** (j - 1) * (x + principal / (1 - commonRatio)) - principal / (1 - commonRatio)));
            }
        }
    }
}