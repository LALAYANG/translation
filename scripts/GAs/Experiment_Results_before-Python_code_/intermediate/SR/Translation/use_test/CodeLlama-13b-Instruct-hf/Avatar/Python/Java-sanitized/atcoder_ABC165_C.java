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
        System.out.println(solve(N, M, Q, a, b, c, d));
    }

    public static int solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        for (int i = 0; i < Q; i++) {
            if (a[i] == b[i]) {
                res += d[i];
            } else {
                int diff = c[i] - (a[i] - b[i]);
                if (diff > 0) {
                    res += d[i] * diff;
                }
            }
        }
        return res;
    }
}