import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();

        for (int i = 0; i < Q; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
            c.add(scanner.nextInt());
            d.add(scanner.nextInt());
        }

        solve(N, M, Q, a, b, c, d);
    }

    public static void solve(int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        int res = 0;

        for (int i = 0; i < N; i++) {
            int ans = 0;
            for (int j = 0; j < Q; j++) {
                if (b.get(j) - a.get(j) == c.get(j)) {
                    ans += d.get(j);
                }
            }
            res = Math.max(res, ans);
        }

        System.out.println(res);
    }
}