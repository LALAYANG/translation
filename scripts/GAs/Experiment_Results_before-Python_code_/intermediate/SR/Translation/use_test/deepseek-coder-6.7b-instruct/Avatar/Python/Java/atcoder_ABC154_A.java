```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();
        solve(S, T, A, B, U);
    }

    public static void solve(String S, String T, int A, int B, String U) {
        if (S.equals(U)) {
            A--;
        }
        if (T.equals(U)) {
            B--;
        }
        System.out.println(A + " " + B);
    }
}
```

In this Java code, we use a `Scanner` to read the input from the standard input. The `solve` method is similar to the Python function. It checks if the input string `U` is equal to `S` or `T`, and if so, it decrements the corresponding integer `A` or `B`. The result is then printed to the standard output.

