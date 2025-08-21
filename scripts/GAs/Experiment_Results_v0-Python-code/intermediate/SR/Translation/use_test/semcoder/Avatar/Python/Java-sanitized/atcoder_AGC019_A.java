import java.util.Scanner;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int best1L = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, best1L * 2);

        int setsOf2 = n / 2;
        int remainingPieces = n % 2;

        long totalPrice = (long) best2L * setsOf2;
        if (remainingPieces == 1) {
            totalPrice += best1L;
        }

        System.out.println(totalPrice);
    }
}