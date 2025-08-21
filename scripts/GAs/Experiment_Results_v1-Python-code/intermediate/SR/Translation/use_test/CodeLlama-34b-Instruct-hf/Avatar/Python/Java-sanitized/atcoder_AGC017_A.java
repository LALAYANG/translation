import java.util.Scanner;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }

        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }

        int patternA = 0;
        int patternB = 0;
        for (int j = 0; j <= zero; j++) {
            patternB += combination(zero, j);
        }

        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                patternA += combination(one, time);
            }
            time++;
        }

        System.out.println(patternA * patternB);
    }

    public static int combination(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= n - i;
        }
        for (int i = 0; i < k; i++) {
            result /= i + 1;
        }
        return result;
    }
}