import java.util.Scanner;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ls = new int[N];
        for (int i = 0; i < N; i++) {
            ls[i] = arr[i] % 2;
        }
        int one = ls.length - ls.length;
        int zero = ls.length - ls.length;
        for (int i = 0; i < ls.length; i++) {
            if (ls[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int even_combinations = 0;
        for (int i = 0; i <= zero; i++) {
            even_combinations += combi(zero, i);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * even_combinations);
    }

    public static int combi(int N, int K) {
        int a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}