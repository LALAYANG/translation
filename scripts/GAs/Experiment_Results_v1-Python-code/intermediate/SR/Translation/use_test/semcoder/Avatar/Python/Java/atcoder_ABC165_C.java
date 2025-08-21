Thought process:
1. Understand the recursive function and how it calculates the score.
2. Implement the recursive function to generate all possible permutations of array elements.
3. Calculate the score for each permutation and update the result.
4. Print the maximum score obtained.

```java
import java.util.*;

public class Main {
    static int res = 0;

    static void recursive_function(int[] A, int array_size, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        if (A.length == array_size) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                    ans += d[i];
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int last_max = A.length == 0 ? 1 : A[A.length - 1];
        for (int i = last_max; i <= M; i++) {
            int[] newA = Arrays.copyOf(A, A.length + 1);
            newA[A.length] = i;
            recursive_function(newA, array_size, M, Q, a, b, c, d);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
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
        recursive_function(new int[0], array_size, M, Q, a, b, c, d);
        System.out.println(res);
    }
}
```
