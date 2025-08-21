import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] newb_1 = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            newb_1[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        solve(N, M, Q, a, newb_1, c, d);
    }

    public static void solve(int N, int M, int Q, int[] a, int[] newb_1, int[] c, int[] d) {
        int res = 0;

        void rec(int[] A) {
            if (A.length == N) {
                int ans = 0;
                for (int i = 0; i < Q; i++) {
                    if (A[newb_1[i] - 1] - A[a[i] - 1] == c[i]) {
                        ans += d[i];
                    }
                }
                res = Math.max(res, ans);
                return;
            }
            int last_max = A.length == 0 ? 1 : A[A.length - 1];
            for (int i = last_max; i <= M; i++) {
                rec(append(A, i));
            }
        }

        int[] append(int[] arr, int value) {
            int[] newArr = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[arr.length] = value;
            return newArr;
        }

        rec(new int[0]);
        System.out.println(res);
    }
}