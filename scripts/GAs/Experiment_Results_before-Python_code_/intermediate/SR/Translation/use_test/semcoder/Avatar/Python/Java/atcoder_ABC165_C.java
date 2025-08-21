Thought process:
1. Define a recursive function to generate all possible permutations of integers from 1 to M for N elements.
2. For each permutation, calculate the total points based on the conditions provided.
3. Update the result with the maximum points obtained.
4. Print the final result.

```java
import java.util.*;

public class Main {
    static int N, M, Q;
    static int[] a, b, c, d;

    static void solve(List<Integer> A) {
        if (A.size() == N) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                    ans += d[i];
                }
            }
            System.out.println(ans);
            return;
        }
        int lastMax = A.isEmpty() ? 1 : A.get(A.size() - 1);
        for (int i = lastMax; i <= M; i++) {
            A.add(i);
            solve(A);
            A.remove(A.size() - 1);
        }
    }

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
        solve(new ArrayList<>());
    }
}
```
