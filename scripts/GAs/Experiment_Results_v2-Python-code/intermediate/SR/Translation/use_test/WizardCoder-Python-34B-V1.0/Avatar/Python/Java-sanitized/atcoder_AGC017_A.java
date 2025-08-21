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

        int zero = 0;
        int one = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }

        int even_combinations = 0;
        for (int i = 0; i <= zero; i++) {
            even_combinations += factorial(zero, i);
        }

        int pattern_a = 0;
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += factorial(one, time);
            }
            time++;
        }

        System.out.println(pattern_a * even_combinations);
    }

    public static int factorial(int n, int k) {
        int result = 1;
        for (int i = n - k + 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}