```java
import java.util.*;

public class Main {
    static int array_size, M, Q, res = 0;
    static int[] a, b, c, d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        array_size = sc.nextInt();
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
        solve(new ArrayList<>());
        System.out.println(res);
    }

    static void solve(List<Integer> A) {
        if (A.size() == array_size) {
            int ans = 0;
            scoreCalculator(0, Q, 1, A, ans);
            res = Math.max(res, ans);
            return;
        }
        int last_max = A.isEmpty() ? 1 : A.get(A.size() - 1);
        for (int i = last_max; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            solve(newA);
        }
    }

    static void scoreCalculator(int i, int stop, int step, List<Integer> A, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
            ans += d[i];
        }
        scoreCalculator(i + step, stop, step, A, ans);
    }
}
```

