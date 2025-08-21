import java.util.*;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            double angle = Math.atan2(X[i] - X[0], Y[i] - Y[0]);
            System.out.println(angle / (2 * Math.PI));
        }
    }
}