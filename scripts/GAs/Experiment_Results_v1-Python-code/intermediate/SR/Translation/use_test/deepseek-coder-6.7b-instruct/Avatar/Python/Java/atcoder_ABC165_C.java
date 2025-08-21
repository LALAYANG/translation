```java
import java.util.*;

public class Main {
    static int res = 0;
    static int array_size;
    static int M;
    static int Q;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        M = scanner.nextInt();
        Q = scanner.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        solve(array_size, M, Q, a, b, c, d);
        System.out.println(res);
    }

    public static void solve(int array_size, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        recursive_function(new ArrayList<>());
    }

    public static void recursive_function(List<Integer> A) {
        if (A.size() == array_size) {
            int ans = 0;
            score_calculator(A, 0, Q, 1, ans);
            res = Math.max(res, ans);
            return;
        }
        int last_max = A.size() == 0 ? 1 : A.get(A.size() - 1);
        for (int i = last_max; i <= M; i++) {
            A.add(i);
            recursive_function(new ArrayList<>(A));
            A.remove(A.size() - 1);
        }
    }

    public static void score_calculator(List<Integer> A, int i, int stop, int step, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
            ans += d[i];
        }
        score_calculator(A, i + step, stop, step, ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input from the standard input, and then it calls the `solve` function to calculate the result. The `solve` function uses recursion to generate all possible arrays of size `array_size`, and for each of these arrays, it calculates the score using the `score_calculator` function. The maximum score is stored in the `res` variable.

