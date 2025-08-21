```java
import java.util.*;

public class Main {
    static int N, M, Q;
    static int[] a, b, c, d;
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        rec(new ArrayList<>());
        System.out.println(res);
    }

    static void rec(List<Integer> A) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int lastMax = A.size() == 0 ? 1 : A.get(A.size() - 1);
        for (int i = lastMax; i <= M; i++) {
            A.add(i);
            rec(new ArrayList<>(A));
            A.remove(A.size() - 1);
        }
    }
}
```

This Java code is a direct translation of the Python code you provided. It uses recursion to generate all possible combinations of numbers from 1 to M, with a length of N, and for each combination, it checks if the difference between the numbers at positions a[i] and b[i] equals c[i], if so, it adds d[i] to ans. The maximum value of ans is then compared with the current maximum value of res and updated if necessary.

