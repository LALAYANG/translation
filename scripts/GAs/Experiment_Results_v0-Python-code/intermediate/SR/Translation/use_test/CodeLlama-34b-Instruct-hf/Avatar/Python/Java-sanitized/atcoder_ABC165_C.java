import java.util.Scanner;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];

        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }

        int res = solve(N, M, Q, a, b, c, d);
        System.out.println(res);
    }

    public static int solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;

        for (int i = 0; i < Q; i++) {
            int ans = 0;

            for (int j = 0; j < N; j++) {
                if (a[i] <= j && j <= b[i] && c[i] == d[i]) {
                    ans += d[i];
                }
            }

            res = Math.max(res, ans);
        }

        return res;
    }
}