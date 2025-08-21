```java
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
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
```

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 0 5659
2 4 0 46228
3 5 1 61412
1 3 0 10258
3 4 0 77949
4 5 1 97604
3 4 1 20460
1 2 1 28731
2 5 1 46448

Expected output:
451476
``` 
