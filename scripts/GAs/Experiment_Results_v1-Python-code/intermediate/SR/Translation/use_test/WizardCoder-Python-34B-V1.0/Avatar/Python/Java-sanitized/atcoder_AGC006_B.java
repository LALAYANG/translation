import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int check_condition_two = 509;
        int check_condition_one = 327;

        if ((check_condition_two & check_condition_one) != 0) {
            if (X == 1 || X == N * 2 - 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                if (X == N * 2 - 2) {
                    int[] xs = new int[N - 1];
                    for (int i = 0; i < N - 1; i++) {
                        xs[i] = i + 1;
                    }
                    xs = Arrays.copyOf(xs, N - 1);
                    xs = Arrays.copyOf(xs, N * 2);
                    for (int i = N - 1; i < N * 2; i++) {
                        xs[i] = i + 1;
                    }
                    for (int x : xs) {
                        System.out.println(x);
                    }
                } else {
                    int[] ys = new int[N - 3];
                    for (int i = 0; i < N - 3; i++) {
                        ys[i] = i + 1;
                    }
                    ys = Arrays.copyOf(ys, N - 1);
                    ys[N - 3] = X + 2;
                    ys[N - 2] = X - 1;
                    ys[N - 1] = X;
                    ys[N] = X + 1;
                    for (int i = N + 1; i < N * 2 - 2; i++) {
                        ys[i] = i + 1;
                    }
                    for (int x : ys) {
                        System.out.println(x);
                    }
                }
            }
        }
    }
}