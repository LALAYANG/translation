import java.util.Scanner;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int a : lis) {
            if (a % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            int a = 1;
            for (int i = 0; i < zero - j; i++) {
                a *= zero - i;
            }
            for (int i = 1; i <= j; i++) {
                a /= i;
            }
            pattern_b += a;
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                int b = 1;
                for (int i = 0; i < one - time; i++) {
                    b *= one - i;
                }
                for (int i = 1; i <= time; i++) {
                    b /= i;
                }
                pattern_a += b;
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }
}