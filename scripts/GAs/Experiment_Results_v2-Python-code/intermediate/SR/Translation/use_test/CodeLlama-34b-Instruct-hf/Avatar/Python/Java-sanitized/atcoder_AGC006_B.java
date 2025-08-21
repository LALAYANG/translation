import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if (N == 1) {
            System.out.println("No");
            return;
        }

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");

        int[] xs = new int[N - 2];
        for (int i = 0; i < N - 2; i++) {
            xs[i] = i + 2;
        }

        if (X == N * 2 - 2) {
            xs[N - 3] = X + 2;
            xs[N - 2] = X - 1;
            xs[N - 1] = X;
            xs[0] = X + 1;
        } else {
            int ys = X - 1;
            int zs = X + 1;
            for (int i = 0; i < N - 3; i++) {
                xs[i] = ys;
                ys = zs;
                zs = xs[i + 1];
            }
            xs[N - 3] = X + 2;
            xs[N - 2] = X - 1;
            xs[N - 1] = X;
            xs[0] = X + 1;
        }

        for (int x : xs) {
            System.out.println(x);
        }
    }
}