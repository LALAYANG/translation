Here is the Java version of the Python code:

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
        int last_max = A.isEmpty() ? 1 : A.get(A.size() - 1);
        for (int i = last_max; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            rec(newA);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, then calls the `rec` method with an empty list. The `rec` method checks if the list `A` has the same length as `N`. If it does, it calculates the sum of `d[i]` for all `i` where `A[b[i] - 1] - A[a[i] - 1] == c[i]`, and updates `res` if this sum is greater than the current value of `res`. If `A` is not the right length, it creates a new list `newA` by appending each integer from `last_max` to `M` to `A`, and calls `rec` with `newA`.

