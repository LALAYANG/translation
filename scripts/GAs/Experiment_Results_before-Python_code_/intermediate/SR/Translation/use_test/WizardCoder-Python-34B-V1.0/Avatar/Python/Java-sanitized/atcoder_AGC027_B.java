import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        ArrayList<Integer> S = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A.get(i);
            S.add(sum);
        }
        double ans = Double.POSITIVE_INFINITY;
        for (int k = 1; k <= N; k++) {
            int E = k * X + 2 * sum(S, N - 2 * k - 1, -k);
            ans = Math.min(ans, E);
        }
        System.out.println((int) (ans + N * X + 5 * S.get(N - 1));
    }

    public static int sum(ArrayList<Integer> S, int start, int step) {
        int sum = 0;
        for (int i = start; i >= 0; i += step) {
            sum += S.get(i);
        }
        return sum;
    }
}