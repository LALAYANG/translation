
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            a.add(scanner.nextInt());
            b.add(scanner.nextInt());
            c.add(scanner.nextInt());
            d.add(scanner.nextInt());
        }
        System.out.println(solve(arrayLength, M, Q, a, b, c, d));
    }

    public static int solve(int arrayLength, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        int res = 0;
        List<Integer> A = new ArrayList<>();
        rec(A, arrayLength, M, Q, a, b, c, d, res);
        return res;
    }

    public static void rec(List<Integer> A, int arrayLength, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d, int res) {
        if (A.size() == arrayLength) {
            int ans = 0;
            for (int i = 0; i < Q; i++) {
                if (A.get(b.get(i) - 1) - A.get(a.get(i) - 1) == c.get(i)) {
                    ans += d.get(i);
                }
            }
            res = Math.max(res, ans);
            return;
        }
        int previousMaxValue = 1;
        for (int i = previousMaxValue; i <= M; i++) {
            List<Integer> newA = new ArrayList<>(A);
            newA.add(i);
            rec(newA, arrayLength, M, Q, a, b, c, d, res);
        }
    }
}
```
Note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should produce the same output as the Python code for the given input.
