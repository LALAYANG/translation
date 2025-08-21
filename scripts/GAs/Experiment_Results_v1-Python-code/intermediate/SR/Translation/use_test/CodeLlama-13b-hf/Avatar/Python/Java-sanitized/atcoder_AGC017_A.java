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
        int ans = 0;
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int combi(int N, int K) {
        int a = 1;
        multiply_remaining(0, K, 1);
        divide_factorial(0, K, 1);
        return a;
    }

    public static void multiply_remaining(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a *= calculate_remaining(i, N);
        multiply_remaining(i + step, stop, step);
    }

    public static void divide_factorial(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        a /= j + 1;
        divide_factorial(j + step, stop, step);
    }

    public static int calculate_remaining(int i, int N) {
        return N - i;
    }
}