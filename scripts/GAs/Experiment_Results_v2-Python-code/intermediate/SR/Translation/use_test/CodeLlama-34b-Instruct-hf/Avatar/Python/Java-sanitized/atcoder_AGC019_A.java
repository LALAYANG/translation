import java.util.Scanner;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int h = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int minOneLiterCost = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, minOneLiterCost * 2);

        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + minOneLiterCost);
        }
    }
}