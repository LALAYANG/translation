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
        int evenCombinations = 0;
        for (int i = 0; i <= one; i++) {
            if (i % 2 == P) {
                patternA += combi(one, i);
            }
        }

        for (int i = 0; i <= zero; i++) {
            evenCombinations += combi(zero, i);
        }

        System.out.println(patternA * evenCombinations);
    }

    public static int combi(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return combi(n - 1, k - 1) + combi(n - 1, k);
    }
}