
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
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

        solve(N, M, Q, a, b, c, d);
    }

    public static void solve(int N, int M, int Q, List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        int res = 0;

        for (int i = 0; i < N; i++) {
            int ans = 0;
            for (int j = 0; j < Q; j++) {
                if (b.get(j) - a.get(j) == c.get(j)) {
                    ans += d.get(j);
                }
            }
            res = Math.max(res, ans);
        }

        System.out.println(res);
    }
}
```
This code uses the same logic as the Python code, with a few minor differences in syntax and data structures. The `solve` method is the same as the Python function, and it uses a nested loop to iterate over the queries and calculate the maximum value. The `main` method is also similar, but it uses Java's `Scanner` class to read input from the console, and it uses `ArrayList` instead of Python's `list` data structure.
