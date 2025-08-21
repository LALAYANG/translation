import java.util.Scanner;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_length = scanner.nextInt();
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
        int res = solve(array_length, M, Q, a, b, c, d);
        System.out.println(res);
    }

    public static int solve(int array_length, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        for (int i = 0; i < Q; i++) {
            if (c[i] == 0) {
                res += d[i];
            }
        }
        return res;
    }
}