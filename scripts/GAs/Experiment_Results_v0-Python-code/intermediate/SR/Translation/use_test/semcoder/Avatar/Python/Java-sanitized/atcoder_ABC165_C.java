import java.util.Scanner;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];

        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        int res = 0;
        solve(N, M, Q, a, b, c, d, res);
        System.out.println(res);
    }

    public static void solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int res) {
        // Implement the logic here
    }
}