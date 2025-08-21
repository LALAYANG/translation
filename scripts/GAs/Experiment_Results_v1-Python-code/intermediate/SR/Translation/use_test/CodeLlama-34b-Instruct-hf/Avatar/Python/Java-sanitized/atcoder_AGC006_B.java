import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if (checkConditionTwo(N, X) && checkConditionOne(N, X)) {
            if (X == 1 || X == N * 2 - 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                if (X == N * 2 - 2) {
                    int[] xs = new int[N - 1];
                    for (int i = 0; i < N - 1; i++) {
                        xs[i] = i + 1;
                    }
                    xs[N - 2] = X + 2;
                    xs[N - 1] = X - 1;
                    xs[N] = X;
                    xs[N + 1] = X + 1;
                    for (int x : xs) {
                        System.out.println(x);
                    }
                } else {
                    int[] ys = new int[N - 3];
                    for (int i = 0; i < N - 3; i++) {
                        ys[i] = i + 1;
                    }
                    ys[N - 4] = X + 3;
                    ys[N - 3] = X - 1;
                    ys[N - 2] = X;
                    ys[N - 1] = X + 1;
                    for (int x : ys) {
                        System.out.println(x);
                    }
                }
            }
        }
    }

    private static boolean checkConditionTwo(int N, int X) {
        return (N % 2 == 0 && X % 2 == 0) || (N % 2 == 1 && X % 2 == 1);
    }

    private static boolean checkConditionOne(int N, int X) {
        return X >= 1 && X <= N * 2 - 1;
    }
}