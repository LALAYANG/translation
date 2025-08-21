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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            int ans = 0;
            for (int j = 0; j < Q; j++) {
                if (A[b[j] - 1] - A[a[j] - 1] == c[j]) {
                    ans += d[j];
                }
            }
            res = Math.max(res, ans);
            int last_max = i == 0 ? 1 : A[i - 1];
            for (int j = last_max; j <= M; j++) {
                A[i] = j;
                i++;
                i--;
            }
        }
        System.out.println(res);
    }
}