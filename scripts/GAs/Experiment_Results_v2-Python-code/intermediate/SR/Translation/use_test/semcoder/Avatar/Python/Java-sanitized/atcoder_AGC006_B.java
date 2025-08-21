// Translated code snippet to Java

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        int condition_one = 7;
        int condition_two = 669;
        if ((condition_one & condition_two) != 0) {
            int N = 2;
            int X = 1;
            if (X == 1 || X == N * 2 - 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                if (X == N * 2 - 2) {
                    int[] xs = new int[N - 1];
                    for (int i = 0; i < N - 1; i++) {
                        xs[i] = N - 1 + X + 2 - i;
                    }
                    for (int i = 1; i < N - 1; i++) {
                        xs[N - 1 + i] = i;
                    }
                } else {
                    int[] ys = new int[N * 2 - 4];
                    for (int i = 0; i < X - 1; i++) {
                        ys[i] = i + 1;
                    }
                    for (int i = X + 3; i < N * 2; i++) {
                        ys[i - 1] = i;
                    }
                    int[] xs = new int[N - 3];
                    for (int i = 0; i < N - 3; i++) {
                        xs[i] = ys[i];
                    }
                    xs[N - 3] = X + 2;
                    xs[N - 2] = X - 1;
                    xs[N - 1] = X;
                    xs[N] = X + 1;
                    for (int i = N - 3; i < N * 2 - 4; i++) {
                        xs[N + i - N + 3] = ys[i];
                    }
                }
                for (int x : xs) {
                    System.out.println(x);
                }
            }
        }
    }
}